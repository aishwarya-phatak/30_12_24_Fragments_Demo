package com.bitcode.a30_12_24_fragments_demo

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentA: FragmentA
    private var fragmentManager = supportFragmentManager
    private lateinit var fragmentTransaction: FragmentTransaction
    private  var counterFragments : ArrayList<FragmentA> = ArrayList<FragmentA>()
    private lateinit var btnAddFragment : Button
    private lateinit var btnRemove : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews(){
        fragmentA = FragmentA()

        btnAddFragment = findViewById(R.id.btnAddFragment)
        btnRemove = findViewById(R.id.btnRemove)
        btnAddFragment.setOnClickListener {
            fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.fragmentA,fragmentA)
                .addToBackStack("Added A fragment")
                .commit()

            counterFragments.add(fragmentA)
        }

        btnRemove.setOnClickListener {


        }
    }
}