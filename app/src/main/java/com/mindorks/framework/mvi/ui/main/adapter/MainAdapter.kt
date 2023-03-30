package com.mindorks.framework.mvi.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.framework.mvi.R
import com.mindorks.framework.mvi.data.model.User
import com.mindorks.framework.mvi.ui.main.viewholder.MainViewHolder

class MainAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_layout,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = users.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(users[position])
    }

    fun addData(list: List<User>) {
        users.addAll(list)
        for (i in list.indices) {
            notifyItemInserted(users.size - 1 + i)
        }

    }

    fun removeData(position: Int) {
        users.removeAt(position)
        notifyItemRemoved(position)
    }

    fun removeData(user: User) {
        users.remove(user)
        notifyItemRemoved(users.indexOfFirst { v -> v.name == user.name })
    }

    fun clearData() {
        users.clear()
        notifyDataSetChanged()

    }
}