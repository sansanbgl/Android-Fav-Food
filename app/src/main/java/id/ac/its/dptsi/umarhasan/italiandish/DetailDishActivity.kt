package id.ac.its.dptsi.umarhasan.italiandish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import id.ac.its.dptsi.umarhasan.italiandish.model.Dish
import com.bumptech.glide.load.resource.bitmap.CenterCrop



class DetailDishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_dish)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val dish = intent.getParcelableExtra<Dish>("key")
        supportActionBar?.title = dish.name;
        val image = findViewById(R.id.img_item_photo) as ImageView
        var requestOptions = RequestOptions()
        requestOptions = requestOptions.transforms(CenterCrop(), RoundedCorners(16))
        Glide.with(this).load(dish.photo)
            .apply(requestOptions)
            .into(image)
        val from = findViewById(R.id.tv_item_from) as TextView
        val name = findViewById(R.id.tv_item_name) as TextView
        val desc = findViewById(R.id.tv_item_desc) as TextView
        val related = findViewById(R.id.tv_item_related) as TextView
        val misc = findViewById(R.id.tv_item_misc) as TextView
        name.setText(dish.name);
        from.setText(dish.from);
        desc.setText(dish.desc);
        related.setText(dish.related);
        misc.setText(dish.misc);

    }
}
