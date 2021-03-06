package com.example.ott45

import android.content.Context
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.word1_layout.view.*

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


    fun getAnimation(st: String) = when (st) {
        "א" -> R.drawable.alleff0
        "ב" -> R.drawable.bet0;
        "ג" -> R.drawable.gimel0
        "ד" -> R.drawable.dalet0
        "ה" -> R.drawable.hai0
        "ו" -> R.drawable.vav0
        "ז" -> R.drawable.zain0
        "ח" -> R.drawable.kait0
        "ט" -> R.drawable.tet0
        "י" -> R.drawable.yod0
        "כ" -> R.drawable.kaaf0
        "ל" -> R.drawable.lamed0
        "מ" -> R.drawable.mem0
        "נ" -> R.drawable.non0
        "ס" -> R.drawable.shmech0
        "ע" -> R.drawable.aahin0
        "פ" -> R.drawable.phaii0
        "צ" -> R.drawable.zadik0
        "ק" -> R.drawable.koof0;
        "ר" -> R.drawable.reash0
        "ש" -> R.drawable.sheen0
        "ת" -> R.drawable.taf0
        "ם" -> R.drawable.mem_shofit0
        "ן" -> R.drawable.non_shofit0
        "ץ" -> R.drawable.zhadik_shofit0
        "ף" -> R.drawable.pai_shofit0
        "ך" -> R.drawable.chaff_sofit0

        else -> R.drawable.alleff0

    }


}
/*fun getAnimation(st: String): Int {
    var re = 0
    if (st.equals("א")) re = R.drawable.alleff0
    if (st.equals("ב")) re = R.drawable.bet0;
    if (st.equals("ג")) re = R.drawable.gimel0
    if (st.equals("ד")) re = R.drawable.dalet0
    if (st.equals("ה")) re = R.drawable.hai0
    if (st.equals("ו")) re = R.drawable.vav0
    if (st.equals("ז")) re = R.drawable.zain0
    if (st.equals("ח")) re = R.drawable.kait0
    if (st.equals("ט")) re = R.drawable.tet0
    if (st.equals("י")) re = R.drawable.yod0

    if (st.equals("ל")) re = R.drawable.lamed0


    if (st.equals("נ")) re = R.drawable.non0



    if (st.equals("ר")) re = R.drawable.reash0

    return re;
}*/

/*  if (st.equals("ז")) re = R.drawable.zain;
  if (st.equals("ח")) re = R.drawable.kait;
  if (st.equals("ט")) re = R.drawable.tet;
  if (st.equals("י")) re = R.drawable.yod;
  if (st.equals("כ")) re = R.drawable.kaaf;
  if (st.equals("ל")) re = R.drawable.lamed;
  if (st.equals("מ")) re = R.drawable.mem;
  if (st.equals("נ")) re = R.drawable.non;
  if (st.equals("ס")) re = R.drawable.shmech;
  if (st.equals("ע")) re = R.drawable.aahin;
  if (st.equals("פ")) re = R.drawable.phaii;
  if (st.equals("צ")) re = R.drawable.zadik;
  if (st.equals("ק")) re = R.drawable.koof;
  if (st.equals("ר")) re = R.drawable.reash;
  if (st.equals("ש")) re = R.drawable.sheen;
  if (st.equals("ת")) re = R.drawable.taf;
  if (st.equals("ם")) re = R.drawable.mem_shofit;
  if (st.equals("ן")) re = R.drawable.non_shofit;
  if (st.equals("ץ")) re = R.drawable.zhadik_shofit;
  if (st.equals("ף")) re = R.drawable.pai_shofit;
  if (st.equals("ך")) re = R.drawable.chaff_sofit;*/
//}

