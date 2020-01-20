package com.example.ott45

import android.content.Context
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.view.*

class Helper(val context: Context) {

     fun getView(index: Int): View {
        var view: View
        val layout = ConstraintLayout(context)
        with(layout) {
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
        }
        return view
    }


    fun getAnimation(st: String): Int {
        var re = 0
        if (st.equals("א")) re = R.drawable.alleff0
        if (st.equals("ב")) re = R.drawable.bet0;

        if (st.equals("ה")) re = R.drawable.hai0
        if (st.equals("ו")) re = R.drawable.vav0


        if (st.equals("י")) re = R.drawable.yod0

        if (st.equals("ל")) re = R.drawable.lamed0


        if (st.equals("נ")) re = R.drawable.non0

        return re;
    }
}

