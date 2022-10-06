package com.example.tabactivity.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.tabactivity.Models.Friend
import com.example.tabactivity.R

class FriendAdapter(val context: Context, val friendsList: List<Friend>) :
    RecyclerView.Adapter<FriendViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val itemView: View =
            LayoutInflater.from(context).inflate(R.layout.layout_friend, parent, false)

        return FriendViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        val friend=friendsList[position]
        holder.name.text = friend.name
        holder.image.setImageResource(friend.image)
        holder.loc.text = friend.location
        //set the favorite friends
        if (friend.fav)
        holder.fav.setImageResource(R.drawable.ic_baseline_red_favorite_24)
    }

    override fun getItemCount(): Int = friendsList.size


}

class FriendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val name = itemView.findViewById<TextView>(R.id.name)
    val image = itemView.findViewById<ImageView>(R.id.avatar)
    val loc = itemView.findViewById<TextView>(R.id.location)
    val fav = itemView.findViewById<ImageButton>(R.id.fav)


}
