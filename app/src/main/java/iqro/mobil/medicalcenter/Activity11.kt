package iqro.mobil.medicalcenter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity11)

        findViewById<Button>(R.id.button).setOnClickListener {
            Intent(this,Activity12::class.java).apply {
                startActivity(this)
            }
        }

    }
}