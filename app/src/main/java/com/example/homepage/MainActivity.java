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

        String role;

        role = "manager";

        recyclerHome = findViewById(R.id.recyclerView);

        //Setting layout manager for our RecyclerView

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerHome.setLayoutManager(gridLayoutManager);
        //next create an adapter for the recyclerView in  HomeAdapter;

        if(role.equals("manager")) {
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




            imageDescriptionList.add("Start Shift");
            imageDescriptionList.add("End Shift");
            imageDescriptionList.add("Customer Add");
            imageDescriptionList.add("Pay Customer");
            imageDescriptionList.add("Expenses");
            imageDescriptionList.add("Commissions");
            imageDescriptionList.add("Loan Out");
            imageDescriptionList.add("Repayment");
            imageDescriptionList.add("Reports");
            imageDescriptionList.add("Logout");


        }
        //after list are ready we send it to the adapter
        recyclerHome.setAdapter(new HomeAdapter(imageList,imageDescriptionList));
        }
}