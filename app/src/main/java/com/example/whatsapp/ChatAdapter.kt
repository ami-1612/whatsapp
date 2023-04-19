package com.example.whatsapp

import androidx.recyclerview.widget.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ChatAdapter(names: ArrayList<ModelData>) : RecyclerView.Adapter<ChatAdapter.ChatHolder>() {

    var names = names

    class ChatHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var nameItem = itemView.findViewById<TextView>(R.id.namesItem)
        var profile = itemView.findViewById<ImageView>(R.id.profile)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {
        return ChatHolder (LayoutInflater.from(parent.context).inflate(R.layout.chat_item,parent,false))

    }

    override fun onBindViewHolder(holder: ChatHolder, position: Int) {
        holder.nameItem.text =names.get(position).name
        holder.profile.setImageResource (names.get(position).img)

    }

    override fun getItemCount(): Int {
        return names.size
    }
}