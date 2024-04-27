package com.art.myapplication_api.Crickbuzz.Adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.Crickbuzz.DataClasses.Matches
import com.art.myapplication_api.R

class StatusAdapter(var context: Context, var matches: ArrayList<Matches>) :
    RecyclerView.Adapter<StatusAdapter.Myclass>() {
    class Myclass(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txt: TextView

        init {
            txt = itemView.findViewById(R.id.text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myclass {

        var view = LayoutInflater.from(context).inflate(R.layout.first_layout, parent, false)

        return Myclass(view)
    }

    override fun getItemCount(): Int = matches.size

    override fun onBindViewHolder(holder: Myclass, position: Int) {

        holder.txt.setText(matches[position].matchInfo!!.status)
        Log.d("---===status", "status ==>: ${matches[position].matchInfo!!.status}")
        holder.txt.setOnClickListener {

        }


    }

}