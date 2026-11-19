package com.example.adventureescapesa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        setupResponsiveWindow()

        val btnMenu =
            findViewById<ImageButton>(R.id.btnMenu)

        val btnAbout =
            findViewById<Button>(R.id.btnAbout)

        val btnPackages =
            findViewById<Button>(R.id.btnPackages)

        val btnActivities =
            findViewById<Button>(R.id.btnActivities)

        val btnCalculator =
            findViewById<Button>(R.id.btnCalculator)

        val btnContact =
            findViewById<Button>(R.id.btnContact)

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

        // ABOUT PAGE

        btnAbout.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    AboutActivity::class.java
                )
            )
        }

        // PACKAGES PAGE

        btnPackages.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    OverviewActivity::class.java
                )
            )
        }

        // ACTIVITIES PAGE

        btnActivities.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    OverviewActivity::class.java
                )
            )
        }

        // CALCULATOR PAGE

        btnCalculator.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    FeeCalculatorActivity::class.java
                )
            )
        }

        // CONTACT PAGE

        btnContact.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    ContactActivity::class.java
                )
            )
        }
    }
}