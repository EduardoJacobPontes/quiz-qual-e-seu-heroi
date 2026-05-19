package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class TelaAquamanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_aquaman)

        val grupoPerfil = findViewById<RadioGroup>(R.id.grupo_resposta_aquaman)
        val botaoAvancar = findViewById<Button>(R.id.botao_avancar_pergunta_um)

        botaoAvancar.setOnClickListener {
            var pontosAquaman = 0
            var pontosFlash = 0
            var pontosArqueiro = 0

            when (grupoPerfil.checkedRadioButtonId) {
                R.id.opcao_rotina_mar -> pontosAquaman++
                R.id.opcao_rotina_vibrante -> pontosFlash++
                R.id.opcao_rotina_independente -> pontosArqueiro++
            }

            val tela = Intent(this, TelaFlashActivity::class.java)
            tela.putExtra("PONTOS_AQUAMAN", pontosAquaman)
            tela.putExtra("PONTOS_FLASH", pontosFlash)
            tela.putExtra("PONTOS_ARQUEIRO", pontosArqueiro)

            startActivity(tela)
        }
    }
}