package br.com.packapps.customviewcanvas

import android.app.Activity
import android.content.Context
import android.graphics.*
import android.os.Build
import android.support.annotation.Nullable
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.view.Display
import android.view.View
import android.view.Window
import android.widget.LinearLayout

class LinearLayoutLogin : View {
    var point : Point? = null



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
        //screem size
        val windowManager = (context as Activity).windowManager
        val mDisplay = windowManager.defaultDisplay
        point = Point()
        mDisplay!!.getSize(point)


        paint = Paint()
        paint!!.style = Paint.Style.FILL
        paint!!.color = Color.BLACK
        paint!!.strokeWidth = 5f
    }










    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(canvas: Canvas?) {
//        super.onDraw(canvas)

        var paint = Paint()
        paint!!.style = Paint.Style.FILL
        paint!!.color = Color.BLACK
        paint!!.strokeWidth = 5f

        var path = Path()
        path.lineTo(0f, 400f)
        path.cubicTo(0f, 400f, 0f, 750f, 700f, 750f)
        path.cubicTo(700f, 750f, 950f, 750f, 1500f, 1000f)
        path.lineTo(1500f, 0f)
        path.close()

        //Two
        var pain2 = Paint(Paint.ANTI_ALIAS_FLAG)
        pain2.style = Paint.Style.FILL_AND_STROKE
        pain2.color = Color.GREEN
        pain2.strokeWidth = 3f

        var path2 = Path()
        path2.moveTo(point!!.x / 2f, 0f)
        path2.cubicTo(point!!.x / 2f, 300f, 1300f, 600f, 1700f, 800f)
        path2.lineTo(1700f, 0f)
        path2.close()


        canvas!!.drawPath(path, paint)
        canvas!!.drawPath(path2, pain2)




    }




}