package com.corpus.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.corpus.R
import com.corpus.databinding.ItemHomeTextItemBinding
import com.corpus.models.MainContent


class HomeTextAdapter(mainContentList: ArrayList<MainContent>) :
    RecyclerView.Adapter<HomeTextAdapter.HomeTextVH>() {
    val mainContentTextList = mainContentList

    class HomeTextVH(itemView: ItemHomeTextItemBinding) : ViewHolder(itemView.root) {
        private val itemHomeImageItemBinding = itemView
        fun bindData(mainContent: MainContent) {
            itemHomeImageItemBinding.textView.text = "" + mainContent.id

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeTextVH {
        var binding = DataBindingUtil.inflate<ItemHomeTextItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_home_text_item,
            parent,
            false
        )
        return HomeTextVH(binding)
    }

    override fun getItemCount(): Int {
        return mainContentTextList.size
    }

    override fun onBindViewHolder(holder: HomeTextVH, position: Int) {
        holder.bindData(mainContentTextList[position])
    }
}