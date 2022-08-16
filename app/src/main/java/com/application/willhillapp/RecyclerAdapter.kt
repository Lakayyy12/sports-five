package com.application.willhillapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
    val onItemClicked: OnContentClickListener
): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    //Title and Description
    private var titles = arrayOf("Basketball", "Football", "Baseball", "Soccer", "Horse Racing", "Auto Racing", "Boxing/MMA", "Hockey")
    private var details = arrayOf("Basketball Betting Guide",
        "Football Betting Guide",
        "Baseball Betting Guide",
        "Soccer Betting Guide",
        "Horse Racing Betting Guide",
        "Auto Racing Betting Guide",
        "Boxing/Mma Betting Guide",
        "Hockey Betting Guide")

    private var contents = intArrayOf(R.string.basketball, R.string.football, R.string.baseball, R.string.soccer, R.string.horse_racing, R.string.auto_racing, R.string.boxing_mma, R.string.hockey)

    //Images
    private var images = intArrayOf(R.drawable.con1,R.drawable.con2,R.drawable.con3,R.drawable.con4,R.drawable.con5,R.drawable.con6,R.drawable.con7,R.drawable.con8)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return  titles.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])

        holder.itemView.setOnClickListener{
            onItemClicked.OnContentItemClicked(images[position], contents[position])
        }
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.item_image)
        var itemTitle: TextView = itemView.findViewById(R.id.item_title)
        var itemDetail: TextView = itemView.findViewById(R.id.item_detail)
    }
}