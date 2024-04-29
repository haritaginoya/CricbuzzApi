package com.art.myapplication_api.NewsApi.Activity

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.R


class NameAdapter(
    var context: Context,
    var array: Array<String>,
    var flag: Array<String>

) : RecyclerView.Adapter<NameAdapter.ClassA>() {
    class ClassA(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txt: TextView

        init {
            txt = itemView.findViewById(R.id.txt)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassA {
        var view = LayoutInflater.from(context).inflate(R.layout.contry_layout, parent, false)

        return ClassA(view)
    }

    override fun getItemCount(): Int = array.size

    override fun onBindViewHolder(holder: ClassA, position: Int) {
        holder.txt.setText(flag[position]+array[position])

        holder.txt.setOnClickListener {

            context.startActivity(Intent(context,NewsActivity::class.java).putExtra("country_name",array[position]))
        }

    }

}
