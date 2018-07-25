package br.com.packapps.customviewcanvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.os.Build
import android.support.annotation.Nullable
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout

class LinearLayoutLogin : View {

    @JvmOverloads
    constructor(
            context: Context,
            attributeSet: AttributeSet? = null,
            defStyleAttr : Int = 0
                ) : super(context, attributeSet, defStyleAttr)

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(
            context: Context,
            attributeSet: AttributeSet?,
            defStyleAttr: Int,
            defStylesRes : Int
            ) : super(context, attributeSet, defStyleAttr, defStylesRes)


    var paint : Paint? = null

    init {
            paint = Paint()
            paint!!.style = Paint.Style.FILL
            paint!!.color = Color.BLACK
            paint!!.strokeWidth = 5f
    }










    override fun onDraw(canvas: Canvas?) {
//        super.onDraw(canvas)

        var paint = Paint()
        paint!!.style = Paint.Style.FILL
        paint!!.color = Color.BLACK
        paint!!.strokeWidth = 5f

        var path = Path()
        path.lineTo(0f, 400f)
        path.cubicTo(0f, 400f, 0f, 750f, 700f, 750f)
        path.cubicTo(700f, 750f, 950f, 750f, 1500f, 1300f)

        canvas!!.drawPath(path, paint)




    }




}