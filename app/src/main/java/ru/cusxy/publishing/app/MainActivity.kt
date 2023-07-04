package ru.cusxy.publishing.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import ru.cusxy.publishing.mylibrary.MyLibraryConfig

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.text_view).apply {
            text = MyLibraryConfig.greeting
        }
    }
}