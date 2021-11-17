package org.iesmurgi.practicaradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<RadioButton>(R.id.radio1).callOnClick();
    }

    fun onRadioButtonClick(view: View) {
        val textviewHelloWorld =findViewById<TextView>(R.id.textviewHelloWorld)

        when (view.id){
            R.id.radio1->{textviewHelloWorld.text="Has pulsado la Opcion 1"; Toast.makeText(this,"Has pulsado la opcion 1",Toast.LENGTH_SHORT).show()}
            R.id.radio2->{textviewHelloWorld.text="Has pulsado la Opcion 2"; Toast.makeText(this,"Has pulsado la opcion 2",Toast.LENGTH_SHORT).show()}
            R.id.radio3->{textviewHelloWorld.text="Has pulsado la Opcion 3"; Toast.makeText(this,"Has pulsado la opcion 3",Toast.LENGTH_SHORT).show()}
            R.id.radio4->{textviewHelloWorld.text="Has pulsado la Opcion 4"; Toast.makeText(this,"Has pulsado la opcion 4",Toast.LENGTH_SHORT).show()}
        }
    }





}