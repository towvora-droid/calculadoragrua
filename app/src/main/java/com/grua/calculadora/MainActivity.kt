package com.grua.calculadora

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.parseColor("#1D2024")
        window.navigationBarColor = Color.parseColor("#14161A")

        webView = WebView(this)
        webView.setBackgroundColor(Color.parseColor("#14161A"))
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()

        setContentView(webView)
        webView.loadUrl("file:///android_asset/index.html")
    }
}
