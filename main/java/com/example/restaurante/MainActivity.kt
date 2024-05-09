package com.example.restaurante

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //tela principal de um aplicativo de restaurante
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        //mostra o layout da tela principal e atualiza a quantidade e o preço dos itens selecionados

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //exibe uma saudação personalizada com o nome do usuário
        val username = intent.extras?.getString("username")

        if(!username.isNullOrEmpty()){
            binding.textOla.setText("Olá $username")
        }

        //permite fechar o aplicativo quando o botão é clicado
        binding.buttonFechar.setOnClickListener {
            finishAffinity()
        }


        //marca ou desmarca caixas de seleção para itens do menu
        binding.checkPizza.setOnClickListener {
            if(binding.checkPizza.isChecked()){
                binding.editQuantidadePizza.setText("1")
                binding.textPrecoPizza.visibility = View.VISIBLE
            }else{
                binding.editQuantidadePizza.setText("0")
                binding.textPrecoPizza.visibility = View.GONE
            }
        }

        binding.checkSalada.setOnClickListener {
            if(binding.checkSalada.isChecked()){
                binding.editQuantidadeSalada.setText("1")
                binding.textPrecoSalada.visibility = View.VISIBLE
            }else{
                binding.editQuantidadeSalada.setText("0")
                binding.textPrecoSalada.visibility = View.GONE
            }
        }

        binding.checkHamburger.setOnClickListener {
            if(binding.checkHamburger.isChecked()){
                binding.editQuantidadeHamburguer.setText("1")
                binding.textPrecoHamburguer.visibility = View.VISIBLE
            }else{
                binding.editQuantidadeHamburguer.setText("0")
                binding.textPrecoHamburguer.visibility = View.GONE
            }
        }

    }
}