package com.art.myapplication_api.Adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.Activity.SeriesName
import com.art.myapplication_api.R

class FirstAdapter(var context: Context, var data: ArrayList<String>, var activiti_id: Int) :
    RecyclerView.Adapter<FirstAdapter.Myclass>() {
    class Myclass(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txt: TextView

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
        Log.d("---===tesssst", "onBindViewHolder: ${data[position]}")
        holder.txt.setOnClickListener {

            if (activiti_id == 1) {
                context.startActivity(
                    Intent(context, SeriesName::class.java).putExtra(
                        "seriesname", data[position]
                    )
                )
            }
        }


    }

}
