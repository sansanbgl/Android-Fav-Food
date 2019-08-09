package id.ac.its.dptsi.umarhasan.italiandish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.ac.its.dptsi.umarhasan.italiandish.model.Dish

class DetailDishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_dish)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var dish = intent.getParcelableExtra<Dish>("key")
        supportActionBar?.title = dish.name;
        val image = findViewById(R.id.img_item_photo) as ImageView
        Glide.with(this).load(dish.photo).apply(RequestOptions().override(350, 550)).into(image)


    }
}
