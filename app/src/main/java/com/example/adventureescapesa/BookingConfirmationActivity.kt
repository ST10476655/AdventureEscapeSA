package com.example.adventureescapesa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BookingConfirmationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(
            R.layout.activity_booking_confirmation
        )

        setupResponsiveWindow()

        val txtReference =
            findViewById<TextView>(R.id.txtReference)

        val btnHome =
            findViewById<Button>(R.id.btnHome)

        val btnBack =
            findViewById<Button>(R.id.btnBack)

        // Generate simple reference number

        val reference =
            "AES-" + System.currentTimeMillis()
                .toString()
                .takeLast(6)

        txtReference.text = reference

        // Return Home

        btnHome.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    HomeActivity::class.java
                )
            )

            finish()
        }

        // Go Back

        btnBack.setOnClickListener {

            finish()
        }
    }
}