package com.example.adventureescapesa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.adventureescapesa.etName

private val Unit.etName: Int
    get() {
        TODO()
    }

class ContactActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_contact)

        setupResponsiveWindow()

        val btnMenu =
            findViewById<ImageButton>(R.id.btnMenu)

        val btnSend =
            findViewById<Button>(R.id.btnSend)

        val btnBack =
            findViewById<Button>(R.id.btnBack)

        val etName =
            findViewById<EditText>(R.id.etName)

        val etEmail =
            findViewById<EditText>(R.id.etEmail)

        val etMessage =
            findViewById<EditText>(R.id.etMessage)

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

        // SEND ENQUIRY

        btnSend.setOnClickListener {

            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val message = etMessage.text.toString()

            if (name.isEmpty()) {
                etName.error = "Enter Name"
                return@setOnClickListener
            }

            if (email.isEmpty()) {
                etEmail.error = "Enter Email"
                return@setOnClickListener
            }

            if (message.isEmpty()) {
                etMessage.error = "Enter Message"
                return@setOnClickListener
            }

            Toast.makeText(
                this,
                "Enquiry Sent Successfully",
                Toast.LENGTH_LONG
            ).show()

            etName.text.clear()
            etEmail.text.clear()
            etMessage.text.clear()
        }

        // BACK BUTTON

        btnBack.setOnClickListener {

            finish()

        }
    }
}