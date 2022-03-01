package com.example.dayoneapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.dayoneapp.databinding.ActivityImageAndOnClickListenerBinding

class ImageAndOnClickListenerActivity : AppCompatActivity() {

    private val textViewer: TextView
        get() = findViewById(R.id.textViewer)
    private val btnServicios: Button
        get() = findViewById(R.id.servicios_btn)
    private val btnPortafolio: Button
        get() = findViewById(R.id.portafolio_btn)
    private val btnAcercaDe: Button
        get() = findViewById(R.id.acercade_btn)
    private val btnContacto: Button
        get() = findViewById(R.id.contacto_btn)
    private val btnRedesSociales: Button
        get() = findViewById(R.id.redessociales_btn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_and_on_click_listener)
        btnServicios.setOnClickListener{
            textViewer.text = btnServicios.text
        }
        btnPortafolio.setOnClickListener{
            textViewer.text = btnPortafolio.text
        }
        btnAcercaDe.setOnClickListener{
            textViewer.text = btnAcercaDe.text
        }
        btnContacto.setOnClickListener{
            textViewer.text = btnContacto.text
        }
        btnRedesSociales.setOnClickListener{
            textViewer.text = btnRedesSociales.text
        }
    }
}