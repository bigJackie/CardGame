package com.yuanfen.cardgame.card

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.yuanfen.cardgame.R

class Cards(private val resources: Resources) {

    fun initCards(): MutableList<Bitmap> {
        var cardList: MutableList<Bitmap> = ArrayList()
        val cardSplitter = CardSplitter()
        val card2 = BitmapFactory.decodeResource(resources, R.drawable.card2)
        var cardsList2 = cardSplitter.split(card2,4,7)
        if (cardsList2 != null) {
            for (i in 0 until cardsList2.size) {
                cardList.add(cardsList2.get(i).bitmap!!)

            }
        }
        val card1 = BitmapFactory.decodeResource(resources, R.drawable.card1)
        var cardsList1 = cardSplitter.split(card1,4,7)
        if (cardsList1 != null) {
            for (i in 0 until cardsList1.size) {
                cardList.add(cardsList1.get(i).bitmap!!)

            }
        }
        return cardList
    }

}