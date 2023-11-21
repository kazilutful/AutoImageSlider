package com.example.imageslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ViewFlipper
import com.example.imageslider.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var images = intArrayOf(R.drawable.slider1,
            R.drawable.slider2,
            R.drawable.slider3)
    for (i in images.indices){
        showImage(images.get(i))
    }
    }
    fun showImage(img: Int){
        var imgView: ImageView
        imgView = ImageView(this)
        imgView.setBackgroundResource(img)

        binding.flipper.addView(imgView)
        binding.flipper.setInAnimation(this, android.R.anim.slide_in_left)
        binding.flipper.setOutAnimation(this, android.R.anim.slide_out_right)
        binding.flipper.startFlipping()
    }
}