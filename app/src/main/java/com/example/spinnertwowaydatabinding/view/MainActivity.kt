package com.example.spinnertwowaydatabinding.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.spinnertwowaydatabinding.R
import com.example.spinnertwowaydatabinding.databinding.ActivityMainBinding
import com.example.spinnertwowaydatabinding.viewmodel.SpinnerViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: SpinnerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this)[SpinnerViewModel::class.java]
        binding.lifecycleOwner = this

        var currentPosition = viewModel.selectedSpinnerItemValue
        Toast.makeText(this, "Current value is $currentPosition", Toast.LENGTH_SHORT).show()

    }
}