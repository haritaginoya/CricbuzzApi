package com.art.myapplication_api.Crickbuzz.Adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.Crickbuzz.Activity.SeriesName
import com.art.myapplication_api.Crickbuzz.DataClasses.TypeMatches
import com.art.myapplication_api.R

class FirstAdapter(
    var context: Context,
    var data: ArrayList<TypeMatches>

) :
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

        if(holder.txt.text != null)
        {
            holder.txt.setText(data[position].matchType)

        }
        else
        {
            holder.txt.visibility = View.GONE
        }

        Log.d("---===matchType", "matchType ==>: ${data[position].matchType}")
        holder.txt.setOnClickListener {

                context.startActivity(
                    Intent(context, SeriesName::class.java).putExtra(
                        "matchtype", data[position].seriesMatches
                    )
                )

        }


    }

}
