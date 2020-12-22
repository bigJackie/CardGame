package com.yuanfen.cardgame.card

import android.graphics.Bitmap

class CardSplitter {

    fun split(bitmap: Bitmap, x: Int, y: Int): List<CardPiece>? {
        val pieces: MutableList<CardPiece> = ArrayList<CardPiece>()
        val width = bitmap.width
        val height = bitmap.height
        val pieceWidth = width / x
        val pieceHeight = height / y
        for (i in 0 until y) {
            for (j in 0 until x) {
                val image = CardPiece()
                image.index = j + i * x
                val xValue = j * pieceWidth
                val yValue = i * pieceHeight
                image.bitmap = Bitmap.createBitmap(bitmap, xValue, yValue,
                        pieceWidth, pieceHeight)
                pieces.add(image)
            }
        }
        return pieces
    }
}