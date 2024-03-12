package com.example.foodrecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;

import com.example.foodrecipe.Adapters.RecipeAdapter;
import com.example.foodrecipe.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        ArrayList <RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.biriyani,"Biriyani"));
        list.add(new RecipeModel(R.drawable.burger,"Burger"));
        list.add(new RecipeModel(R.drawable.pizza,"Pizza"));
        list.add(new RecipeModel(R.drawable.hotdog,"Hotdog"));
        list.add(new RecipeModel(R.drawable.eggbowl,"EggBowl"));
        list.add(new RecipeModel(R.drawable.biriyani,"Biriyani"));
        list.add(new RecipeModel(R.drawable.burger,"Burger"));
        list.add(new RecipeModel(R.drawable.pizza,"Pizza"));
        list.add(new RecipeModel(R.drawable.hotdog,"Hotdog"));
        list.add(new RecipeModel(R.drawable.eggbowl,"EggBowl"));
        list.add(new RecipeModel(R.drawable.biriyani,"Biriyani"));
        list.add(new RecipeModel(R.drawable.burger,"Burger"));
        list.add(new RecipeModel(R.drawable.pizza,"Pizza"));
        list.add(new RecipeModel(R.drawable.hotdog,"Hotdog"));
        list.add(new RecipeModel(R.drawable.eggbowl,"EggBowl"));

        //recyclerView needs an adapter and a layoutManager
        //for adapter we use an object of our customized adapter
        //there are three types of layout manager: linear: simple, plain, one col
        //grid: creates table with multiple columns
        //staggered: creates table both horizontally and vertically

        RecipeAdapter adapter = new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
        //this has vertical scrolling

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,
//                LinearLayoutManager.HORIZONTAL,false);
//        recyclerView.setLayoutManager(layoutManager);
        //this has horizontal scrolling

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3); //context, colNumber
//        recyclerView.setLayoutManager(gridLayoutManager);

        StaggeredGridLayoutManager staggerred = new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL); //colNumber, orientation
        recyclerView.setLayoutManager(staggerred);



    }
}