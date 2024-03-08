package com.example.creativeband
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.creativeband.databinding.ActivityGameBinding
import com.example.creativeband.databinding.ActivityMainBinding
import com.example.creativeband.databinding.FragmentHomeBinding

class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding
    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)


        webView = binding.webView

        // تمكين تشغيل JavaScript إذا كنت بحاجة إلى ذلك
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        // تمكين التنقل داخل WebView بدلاً من فتح متصفح خارجي
        webView.webViewClient = WebViewClient()

        // تمكين عرض مقاطع الفيديو وغيرها من الميزات
        webView.webChromeClient = WebChromeClient()

        // قم بتحميل موقع OpenAI كمثال
        val url = "https://www.openai.com"
        webView.loadUrl(link)

          }



    companion object{
        lateinit var link: String
    }
}
