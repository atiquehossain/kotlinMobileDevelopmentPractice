package com.example.mykotlinproject
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.mykotlinproject.databinding.ActivityMainBinding


class MainActivity : Activity() {
    private  lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tx1.text = "Rakib bai"

/*        val texView : TextView = findViewById(R.id.tx1)
        texView.text = "Rakib bhai"*/
        binding.btn.setOnClickListener {
            val intent = Intent(this@MainActivity, QuizActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
        }

    }


}