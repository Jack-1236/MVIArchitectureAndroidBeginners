package com.mindorks.framework.mvi.ui.main.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mindorks.framework.mvi.data.model.User
import com.mindorks.framework.mvi.databinding.ItemLayoutBinding

class MainViewHolder(private val itemBinding: ItemLayoutBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {
    fun getDataBinding() = itemBinding


    fun bind(user: User) {
        itemBinding.userData = user
        itemBinding.executePendingBindings()
        Glide.with(itemBinding.imageViewAvatar.context)
            .load(user.avatar)
            .into(itemBinding.imageViewAvatar)
    }
}