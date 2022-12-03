package com.henrique.dev.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var bCalcular: Button
    private lateinit var editAltura : EditText
    private lateinit var editPeso : EditText
    private lateinit var txtResultado : TextView
    private lateinit var txtResultadoCalc : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bCalcular = findViewById(R.id.bCalcular)
        editAltura = findViewById(R.id.editAltura)
        editPeso = findViewById(R.id.editPeso)
        txtResultado = findViewById(R.id.txtResultado)
        txtResultadoCalc = findViewById(R.id.textResultadoCalc)

    }

    fun calcularIMC (view : View){

        var altura : Double = editAltura.text.toString().toDouble()
        var peso : Double = editPeso.text.toString().toDouble()

        var imc : Double = peso / (altura * altura)

        if(imc < 18.5){
            txtResultado.setText("Abaixo do peso normal")
        }else if(imc in 18.5..24.9){
            txtResultado.setText("Peso normal")
        }else if(imc in 25.0..29.9){
            txtResultado.setText("Excesso de peso")
        }else if(imc in 30.0..34.9){
            txtResultado.setText("Obesidade classe I")
        }else if(imc in 35.0..39.9){
            txtResultado.setText("Obesidade classe II")
        }else{
            txtResultado.setText("Obesidade classe III")
        }

        txtResultadoCalc.setText(imc.toString())

    }
}