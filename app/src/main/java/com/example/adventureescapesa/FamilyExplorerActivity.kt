package com.example.adventureescapesa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FamilyExplorerActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(
            R.layout.activity_family_explorer
        )

        setupResponsiveWindow()

        // Controls

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

            popupMenu.setOnMenuItemClickListener {

                when (it.itemId) {

                    R.id.menu_home -> {
                        startActivity(
                            Intent(
                                this,
                                HomeActivity::class.java
                            )
                        )
                        true
                    }

                    R.id.menu_about -> {
                        startActivity(
                            Intent(
                                this,
                                AboutActivity::class.java
                            )
                        )
                        true
                    }

                    R.id.menu_packages -> {
                        startActivity(
                            Intent(
                                this,
                                OverviewActivity::class.java
                            )
                        )
                        true
                    }

                    R.id.menu_calculator -> {
                        startActivity(
                            Intent(
                                this,
                                FeeCalculatorActivity::class.java
                            )
                        )
                        true
                    }

                    R.id.menu_contact -> {
                        startActivity(
                            Intent(
                                this,
                                ContactActivity::class.java
                            )
                        )
                        true
                    }

                    else -> false
                }
            }

            popupMenu.show()
        }

        // BOOK NOW

        btnBookNow.setOnClickListener {

            Toast.makeText(
                this,
                "Family Explorer Package Selected",
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

        // BACK

        btnBack.setOnClickListener {

            finish()

        }
    }
}