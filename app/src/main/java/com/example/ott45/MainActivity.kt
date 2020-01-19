package com.example.ott45

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            GlobalScope.launch {
                withContext(Dispatchers.Main) {
                    manageImage1()
                    manageImage2()
                    manageImage3()
                    manageImage4()
                    manageImage5()
                    manageImage6()
                    manageImage7()
                }

            }





        }

    }

    private  suspend fun manageImage1() {
        // delay(1000)
        imageView1.setImageResource(R.drawable.bet0)
        var avd1 = imageView1.drawable as AnimatedVectorDrawable
        avd1.start()
    }
    private suspend fun manageImage2() {
        delay(1000)
        imageView2.setImageResource(R.drawable.vav0)
        var avd2 = imageView2.drawable as AnimatedVectorDrawable
        avd2.start()
    }
    private suspend fun manageImage3() {
        delay(2000)
        imageView3.setImageResource(R.drawable.alleff0)
        var avd3 = imageView3.drawable as AnimatedVectorDrawable
        avd3.start()
    }
    private suspend fun manageImage4() {
        delay(3000)
        imageView4.setImageResource(R.drawable.non0)
        var avd4 = imageView4.drawable as AnimatedVectorDrawable
        avd4.start()
    }
    private suspend fun manageImage5() {
        delay(4000)
        imageView5.setImageResource(R.drawable.yod0)
        var avd5 = imageView5.drawable as AnimatedVectorDrawable
        avd5.start()
    }
    private suspend fun manageImage6() {
        delay(5000)
        imageView6.setImageResource(R.drawable.hai0)
        var avd6 = imageView6.drawable as AnimatedVectorDrawable
        avd6.start()
    }
    private suspend fun manageImage7() {
        delay(6000)
        imageView7.setImageResource(R.drawable.lamed0)
        var avd7 = imageView7.drawable as AnimatedVectorDrawable
        avd7.start()
    }
}
