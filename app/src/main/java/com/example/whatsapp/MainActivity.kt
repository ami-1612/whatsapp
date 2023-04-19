package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.viewpager2.widget.ViewPager2
import com.example.whatsapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    var images = arrayOf(R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,)
    private var fragments = arrayOf(ChatFragment(),StatusFragment(),CallsFragment())
    var titles = arrayOf("CHATS","STATUS","CALLS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tab.addTab(binding.tab.newTab().setText("CHAT"))
        binding.tab.addTab(binding.tab.newTab().setText("STATUS"))
        binding.tab.addTab(binding.tab.newTab().setText("CALL"))

        var Adapter = FragAdapter(supportFragmentManager,fragments,titles)
        Adapter.also { binding.ImageSlider.adapter = Adapter }
        binding.tab.setupWithViewPager(binding.ImageSlider)



    }
}

private fun TabLayout.setupWithViewPager(imageSlider: ViewPager2) {


}
