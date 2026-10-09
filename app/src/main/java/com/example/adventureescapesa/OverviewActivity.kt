package com.example.adventureescapesa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity

class OverviewActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_overview)

        val btnMenu =
            findViewById<ImageButton>(R.id.btnMenu)

        val btnUltimate =
            findViewById<Button>(R.id.btnUltimate)

        val btnFamily =
            findViewById<Button>(R.id.btnFamily)

        val btnMountain =
            findViewById<Button>(R.id.btnMountain)

        val btnCorporate =
            findViewById<Button>(R.id.btnCorporate)

        val btnZipline =
            findViewById<Button>(R.id.btnZipline)

        val btnKayaking =
            findViewById<Button>(R.id.btnKayaking)

        val btnRock =
            findViewById<Button>(R.id.btnRock)

        val btnBack =
            findViewById<Button>(R.id.btnBack)

        // MENU

        btnMenu.setOnClickListener {

            val popup =
                PopupMenu(this, btnMenu)

            popup.menuInflater.inflate(
                R.menu.navigation_menu,
                popup.menu
            )

            popup.show()
        }

        // PACKAGE NAVIGATION

        btnUltimate.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    UltimateAdventureActivity::class.java
                )
            )
        }

        btnFamily.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    FamilyExplorerActivity::class.java
                )
            )
        }

        btnMountain.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    MountainAdventureActivity::class.java
                )
            )
        }

        btnCorporate.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    CorporateChallengeActivity::class.java
                )
            )
        }

        btnZipline.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    ZipliningActivity::class.java
                )
            )
        }

        btnKayaking.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    KayakingActivity::class.java
                )
            )
        }

        btnRock.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    RockClimbingActivity::class.java
                )
            )
        }

        btnBack.setOnClickListener {

            finish()

        }
    }
}