package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PedidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //cria uma tela no aplicativo onde os clientes podem fazer pedidos em um restaurante
        setContentView(R.layout.activity_pedido)
    }
}