package com.art.myapplication_api.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.Activity.MainActivity
import com.art.myapplication_api.R

class FirstAdapter(var context : MainActivity, var data : ArrayList<String>) :
    RecyclerView.Adapter<FirstAdapter.Myclass>() {
    class Myclass(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txt : TextView
        init {
            txt = itemView.findViewById(R.id.text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myclass {

        var view = LayoutInflater.from(context).inflate(R.layout.first_layout,parent,false)

        return Myclass(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: Myclass, position: Int) {

        holder.txt.setText(data[position])


    }

}
