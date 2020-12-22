package com.yuanfen.cardgame

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.yuanfen.cardgame.card.Cards
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cards: Cards = Cards(resources)

        val cardList = cards.initCards()

        val imageViews: Array<ImageView?> = arrayOfNulls<ImageView>(cardList.size)
        for (i in imageViews.indices) {
            val imageView = ImageView(this)
            imageView.setLayoutParams(
                LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT
                )
            )
            imageViews[i] = imageView
            imageView.setImageBitmap(cardList[i])
            viewGroup.addView(imageView)
        }



    }
}