package id.ac.its.dptsi.umarhasan.italiandish.model

object DishesData {

    private var data = arrayOf(
        arrayOf(
            "Pizza",
            "Italy",
            "https://upload.wikimedia.org/wikipedia/commons/a/a3/Eq_it-na_pizza-margherita_sep2005_sml.jpg",
            "A dish of Italian origin, consisting of a flat round base of dough baked with a topping of tomatoes and cheese, typically with added meat, fish, or vegetables: ‘a cheese and tomato pizza",
            "Cheesy, Meaty, Vegan",
            "Avaiable in freshly baked, or frozen to the microwave"
        ),
        arrayOf(
            "Aglio e Olio",
            "Italy",
            "https://upload.wikimedia.org/wikipedia/commons/6/6f/Aglio_e_olio.jpg",
            "Spaghetti aglio e olio (pronounced [spaˈɡetti ˈaʎʎo e ˈɔːljo]; Italian for \"spaghetti [with] garlic and oil\") is a traditional Italian pasta dish from Naples. The dish is made by lightly sauteeing sliced, minced, or pressed garlic in olive oil, sometimes with the addition of dried red chili flakes (in which case its name is spaghetti aglio, olio e peperoncino), and tossing with spaghetti. Finely chopped parsley can also be added as a garnish, along with grated parmesan or pecorino cheese, although according to some traditional recipes, cheese should not be added.",
            "Vegan, Savory",
            "A type of pasta dishes"
        ),
        arrayOf(
            "Chicken parmigiana",
            "USA",
            "https://thehealthyfoodie.com/wp-content/uploads/2018/03/Chicken-Parmigiana-17.jpg",
            "dish that consists of breaded chicken breast covered in tomato sauce and mozzarella, parmesan, or provolone cheese.[1] A slice of ham or bacon is sometimes added.[2][3] It is also known colloquially in the United States as chicken parm[4] and in Australia as a parma, parmi, or parmy",
            "Meat, Cheese",
            ""
        ),
        arrayOf(
            "Ambrosia (Fruit Salad)",
            "USA",
            "https://upload.wikimedia.org/wikipedia/commons/3/3c/Ambrosia_salad.jpg",
            "Ambrosia is an American variety of fruit salad. Most ambrosia recipes contain: canned (often sweetened) or fresh pineapple, canned mandarin orange slices or fresh orange sections, miniature marshmallows,[1] and coconut.[2] Other ingredients might include various fruits and nuts: maraschino cherries, bananas, strawberries,[3] peeled grapes, and/or crushed pecans. Ambrosia can also include mayonnaise or dairy ingredients: whipped cream (or whipped topping like Cool Whip), sour cream, cream cheese, pudding, yoghurt, and/or cottage cheese.",
            "Fruit, Cheese, Eggs",
            "Nice fruit salad, most enjoyable when served cold"
        ),
        arrayOf(
            "Burger",
            "USA",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/RedDot_Burger.jpg/2560px-RedDot_Burger.jpg",
            "Hamburger is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, or flame broiled.",
            "Meat, Vegan, Flour",
            "Popular as fast food"
        ),
        arrayOf(
            "Steak",
            "Many Countries",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Beef_fillet_steak_with_mushrooms.jpg/600px-Beef_fillet_steak_with_mushrooms.jpg",
            "A high-quality beef taken from the hindquarters of the animal, typically cut into thick slices that are cooked by broiling or frying.",
            "Meat, Garnish Vegan",
            "Many countries has it's own style"
        ),
        arrayOf(
            "Sandwich",
            "United Kingdom",
            "https://upload.wikimedia.org/wikipedia/commons/e/e6/BLT_sandwich_on_toast.jpg",
            "A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein two or more pieces of bread serve as a container or wrapper for another food type.The sandwich began as a portable finger food in the Western world, though over time it has become prevalent worldwide.",
            "Meat, Bread, Cheese, Vegan",
            "Good choice for breakfast, and lunch"
        ),
        arrayOf(
            "Pancake",
            "Many Countries",
            "https://upload.wikimedia.org/wikipedia/commons/4/43/Blueberry_pancakes_%283%29.jpg",
            "a flat cake, often thin and round, prepared from a starch-based batter that may contain eggs, milk and butter and cooked on a hot surface such as a griddle or frying pan, often frying with oil or butter. Archaeological evidence suggests that pancakes were probably the earliest and most widespread cereal food eaten in prehistoric societies",
            "Flour, Eggs, Sugar, Syrup",
            "Many References regarding pancakes since it's so general"
        ),
        arrayOf(
            "Lasagna",
            "Italy",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Lasagne_-_stonesoup.jpg/1920px-Lasagne_-_stonesoup.jpg",
            "a type of wide, flat pasta, possibly one of the oldest types of pasta. Lasagne, or the singular lasagna, commonly refers to a culinary dish made with stacked layers of pasta alternated with sauces and ingredients such as meats, vegetables and cheese, and sometimes topped with melted grated cheese.Typically, the cooked pasta is assembled with the other ingredients and then baked in an oven. The resulting lasagne casserole is cut into single-serving square portions",
            "Durum Wheat, Meat, Tomato",
            "Another form of spagetti"
        ),
        arrayOf(
            "Rissoto",
            "Italy",
            "https://www.tasteofhome.com/wp-content/uploads/2018/05/Parmesan-Risotto_EXPS_HPLBZ18_33569_B05_18_5b-696x696.jpg",
            "Risotto is a northern Italian rice dish cooked with broth until it reaches a creamy consistency. The broth can be derived from meat, fish, or vegetables. Many types of risotto contain butter, onion, white wine, and parmesan cheese. It is one of the most common ways of cooking rice in Italy",
            "Arborio Rice, Chicken/Meat Stock, Cheese",
            "A Creamy italian Dish"
        )
    )
    val listData: ArrayList<Dish>
        get() {
            val list = ArrayList<Dish>()
            for (aData in data) {
                val dish = Dish()
                dish.name = aData[0]
                dish.from = aData[1]
                dish.photo = aData[2]
                dish.desc = aData[3]
                dish.related = aData[4]
                dish.misc = aData[5]
                list.add(dish)
            }
            return list
        }
}