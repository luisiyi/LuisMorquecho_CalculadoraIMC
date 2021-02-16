package mx.edu.itson.asignacion4_calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var estatura:Double =0.0
    var peso:Double =0.0
    var imc=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        var ET_Altura: EditText = findViewById(R.id.ET_Altura)
        var ET_Peso: EditText = findViewById(R.id.ET_Peso)
        */

        this.btnCalcular.setOnClickListener(){
            TV_Resultado.setText(calculaIMC().toString())
        }
    }

    fun calculaIMC():Double {
        estatura=(this.ET_Altura.text.toString()).toDouble()
        peso=(this.ET_Peso.text.toString()).toDouble()
        return peso/(estatura*estatura);

    }

}