package com.example.cardviewwithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=findViewById(R.id.rv1);

        ArrayList<food_iteam> al = new ArrayList<food_iteam>();
        al.add(new food_iteam(R.drawable.hotdog,"Hot Dog","Small - 120 TK \n Medium - 150 TK \n Large - 180 TK "));
        al.add(new food_iteam(R.drawable.pasta,"Regular Pasta","Small - 150 TK \n Medium - 180 TK \n Large - 200 TK "));
        al.add(new food_iteam(R.drawable.ovenbakedpasta,"Oven Baked Pasta","Small - 180 TK \n Medium - 200 TK \n Large - 220 TK "));

        al.add(new food_iteam(R.drawable.pizza,"Pizza","Small - 120 TK \n Medium - 150 TK \n Large - 180 TK "));
        al.add(new food_iteam(R.drawable.cheesepizza,"Cheesy Pizza","Small - 150 TK \n Medium - 180 TK \n Large - 200 TK "));
        al.add(new food_iteam(R.drawable.spicypizza,"Cheesy Spicy Burger","Small - 180 TK \n Medium - 200 TK \n Large - 220 TK "));
        al.add(new food_iteam(R.drawable.regularburger,"Regular Burger","Small - 120 TK \n Medium - 150 TK \n Large - 180 TK "));
        al.add(new food_iteam(R.drawable.chessyburger,"Cheesy Burger","Small - 150 TK \n Medium - 180 TK \n Large - 200 TK "));
        al.add(new food_iteam(R.drawable.frenchfry,"Frenchfry","Small - 70 TK \n Medium - 80 TK \n Large - 100 TK "));
        al.add(new food_iteam(R.drawable.chickenwings,"Chicken Wings","Small - 120 TK \n Medium - 150 TK \n Large - 180 TK "));
        al.add(new food_iteam(R.drawable.chickenloli,"Chicken Loli","Small - 150 TK \n Medium - 180 TK \n Large - 200 TK "));
        al.add(new food_iteam(R.drawable.bbqchicken,"BBQ Chicken","Small - 150 TK \n Medium - 180 TK \n Large - 200 TK "));
        al.add(new food_iteam(R.drawable.friedchicken,"Chicken Fry","Small - 120 TK \n Medium - 150 TK \n Large - 180 TK "));
        al.add(new food_iteam(R.drawable.mangojuice,"Mango Juice","Small - 80 TK \n Medium - 100 TK \n Large - 120 TK "));
        al.add(new food_iteam(R.drawable.coke,"Coca Cola","Small - 30 TK \n Medium - 40 TK \n Large - 50 TK \n sdkjfhdsjfhbf \n skjfhbjshff "));

        foodAdapter adapter = new foodAdapter(MainActivity.this,al);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        r.setLayoutManager(linearLayoutManager);
//        r.setAdapter(adapter);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,2,GridLayoutManager.VERTICAL,true);
//        r.setLayoutManager(gridLayoutManager);
//        r.setAdapter(adapter);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

        r.setLayoutManager(staggeredGridLayoutManager);
        r.setAdapter(adapter);

    }
}
