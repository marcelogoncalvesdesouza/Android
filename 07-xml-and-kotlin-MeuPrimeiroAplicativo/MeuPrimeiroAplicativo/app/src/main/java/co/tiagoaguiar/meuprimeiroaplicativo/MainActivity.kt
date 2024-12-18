package co.tiagoaguiar.meuprimeiroaplicativo

import android.os.Bundle
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtUsername: TextView = findViewById(R.id.txt_username)
        val txtEmail: TextView = findViewById(R.id.txt_email)

        // aqui tenha um monte de codigo que busca em um banco de dados
        val username = "Tiago Aguiar"

        txtUsername.text = username
        txtEmail.setText(R.string.send)

    }

}