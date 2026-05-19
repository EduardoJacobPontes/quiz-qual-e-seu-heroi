package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class TelaFlashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_flash)

        var pontosAquaman = intent.getIntExtra("PONTOS_AQUAMAN", 0)
        var pontosFlash = intent.getIntExtra("PONTOS_FLASH", 0)
        var pontosArqueiro = intent.getIntExtra("PONTOS_ARQUEIRO", 0)

        val grupoEscolha = findViewById<RadioGroup>(R.id.grupo_decisao_rapida)
        val botaoAvancar = findViewById<Button>(R.id.botao_avancar_pergunta_dois)

        botaoAvancar.setOnClickListener {
            when (grupoEscolha.checkedRadioButtonId) {
                R.id.opcao_viver_em_ritmo_lento -> pontosAquaman++
                R.id.opcao_viver_em_movimento -> pontosFlash++
                R.id.opcao_viver_estrategicamente -> pontosArqueiro++
            }

            val tela = Intent(this, TelaArqueiroActivity::class.java)
            tela.putExtra("PONTOS_AQUAMAN", pontosAquaman)
            tela.putExtra("PONTOS_FLASH", pontosFlash)
            tela.putExtra("PONTOS_ARQUEIRO", pontosArqueiro)

            startActivity(tela)
        }
    }
}