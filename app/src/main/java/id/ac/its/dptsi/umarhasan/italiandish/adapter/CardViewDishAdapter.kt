package id.ac.its.dptsi.umarhasan.italiandish.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
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
import id.ac.its.dptsi.umarhasan.italiandish.DetailDishActivity
import id.ac.its.dptsi.umarhasan.italiandish.R
import id.ac.its.dptsi.umarhasan.italiandish.model.Dish

class CardViewDishAdapter (private val listDish: ArrayList<Dish>): RecyclerView.Adapter<CardViewDishAdapter.CardViewViewHolder>() {

    private var context: Context? = null

    inner class CardViewViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        override fun onClick(p0: View?) {

        }

        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvFrom: TextView = itemView.findViewById(R.id.tv_item_from)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_item_desc)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
        lateinit var dish: Dish
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        context = parent.context
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_dishes, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDish.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val (name, from, photo, desc) = listDish[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvFrom.text = from
        holder.tvDesc.text = desc
        holder.btnDetail.setOnClickListener {
            val intent = Intent(context, DetailDishActivity::class.java)
            intent.putExtra("key", listDish[position])
            context?.startActivity(intent)
        }
        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listDish[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
    }
}
