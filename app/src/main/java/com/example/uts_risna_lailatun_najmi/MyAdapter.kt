package com.example.uts_risna_lailatun_najmi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Context, private val nabi: List<Nabi>, val listener: (Nabi) -> Unit) :
    RecyclerView.Adapter<MyAdapter.NabiViewHolder>() {

    class NabiViewHolder(view : View): RecyclerView.ViewHolder(view) {

        val imgPhoto = view.findViewById<ImageView>(R.id.img_photo)
        val nameNabi = view.findViewById<TextView>(R.id.tv_name)
        val detNabi = view.findViewById<TextView>(R.id.tv_detail)

        fun bindView(nabi: Nabi, listener: (Nabi) -> Unit){
            imgPhoto.setImageResource(nabi.img_photo)
            nameNabi.text = nabi.tv_name
            detNabi.text = nabi.tv_detail
            itemView.setOnClickListener{
                listener(nabi)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NabiViewHolder {
        return NabiViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NabiViewHolder, position: Int) {
        holder.bindView(nabi[position], listener)
    }

    override fun getItemCount(): Int = nabi.size
}