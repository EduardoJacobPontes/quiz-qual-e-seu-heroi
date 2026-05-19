package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class TelaArqueiroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_arqueiro)

        var pontosAquaman = intent.getIntExtra("PONTOS_AQUAMAN", 0)
        var pontosFlash = intent.getIntExtra("PONTOS_FLASH", 0)
        var pontosArqueiro = intent.getIntExtra("PONTOS_ARQUEIRO", 0)

        val grupoEscolha = findViewById<RadioGroup>(R.id.grupo_valores_pessoais)
        val botaoVerResultado = findViewById<Button>(R.id.botao_ver_resultado)

        botaoVerResultado.setOnClickListener {
            when (grupoEscolha.checkedRadioButtonId) {
                R.id.opcao_lealdade -> pontosAquaman++
                R.id.opcao_acao_imediata -> pontosFlash++
                R.id.opcao_planejamento_silencioso -> pontosArqueiro++
            }

            val tela = Intent(this, TelaResultadoActivity::class.java)
            tela.putExtra("PONTOS_AQUAMAN", pontosAquaman)
            tela.putExtra("PONTOS_FLASH", pontosFlash)
            tela.putExtra("PONTOS_ARQUEIRO", pontosArqueiro)

            startActivity(tela)
        }
    }
}