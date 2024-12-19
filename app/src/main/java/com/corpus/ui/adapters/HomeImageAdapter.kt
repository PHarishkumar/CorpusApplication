package com.corpus.ui.adapters

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView

import com.bumptech.glide.Glide
import com.corpus.R
import com.corpus.databinding.ItemHomeImageItemBinding
import com.corpus.models.MainContent
import com.squareup.picasso.Picasso


class HomeImageAdapter(
    private val mainContentList: List<MainContent>,
    private val activity: Activity
) : RecyclerView.Adapter<HomeImageAdapter.HomeImageVH>() {

    class HomeImageVH(private val binding: ItemHomeImageItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(mainContent: MainContent, context: Context) {
            val imageUrl = mainContent.mobileCarouselImage
            if (!imageUrl.isNullOrEmpty()) {

                try {
                    Picasso.get()
                        .setIndicatorsEnabled(true) // Show indicators for debugging

                    Picasso.get()
                        .load(mainContent.mobileCarouselImage)
                        .placeholder(R.drawable.empty_img) // Optional
                        .error(R.drawable.empty_img)       // Optional
                        .into(binding.imageView)
                } catch (e: Exception) {
                    Log.e("", "exception::" + e.message)
                }
            } else {
                // Optionally, set a placeholder or handle empty URL
                binding.imageView.setImageResource(R.drawable.ic_launcher_foreground)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeImageVH {
        val binding = DataBindingUtil.inflate<ItemHomeImageItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_home_image_item,
            parent,
            false
        )
        return HomeImageVH(binding)
    }

    override fun getItemCount(): Int {
        return mainContentList.size
    }

    override fun onBindViewHolder(holder: HomeImageVH, position: Int) {
        holder.bindData(mainContentList[position], holder.itemView.context)
    }
}