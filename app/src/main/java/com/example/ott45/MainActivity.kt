package com.example.ott45

import android.content.res.Resources
import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    var contor = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.visibility = View.INVISIBLE


        linesHelper(0)
        setParams(worldLayout1, 250, 380, 0, 0, 0, 500)

      //  worldLayout1.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)

        CoroutineScope(IO).launch {
            drawLetter1(1, "ה")
            drawLetter1(2, "א")
            drawLetter1(3, "ו")
            drawLetter1(4, "ר")

        }

    }

    private fun individiualPatam(view: View) {
        when (contor) {
            1 -> setParams(view, 150, 150, 0, 0, 15, 35)
            2 -> setParams(view, 180, 180, 0, 0, 110, 55)
            3 -> setParams(view, 170, 170, 0, 0, 170, 50)
            4 -> setParams(view, 160, 160, 0, 0, 230, 10)
        }

    }

    private fun setWordLayout(worldLayout: ConstraintLayout?, mTop: Int) {
        setParams(worldLayout1, 0, 0, 0, mTop, 0, 0)

    }

    private fun setParams(
        view: View,
        scaleX: Int,
        scaleY: Int,
        mLeft: Int,
        mTop: Int,
        mRight: Int,
        mBottom: Int
    ) {
        if (scaleX > 0) {
            view.layoutParams.height = scaleX.toPx()
            view.layoutParams.width = scaleY.toPx()
        }
        val param = view.layoutParams as ConstraintLayout.LayoutParams
        param.setMargins(mLeft.toPx(), mTop.toPx(), mRight.toPx(), mBottom.toPx())
        view.layoutParams = param
        view.requestLayout()
    }


    private suspend fun drawLetter1(index: Int, letter: String) {
        contor++
        val view = getView(index) as ImageView
        val address = Helper(this).getAnimation(letter)
        individiualPatam(view)



        withContext(Main) {

            delay(1000)

            view.setImageResource(address)
            val avd = view.drawable as AnimatedVectorDrawable
            avd.start()
        }

    }

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()


    private fun linesHelper(ind: Int) {
        if (ind == 0) {
            upHelperLine.visibility = GONE
            downHelperLine.visibility = GONE
        } else {
            upHelperLine.visibility = VISIBLE
            downHelperLine.visibility = VISIBLE
        }
        setParams(upHelperLine, 0, 0, 0, 50, 0, 0)
        setParams(downHelperLine, 0, 0, 0, 145, 0, 0)
    }

    fun getView(index: Int): View {
        var view: View
        when (index) {
            1 -> view = imageView1
            2 -> view = imageView2
            3 -> view = imageView3
            4 -> view = imageView4
            5 -> view = imageView5
            6 -> view = imageView6
            7 -> view = imageView7
            else -> view = imageView1
        }
        return view
    }

    /* private fun firstSetup() {
           imageView1.layoutParams.height=150.toPx()
           imageView1.layoutParams.width=150.toPx()
           val param=imageView1.layoutParams as LinearLayout.LayoutParams
           param.setMargins(100,0,0,0)
           imageView1.layoutParams=param
       }*/

    private suspend fun manageImage1() {
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


fun activateCurrentLettter(st: String) {

    var currentLetter = st
    val char = st.single()
    var mainIndex = char.toInt() - 1487
}


/* private  void  activateCurrentLetter(String st){
           jumpLine=false;
           currentString=currentString+st;
           wirttenString=wirttenString+st;
           currentLetter = st;
           char ch = currentLetter.charAt ( 0 );
           mainIndex = (int) ch - 1487;
           make_letterImage();
           if (!jumpLine) {
               letterImage.setImageResource ( getAnimation ( st ) );
               letterLayout.addView ( letterImage );
               Drawable d = letterImage.getDrawable ();
               AnimatedVectorDrawableCompat avd = (AnimatedVectorDrawableCompat) d;
               avd.start ();
               startTextView = false;
           }
           ttIndex = mainIndex;
           jumpLine=false;*/