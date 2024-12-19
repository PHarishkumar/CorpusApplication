package com.corpus.ui.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.corpus.R
import com.corpus.databinding.ItemHomeBinding
import com.corpus.databinding.ItemHomeImageBinding
import com.corpus.models.ContentModel


class HomeAdapter(mainContentList: ArrayList<ContentModel>, activity: Activity) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val mainContentImageList = mainContentList
    val context = activity
    private val TYPE_TEXT = 0
    private val TYPE_IMAGE = 1

    override fun getItemViewType(position: Int): Int {
        return if (mainContentImageList[position].contentType == "CAROUSEL_AD") {
            TYPE_IMAGE
        } else {
            TYPE_TEXT
        }
    }

    class TextVH(itemView: ItemHomeBinding) : ViewHolder(itemView.root) {
        private val itemHomeBinding = itemView
        fun bindData(mainContent: ContentModel, context: Activity) {
            itemHomeBinding.textViewHeader.text = mainContent.title
            val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            val adapter = HomeTextAdapter(mainContent.getContent())
            itemHomeBinding.recyclerViewText.layoutManager = layoutManager
            itemHomeBinding.recyclerViewText.adapter = adapter
        }
    }

    class ImageVH(itemView: ItemHomeImageBinding) : ViewHolder(itemView.root) {
        private val itemHomeImageBinding = itemView
        fun bindData(mainContent: ContentModel, context: Activity) {
            itemHomeImageBinding.textViewHeader.text = mainContent.title
            val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            val adapter = HomeImageAdapter(mainContent.getContent(), context)
            itemHomeImageBinding.recyclerViewImage.layoutManager = layoutManager
            itemHomeImageBinding.recyclerViewImage.adapter = adapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_TEXT) {
            var binding = DataBindingUtil.inflate<ItemHomeBinding>(
                LayoutInflater.from(parent.context), R.layout.item_home, parent, false
            )
            return TextVH(binding)
        } else {
            var binding = DataBindingUtil.inflate<ItemHomeImageBinding>(
                LayoutInflater.from(parent.context), R.layout.item_home_image, parent, false
            )
            return ImageVH(binding)
        }
    }

    override fun getItemCount(): Int {
        return mainContentImageList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ImageVH) holder.bindData(mainContentImageList[position], context)
        else if (holder is TextVH) {
            holder.bindData(mainContentImageList[position], context)
        }
    }
}