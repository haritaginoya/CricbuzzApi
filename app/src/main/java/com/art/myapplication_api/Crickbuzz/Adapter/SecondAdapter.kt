package com.art.myapplication_api.Crickbuzz.Adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.Crickbuzz.Activity.Status
import com.art.myapplication_api.Crickbuzz.DataClasses.SeriesMatches
import com.art.myapplication_api.R

class SecondAdapter(var context: Context, var seriesMatches: ArrayList<SeriesMatches>) :
    RecyclerView.Adapter<SecondAdapter.Myclass>() {
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

    override fun getItemCount(): Int = seriesMatches.size

    override fun onBindViewHolder(holder: Myclass, position: Int) {
        if(seriesMatches[position].seriesAdWrapper!!.seriesName != null)
        {
            holder.txt.setText(seriesMatches[position].seriesAdWrapper!!.seriesName)
        }
        else
        {
            holder.txt.visibility = View.GONE
        }

        Log.d("---===seriesName", "seriesName == >: ${seriesMatches[position].seriesAdWrapper!!.seriesName}")
        holder.txt.setOnClickListener {
            var intent = Intent(context, Status::class.java).putExtra("matches", seriesMatches[position].seriesAdWrapper!!.matches)
            context.startActivity(intent)

        }


    }

}