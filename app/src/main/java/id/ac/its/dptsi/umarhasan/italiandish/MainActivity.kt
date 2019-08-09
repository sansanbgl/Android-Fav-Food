package id.ac.its.dptsi.umarhasan.italiandish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.ac.its.dptsi.umarhasan.italiandish.adapter.CardViewDishAdapter
import id.ac.its.dptsi.umarhasan.italiandish.adapter.ListDishAdapter
import id.ac.its.dptsi.umarhasan.italiandish.model.Dish
import id.ac.its.dptsi.umarhasan.italiandish.model.DishesData
import android.content.Intent



class MainActivity : AppCompatActivity() {

    private lateinit var rvDishes: RecyclerView
    private var list: ArrayList<Dish> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDishes = findViewById(R.id.rv_dish);
        rvDishes.setHasFixedSize(true);

        list.addAll(DishesData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerList() {
        rvDishes.layoutManager = LinearLayoutManager(this)
        val listDishAdapter = ListDishAdapter(list)
        rvDishes.adapter = listDishAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerCardView() {
        rvDishes.layoutManager = LinearLayoutManager(this)
        val cardViewDishAdapter = CardViewDishAdapter(list)
        rvDishes.adapter = cardViewDishAdapter
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerCardView()
            }
            R.id.action_about -> {
                showAboutView()
            }
        }
    }

    private fun showAboutView(){
        val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(moveIntent)
    }
}
