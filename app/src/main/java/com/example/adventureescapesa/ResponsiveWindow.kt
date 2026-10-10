package com.example.adventureescapesa

import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat

/**
 * Makes a screen display correctly on every phone and tablet.
 *
 * On Android 15+ apps are drawn edge-to-edge, so without this the header
 * slides under the status bar (clock/battery) and the bottom buttons hide
 * behind the navigation bar. This pads the screen by exactly the size of
 * the system bars, display cutout (camera notch) and on-screen keyboard,
 * which differ from device to device.
 *
 * Call it right after setContentView().
 */
fun AppCompatActivity.setupResponsiveWindow() {
    WindowCompat.setDecorFitsSystemWindows(window, false)

    // Our backgrounds are light, so use dark status/navigation bar icons
    WindowCompat.getInsetsController(window, window.decorView).apply {
        isAppearanceLightStatusBars = true
        isAppearanceLightNavigationBars = true
    }

    val root = findViewById<ViewGroup>(android.R.id.content).getChildAt(0) ?: return

    // Remember the layout's own padding so we add to it rather than replace it
    val leftPadding = root.paddingLeft
    val topPadding = root.paddingTop
    val rightPadding = root.paddingRight
    val bottomPadding = root.paddingBottom

    if (root is ViewGroup) root.clipToPadding = false

    ViewCompat.setOnApplyWindowInsetsListener(root) { view, insets ->
        val bars = insets.getInsets(
            WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
        )
        val keyboard = insets.getInsets(WindowInsetsCompat.Type.ime())

        view.setPadding(
            leftPadding + bars.left,
            topPadding + bars.top,
            rightPadding + bars.right,
            bottomPadding + maxOf(bars.bottom, keyboard.bottom)
        )
        WindowInsetsCompat.CONSUMED
    }
}
