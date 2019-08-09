package id.ac.its.dptsi.umarhasan.italiandish.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.ac.its.dptsi.umarhasan.italiandish.R
import id.ac.its.dptsi.umarhasan.italiandish.model.Dish

class ListDishAdapter(private val listDish: ArrayList<Dish>) : RecyclerView.Adapter<ListDishAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvFrom: TextView = itemView.findViewById(R.id.tv_item_from)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_item_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListDishAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_dishes, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDish.size
    }

    override fun onBindViewHolder(holder: ListDishAdapter.ListViewHolder, position: Int) {
        val (name, from, photo, desc) = listDish[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvFrom.text = from
        holder.tvDesc.text = desc
    }

}