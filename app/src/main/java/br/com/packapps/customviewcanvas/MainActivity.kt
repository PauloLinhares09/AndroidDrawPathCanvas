package br.com.packapps.customviewcanvas

import android.graphics.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var paint = Paint()
        paint.style = Paint.Style.FILL
        paint.color = Color.BLACK
        paint.strokeWidth = 5f



        var path = Path()
//        path.lineTo(800f, 0f)


        path.cubicTo(0f, 0f, 400f, 150f, 700f, 0f)
        path.cubicTo(700f, 0f, 400f, 150f, 700f, 700f)



        val bitmap = Bitmap.createBitmap(windowManager.defaultDisplay.width , windowManager.defaultDisplay.height, Bitmap.Config.ARGB_8888)
        var canvas = Canvas(bitmap)

        ivBitmap.setImageBitmap(bitmap)

        canvas.drawPath(path, paint)



    }
}
