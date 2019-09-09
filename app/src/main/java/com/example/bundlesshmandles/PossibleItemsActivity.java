package com.example.bundlesshmandles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class PossibleItemsActivity extends AppCompatActivity {

    ArrayList<String> shoppingItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_possible_items);

        shoppingItems = new ArrayList<>();
        shoppingItems.add("Orange");
        shoppingItems.add("Banana");
        shoppingItems.add("Cucumber");
        shoppingItems.add("Bread");
        shoppingItems.add("Honey");
        shoppingItems.add("Milk");
        shoppingItems.add("Fish");
        shoppingItems.add("Chips");
        shoppingItems.add("Cookies");
        shoppingItems.add("Seaweed");
        shoppingItems.add("Pumpkin");
        shoppingItems.add("Apple");
        shoppingItems.add("Tomatoes");
        shoppingItems.add("Laundry detergent");
        shoppingItems.add("Dill");
        shoppingItems.add("Parsley");
        shoppingItems.add("Eggs");
        shoppingItems.add("Yogurt");
        shoppingItems.add("Onion");
        shoppingItems.add("Salt");
        shoppingItems.add("Sugar");
        shoppingItems.add("Pepper");
        shoppingItems.add("Zucchini");
        shoppingItems.add("Eggplant");
        shoppingItems.add("Spinach");
        shoppingItems.add("Arugula");
        shoppingItems.add("Lettuce");
        shoppingItems.add("Basil");
        shoppingItems.add("Cheese");
        shoppingItems.add("Mozzarella");
        shoppingItems.add("Sour Cream");
        shoppingItems.add("Juice");
        shoppingItems.add("Beer");
        shoppingItems.add("Tea");
        shoppingItems.add("Coffee");

    }
}
