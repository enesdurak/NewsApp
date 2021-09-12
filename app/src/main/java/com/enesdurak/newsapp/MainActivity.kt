package com.enesdurak.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.IdRes
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.enesdurak.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    private var newsDetailFragment : NewsDetailFragment? = null
    private val list : ArrayList<Pair<Fragment, Int>> = arrayListOf()
    private var selectedFrameLayoutId : Int = 0

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

        newsDetailFragment = NewsDetailFragment.newInstance(
            "saddsa","asddsadsa")

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

        binding.newsCard1.setOnClickListener(this)
        binding.newsCard2.setOnClickListener(this)
        binding.newsCard3.setOnClickListener(this)
        binding.newsCard4.setOnClickListener(this)
        binding.newsCard5.setOnClickListener(this)
        binding.newsCard6.setOnClickListener(this)
        binding.newsCard7.setOnClickListener(this)
        binding.newsCard8.setOnClickListener(this)
        binding.newsCard9.setOnClickListener(this)
        binding.newsCard10.setOnClickListener(this)
        binding.newsCard11.setOnClickListener(this)
        binding.newsCard12.setOnClickListener(this)
        binding.newsCard13.setOnClickListener(this)
        binding.newsCard14.setOnClickListener(this)
        binding.newsCard15.setOnClickListener(this)

        list.add(Pair(newsCard1Fragment, binding.newsCard1.id))
        list.add(Pair(newsCard2Fragment, binding.newsCard2.id))
        list.add(Pair(newsCard3Fragment, binding.newsCard3.id))
        list.add(Pair(newsCard4Fragment, binding.newsCard4.id))
        list.add(Pair(newsCard5Fragment, binding.newsCard5.id))
        list.add(Pair(newsCard6Fragment, binding.newsCard6.id))
        list.add(Pair(newsCard7Fragment, binding.newsCard7.id))
        list.add(Pair(newsCard8Fragment, binding.newsCard8.id))
        list.add(Pair(newsCard9Fragment, binding.newsCard9.id))
        list.add(Pair(newsCard10Fragment, binding.newsCard10.id))
        list.add(Pair(newsCard11Fragment, binding.newsCard11.id))
        list.add(Pair(newsCard12Fragment, binding.newsCard12.id))
        list.add(Pair(newsCard13Fragment, binding.newsCard13.id))
        list.add(Pair(newsCard14Fragment, binding.newsCard14.id))
        list.add(Pair(newsCard15Fragment, binding.newsCard15.id))
    }

    override fun onClick(frameLayout: View?) {
        //Toast.makeText(this, frameLayout?.id.toString(), Toast.LENGTH_SHORT).show()
        for(pair in list){
            if(pair.second == frameLayout?.id){
                selectedFrameLayoutId = frameLayout.id
                openDetailFragment(newsDetailFragment, frameLayout.id)}
            else{
                removeFragment(pair.first)
            }
        }
    }

    private fun removeFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction().remove(fragment).commit()
    }

    private fun openDetailFragment(fragment : Fragment?, @IdRes id : Int?){
        if(fragment == null && id == null){
            return
        }
        supportFragmentManager.beginTransaction().replace(id!!, fragment!!).commit()
    }

    private fun addFragment(fragment : Fragment, @IdRes id : Int){
        supportFragmentManager.beginTransaction().add(id, fragment).commit()
    }

    override fun onBackPressed() {
        for(pair in list){
            if(pair.second == selectedFrameLayoutId){
                openDetailFragment(pair.first, pair.second) }
            else{
                addFragment(pair.first, pair.second)
            }
        }
    }


}

