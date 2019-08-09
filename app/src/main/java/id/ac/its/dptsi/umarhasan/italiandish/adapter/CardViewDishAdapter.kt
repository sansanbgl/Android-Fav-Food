package id.ac.its.dptsi.umarhasan.italiandish.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.ac.its.dptsi.umarhasan.italiandish.R
import id.ac.its.dptsi.umarhasan.italiandish.model.Dish

class CardViewDishAdapter (private val listDish: ArrayList<Dish>): RecyclerView.Adapter<CardViewDishAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvFrom: TextView = itemView.findViewById(R.id.tv_item_from)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_item_desc)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDishAdapter.CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_dishes, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDish.size
    }

    override fun onBindViewHolder(holder: CardViewDishAdapter.CardViewViewHolder, position: Int) {
        val (name, from, photo, desc) = listDish[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvFrom.text = from
        holder.tvDesc.text = desc
        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listDish[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listDish[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listDish[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }    }
}
