package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TelaResultadoActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_resultado)

        val textoResultado = findViewById<TextView>(R.id.texto_resultado_quiz)

        val pontosAquaman = intent.getIntExtra("PONTOS_AQUAMAN", 0)
        val pontosFlash = intent.getIntExtra("PONTOS_FLASH", 0)
        val pontosArqueiro = intent.getIntExtra("PONTOS_ARQUEIRO", 0)

        val resultado = when {
            pontosAquaman >= pontosFlash && pontosAquaman >= pontosArqueiro -> "Aquaman"
            pontosFlash >= pontosAquaman && pontosFlash >= pontosArqueiro -> "Flash"
            else -> "Arqueiro Verde"
        }

        textoResultado.text = "Seu herói ideal é: $resultado"
    }
}