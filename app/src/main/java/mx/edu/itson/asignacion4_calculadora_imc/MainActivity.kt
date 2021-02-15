package mx.edu.itson.asignacion4_calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var ET_Peso =0
    var ET_Altura =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ET_Altura: EditText = findViewById(R.id.ET_Altura)
        var ET_Peso: EditText = findViewById(R.id.ET_Peso)
    }



}