package com.inetpsa.anyface.animations

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.fixedRateTimer


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fadeIn = findViewById<Button>(R.id.fade_in)
        val fadeOut = findViewById<Button>(R.id.fade_out)
        val zoomIn = findViewById<Button>(R.id.zoom_in)
        val zoomOut = findViewById<Button>(R.id.zoom_out)
        val slideDown = findViewById<Button>(R.id.slide_down)
        val slideUp = findViewById<Button>(R.id.slide_down)
        val bounce = findViewById<Button>(R.id.bounce)
        val rotate = findViewById<Button>(R.id.rotate)

        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)

        fadeIn.setOnClickListener {
            textView.visibility = View.VISIBLE
            textView2.visibility = View.VISIBLE
            textView3.visibility = View.VISIBLE
            val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)


            fixedRateTimer("timer",false,0,700){
                this@MainActivity.runOnUiThread {
                    textView.startAnimation(animationFadeIn)
                }
            }
            fixedRateTimer("timer",false,700,700){
                this@MainActivity.runOnUiThread {
                    textView2.startAnimation(animationFadeIn)
                }
            }//hola
            fixedRateTimer("timer",false,1400,700){
                this@MainActivity.runOnUiThread {
                    textView3.startAnimation(animationFadeIn)
                }
            }
        }
        fadeOut.setOnClickListener {
            val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            textView.startAnimation(animationFadeOut)
            textView2.startAnimation(animationFadeOut)
            textView3.startAnimation(animationFadeOut)
            Handler().postDelayed({
                textView.visibility = View.GONE
                textView2.visibility = View.GONE
                textView3.visibility = View.GONE
            }, 1000)
        }
        zoomIn.setOnClickListener {
            val animationZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            textView.startAnimation(animationZoomIn)
            textView2.startAnimation(animationZoomIn)
            textView3.startAnimation(animationZoomIn)
        }
        zoomOut.setOnClickListener {
            val animationZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            textView.startAnimation(animationZoomOut)
            textView2.startAnimation(animationZoomOut)
            textView3.startAnimation(animationZoomOut)
        }
        slideDown.setOnClickListener {
            val animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_in)
            textView.startAnimation(animationSlideDown)
            textView2.startAnimation(animationSlideDown)
            textView3.startAnimation(animationSlideDown)
        }
        slideUp.setOnClickListener {
            val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_out)
            textView.startAnimation(animationSlideUp)
            textView2.startAnimation(animationSlideUp)
            textView3.startAnimation(animationSlideUp)
        }
        bounce.setOnClickListener {
            val animationBounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
            textView.startAnimation(animationBounce)
            textView2.startAnimation(animationBounce)
            textView3.startAnimation(animationBounce)
        }
        rotate.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
            textView.startAnimation(animationRotate)
            textView2.startAnimation(animationRotate)
            textView3.startAnimation(animationRotate)
        }
    }
}