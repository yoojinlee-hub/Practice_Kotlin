package com.example.camera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.core.content.FileProvider
import java.io.File

private const val REQUEST_CODE_FOR_IMAGE_CAPTURE = 100
private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var photoFile: File

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.camera.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if(intent.resolveActivity(packageManager) != null){
                val dir = externalCacheDir
                val file = File.createTempFile("photo_",".jpg",dir)
                val uri = FileProvider.getUriForFile(this, "$packageName.provider",file)
                intent.putExtra(MediaStore.EXTRA_OUTPUT,uri)
                startActivityForResult(intent, REQUEST_CODE_FOR_IMAGE_CAPTURE)
                photoFile = file
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode){
            REQUEST_CODE_FOR_IMAGE_CAPTURE -> {
                if(resultCode == RESULT_OK){
                    Glide.with(this).load(photoFile).into(binding.image)
                }else{
                    Toast.makeText(this,"취소 되었습니다", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}