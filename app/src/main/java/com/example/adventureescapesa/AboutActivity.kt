package com.example.adventureescapesa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_about)

        setupResponsiveWindow()

        val btnMenu =
            findViewById<ImageButton>(R.id.btnMenu)

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

                    R.id.menu_about -> true

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

        // BACK BUTTON

        btnBack.setOnClickListener {

            finish()

        }
    }
}