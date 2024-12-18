package co.tiagoaguiar.meuprimeiroaplicativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = divide (2, 2)
        Log.i("Teste", "Boa noite $result")
    }

    fun divide(x: Int, y: Int) : Int {
        return x / y
    }
}