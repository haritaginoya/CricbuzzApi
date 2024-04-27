package com.art.myapplication_api.NewsApi.Activity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.R

class NameAdapter(
    var context: Context,
    var mutableset: Array<String>,
    var contrynameMap: HashMap<String, String>
) : RecyclerView.Adapter<NameAdapter.ClassA>() {
    class ClassA(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txt: TextView

        init {
            txt = itemView.findViewById(R.id.text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassA {
        var view = LayoutInflater.from(context).inflate(R.layout.first_layout, parent, false)

        return ClassA(view)
    }

    override fun getItemCount(): Int = mutableset.size

    override fun onBindViewHolder(holder: ClassA, position: Int) {
        holder.txt.text = mutableset[position]

    }

}
