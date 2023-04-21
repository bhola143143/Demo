package com.example.demo210423

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo210423.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivityBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)

        mainActivityBinding.recState.layoutManager = LinearLayoutManager(this)
        val data2 = ArrayList<Data>()

        data2.add(
            Data(
                getString(R.string.kiara),
                getString(R.string.yoga),
                getString(R.string.time),
                getString(
                    R.string.profile
                )
            )
        )
        data2.add(
            Data(
                getString(R.string.kiara),
                getString(R.string.yoga),
                getString(R.string.time),
                getString(
                    R.string.profile
                )
            )
        )
        data2.add(
            Data(
                getString(R.string.kiara),
                getString(R.string.yoga),
                getString(R.string.time),
                getString(
                    R.string.profile
                )
            )
        )
        data2.add(
            Data(
                getString(R.string.kiara),
                getString(R.string.yoga),
                getString(R.string.time),
                getString(
                    R.string.profile
                )
            )
        )
        data2.add(
            Data(
                getString(R.string.kiara),
                getString(R.string.yoga),
                getString(R.string.time),
                getString(
                    R.string.profile
                )
            )
        )
        data2.add(
            Data(
                getString(R.string.kiara),
                getString(R.string.yoga),
                getString(R.string.time),
                getString(
                    R.string.profile
                )
            )
        )
        data2.add(
            Data(
                getString(R.string.kiara),
                getString(R.string.yoga),
                getString(R.string.time),
                getString(
                    R.string.profile
                )
            )
        )

        val adapter = ListAdapter(data2)
        mainActivityBinding.recState.adapter = adapter
    }
}