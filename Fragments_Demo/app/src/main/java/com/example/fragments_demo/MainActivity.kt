package com.example.fragments_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.fragments_demo.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity(),Communicator {
    private lateinit var binding:ActivityMainBinding

    var tabL:TabLayout?=null
    var  viewP:ViewPager?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Replace Main Activity content with the Fragment1 content
        val fragment1 = Fragment1()
        supportFragmentManager.beginTransaction().replace(R.id.content_id, fragment1).commit()

      //  setContentView(R.layout.activity_main)

        tabL=findViewById(R.id.myTab)
        viewP=findViewById(R.id.viewPager)
    }
    /*class MyFragmentPagerAdapter :FragmentPagerAdapter(){
        override fun getCount(): Int {
            TODO("Not yet implemented")
        }

        override fun getItem(position: Int): Fragment {
            TODO("Not yet implemented")
        }

    }*/
}