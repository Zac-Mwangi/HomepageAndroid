package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerHome;
    List<Integer> imageList = new ArrayList<>();
    List<String> imageDescriptionList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }
    public void initialize(){


        recyclerHome = findViewById(R.id.recyclerView);

        //Setting layout manager for our RecyclerView

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerHome.setLayoutManager(gridLayoutManager);
        //next create an adapter for the recyclerView in  HomeAdapter;

        imageList.add(R.drawable.openshift);
        imageList.add(R.drawable.close);
        imageList.add(R.drawable.account);
        imageList.add(R.drawable.tick_mark);
        imageList.add(R.drawable.expenses);
        imageList.add(R.drawable.commission);
        imageList.add(R.drawable.loan);
        imageList.add(R.drawable.pay);
        imageList.add(R.drawable.report2);
        imageList.add(R.drawable.logout3);

        imageDescriptionList.add(getResources().getString(R.string.start));
        imageDescriptionList.add(getResources().getString(R.string.end));
        imageDescriptionList.add(getResources().getString(R.string.customer_add));
        imageDescriptionList.add(getResources().getString(R.string.pay_cust));
        imageDescriptionList.add(getResources().getString(R.string.exp));
        imageDescriptionList.add(getResources().getString(R.string.comm));
        imageDescriptionList.add(getResources().getString(R.string.loan));
        imageDescriptionList.add(getResources().getString(R.string.rep));
        imageDescriptionList.add(getResources().getString(R.string.report));
        imageDescriptionList.add(getResources().getString(R.string.log));
        //after list are ready we send it to the adapter
        recyclerHome.setAdapter(new HomeAdapter(imageList,imageDescriptionList));
        }
}