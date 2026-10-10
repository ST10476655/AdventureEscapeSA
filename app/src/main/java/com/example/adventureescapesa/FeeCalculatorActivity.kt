package com.example.adventureescapesa

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class FeeCalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fee_calculator)

        setupResponsiveWindow()

        val etName = findViewById<EditText>(R.id.etName)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val etEmail = findViewById<EditText>(R.id.etEmail)

        val cbUltimate = findViewById<CheckBox>(R.id.cbUltimate)
        val cbFamily = findViewById<CheckBox>(R.id.cbFamily)
        val cbMountain = findViewById<CheckBox>(R.id.cbMountain)
        val cbCorporate = findViewById<CheckBox>(R.id.cbCorporate)
        val cbZip = findViewById<CheckBox>(R.id.cbZip)
        val cbKayak = findViewById<CheckBox>(R.id.cbKayak)
        val cbRock = findViewById<CheckBox>(R.id.cbRock)

        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val btnSubmit = findViewById<Button>(R.id.btnSubmitBooking)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val txtSummary = findViewById<TextView>(R.id.txtSummary)

        btnCalculate.setOnClickListener {

            if (etName.text.toString().isEmpty()) {
                etName.error = "Enter Full Name"
                return@setOnClickListener
            }

            if (etPhone.text.toString().isEmpty()) {
                etPhone.error = "Enter Phone Number"
                return@setOnClickListener
            }

            if (etEmail.text.toString().isEmpty()) {
                etEmail.error = "Enter Email Address"
                return@setOnClickListener
            }

            var subtotal = 0.0
            var bookings = 0

            if(cbUltimate.isChecked){ subtotal += 1500; bookings++ }
            if(cbFamily.isChecked){ subtotal += 1500; bookings++ }
            if(cbMountain.isChecked){ subtotal += 1500; bookings++ }
            if(cbCorporate.isChecked){ subtotal += 1500; bookings++ }
            if(cbZip.isChecked){ subtotal += 750; bookings++ }
            if(cbKayak.isChecked){ subtotal += 750; bookings++ }
            if(cbRock.isChecked){ subtotal += 750; bookings++ }

            val discount = when {
                bookings == 2 -> subtotal * 0.05
                bookings == 3 -> subtotal * 0.10
                bookings > 3 -> subtotal * 0.15
                else -> 0.0
            }

            val afterDiscount = subtotal - discount
            val vat = afterDiscount * 0.15
            val total = afterDiscount + vat

            txtSummary.text =
                """
                Customer: ${etName.text}

                Subtotal: R%.2f

                Discount: R%.2f

                VAT (15%%): R%.2f

                Total Fee: R%.2f
                """.trimIndent().format(
                    subtotal,
                    discount,
                    vat,
                    total
                )
        }

        btnSubmit.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    BookingConfirmationActivity::class.java
                )
            )
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}