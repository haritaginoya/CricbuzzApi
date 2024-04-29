package com.art.myapplication_api.NewsApi.Activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.NewsApi.DataClass.Articles
import com.art.myapplication_api.R
import java.util.ArrayList

class MyNewsAdapter(var newsActivity: NewsActivity, var articles: ArrayList<Articles>) :
    RecyclerView.Adapter<MyNewsAdapter.MynewsClass>() {
    class MynewsClass(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MynewsClass {

        var vv = LayoutInflater.from(newsActivity).inflate(R.layout.abc, parent, false)
        return MynewsClass(vv)
    }

    override fun getItemCount(): Int = articles.size
    override fun onBindViewHolder(holder: MynewsClass, position: Int) {

    }

}
