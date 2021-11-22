package tequila.tecmm.edu.micalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun presiono(v:View){
        val vista = v as TextView
        Log.e("Boton","presiono   ${vista.text}")


    }
}