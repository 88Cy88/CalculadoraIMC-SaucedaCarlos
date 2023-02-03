package sauceda.carlos.asignacion4_calculadoraimc_saucedacevantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //Variables
    private lateinit var etEstatura: EditText
    private lateinit var etPeso: EditText
    private lateinit var etResultado: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         etEstatura = findViewById(R.id.etEstatura)
         etPeso = findViewById(R.id.etPeso)
         etResultado = findViewById(R.id.etResultado)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener { calcularIMC() }
    }
    //funcion
     fun calcularIMC() {
        val estatura = etEstatura.text.toString().toDouble()
        val peso = etPeso.text.toString().toDouble()
        val imc = peso / (estatura * estatura)
        etResultado.setText(imc.toString())
    }
}