package com.enesdurak.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.enesdurak.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val newsCard1Fragment = NewsCard1Fragment.newInstance("saddsa","asddsadsa")
        val newsCard2Fragment = NewsCard3Fragment.newInstance("saddsa","asddsadsa")
        val newsCard3Fragment = NewsCard5Fragment.newInstance("saddsa","asddsadsa")
        val newsCard4Fragment = NewsCard4Fragment.newInstance("saddsa","asddsadsa")
        val newsCard5Fragment = NewsCard2Fragment.newInstance("saddsa","asddsadsa")
        val newsCard6Fragment = NewsCard1Fragment.newInstance("saddsa","asddsadsa")
        val newsCard7Fragment = NewsCard3Fragment.newInstance("saddsa","asddsadsa")
        val newsCard8Fragment = NewsCard4Fragment.newInstance("saddsa","asddsadsa")
        val newsCard9Fragment = NewsCard5Fragment.newInstance("saddsa","asddsadsa")
        val newsCard10Fragment = NewsCard2Fragment.newInstance("saddsa","asddsadsa")
        val newsCard11Fragment = NewsCard1Fragment.newInstance("saddsa","asddsadsa")
        val newsCard12Fragment = NewsCard4Fragment.newInstance("saddsa","asddsadsa")
        val newsCard13Fragment = NewsCard3Fragment.newInstance("saddsa","asddsadsa")
        val newsCard14Fragment = NewsCard1Fragment.newInstance("saddsa","asddsadsa")
        val newsCard15Fragment = NewsCard5Fragment.newInstance("saddsa","asddsadsa")

        val newsCardDetailFragmentFragment = NewsDetailFragment.newInstance("saddsa","asddsadsa")

        addFragment(newsCard1Fragment, binding.newsCard1.id)
        addFragment(newsCard2Fragment, binding.newsCard2.id)
        addFragment(newsCard3Fragment, binding.newsCard3.id)
        addFragment(newsCard4Fragment, binding.newsCard4.id)
        addFragment(newsCard5Fragment, binding.newsCard5.id)
        addFragment(newsCard6Fragment, binding.newsCard6.id)
        addFragment(newsCard7Fragment, binding.newsCard7.id)
        addFragment(newsCard8Fragment, binding.newsCard8.id)
        addFragment(newsCard9Fragment, binding.newsCard9.id)
        addFragment(newsCard10Fragment, binding.newsCard10.id)
        addFragment(newsCard11Fragment, binding.newsCard11.id)
        addFragment(newsCard12Fragment, binding.newsCard12.id)
        addFragment(newsCard13Fragment, binding.newsCard13.id)
        addFragment(newsCard14Fragment, binding.newsCard14.id)
        addFragment(newsCard15Fragment, binding.newsCard15.id)

    }

    private fun addFragment(fragment : Fragment, @IdRes id : Int){
        supportFragmentManager.beginTransaction().add(id, fragment)
    }
}