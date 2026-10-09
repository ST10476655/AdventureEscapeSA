package com.example.adventureescapesa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MountainAdventureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(
            R.layout.activity_mountain_adventure
        )

        val btnMenu =
            findViewById<ImageButton>(R.id.btnMenu)

        val btnBookNow =
            findViewById<Button>(R.id.btnBookNow)

        val btnQuote =
            findViewById<Button>(R.id.btnQuote)

        val btnBack =
            findViewById<Button>(R.id.btnBack)

        // HAMBURGER MENU

        btnMenu.setOnClickListener {

            val popupMenu =
                PopupMenu(this, btnMenu)

            popupMenu.menuInflater.inflate(
                R.menu.navigation_menu,
                popupMenu.menu
            )

            popupMenu.show()
        }

        // BOOK NOW

        btnBookNow.setOnClickListener {

            Toast.makeText(
                this,
                "Mountain Adventure Package Selected",
                Toast.LENGTH_LONG
            ).show()

            startActivity(
                Intent(
                    this,
                    FeeCalculatorActivity::class.java
                )
            )
        }

        // REQUEST QUOTE

        btnQuote.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    FeeCalculatorActivity::class.java
                )
            )
        }

        // BACK BUTTON

        btnBack.setOnClickListener {

            finish()

        }
    }
}