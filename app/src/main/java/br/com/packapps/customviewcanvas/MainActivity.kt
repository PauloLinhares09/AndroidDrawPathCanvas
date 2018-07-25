package br.com.packapps.customviewcanvas

import android.graphics.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LinearLayoutLogin(this))

//        var paint = Paint()
//        paint.style = Paint.Style.STROKE
//        paint.color = Color.BLACK
//        paint.strokeWidth = 5f
//
//
//
//        var path = Path()
//        path.lineTo(0f, 400f)
//        path.cubicTo(0f, 400f, 0f, 750f, 700f, 750f)
//        path.cubicTo(700f, 750f, 950f, 750f, 1500f, 1300f)
//
//
//
//
//
//        val bitmap = Bitmap.createBitmap(windowManager.defaultDisplay.width , windowManager.defaultDisplay.height, Bitmap.Config.ARGB_8888)
//        var canvas = Canvas(bitmap)
//
//        ivBitmap.setImageBitmap(bitmap)
//
//        canvas.drawPath(path, paint)



    }
}
