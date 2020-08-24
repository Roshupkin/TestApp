package android.bignerdranch.testapp.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val x1 = 10f
    private val y1 = 4f
    private val x2 = 1000f
    private val y2 = 1000f

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.BLACK
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 20f

        canvas?.drawLine(x1, y1, x2, y2, paint)
        canvas?.drawRect(x1, y1, x2, y2, paint)
        canvas?.drawRoundRect(x1, y1, x2, y2,45f,45f, paint)
    }
}