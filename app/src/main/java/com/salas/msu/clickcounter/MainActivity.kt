package com.salas.msu.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.salas.msu.clickcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val count = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val display = binding.tv1
        val btn = binding.btn1

        btn.setOnClickListener {
            count.addCount()
            display.text = count.getCount().toString()
        }
    }
}

class Counter {
    private var count: Int = 0

    fun addCount() {
        count++
    }

    fun getCount(): Int {
        return count
    }
}
