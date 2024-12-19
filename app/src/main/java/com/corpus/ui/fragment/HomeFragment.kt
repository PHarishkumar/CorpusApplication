package com.corpus.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.corpus.R
import com.corpus.databinding.FragmentHomeBinding
import com.corpus.interfaces.HomeInterface
import com.corpus.models.CarousalResponseModel
import com.corpus.ui.adapters.HomeAdapter
import com.corpus.ui.viewmodels.HomeViewModel


class HomeFragment : Fragment(), HomeInterface {
    private lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentHomeBinding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )

        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        homeViewModel.setInterface(this)
        homeViewModel.getCarouselData(requireActivity())

        return fragmentHomeBinding.root
    }

    override fun onCarousalDataSuccess(carousalResponseModel: CarousalResponseModel) {
        val layoutManager = LinearLayoutManager(context)
        val adapter = HomeAdapter(carousalResponseModel.getContent(), requireActivity())
        fragmentHomeBinding.mainRecyclerView.layoutManager = layoutManager
        fragmentHomeBinding.mainRecyclerView.adapter = adapter
    }

}