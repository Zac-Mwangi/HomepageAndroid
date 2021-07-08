package com.example.homepage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeView> {

    List<Integer> imageList;
    List<String> imageDescriptionList;
    Context mContext;


    public HomeAdapter(List<Integer> imageList, List<String> imageDescriptionList) {
        this.imageList = imageList;
        this.imageDescriptionList = imageDescriptionList;
    }

    //before passing anything create a view class
    //finally implement methods

    @NonNull
    @Override
    public HomeView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        //pass the layout resource file ie row_home
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home,parent,false);
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home,parent,false);
        mContext = parent.getContext();

        return  new HomeView(view);//pass the object we created
        //We have adapter ready so lets keep the data ready ie in main activity page

        //OR
        //HomeView holder = new HomeView(view);
       // return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull HomeView holder, final int position) {

        //passing values
        holder.image.setImageResource(imageList.get(position));
        holder.imageDescr.setText(imageDescriptionList.get(position));

        //finally run
        holder.hCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String page = imageDescriptionList.get(position);
                if(page.equals(mContext.getResources().getString(R.string.start))){
                    Toast.makeText(mContext, "Start", Toast.LENGTH_SHORT).show();
                }
                if(page.equals(mContext.getResources().getString(R.string.end))){
                    Toast.makeText(mContext, "end", Toast.LENGTH_SHORT).show();
                }
                if(page.equals(mContext.getResources().getString(R.string.customer_add))){
                    Toast.makeText(mContext, "customer_add", Toast.LENGTH_SHORT).show();
                }
                if(page.equals(mContext.getResources().getString(R.string.pay_cust))){
                    Toast.makeText(mContext, "pay customer", Toast.LENGTH_SHORT).show();
                }
                if(page.equals(mContext.getResources().getString(R.string.exp))){
                    Toast.makeText(mContext, "expenses", Toast.LENGTH_SHORT).show();
                }
                if(page.equals(mContext.getResources().getString(R.string.comm))){
                    Toast.makeText(mContext, "commission", Toast.LENGTH_SHORT).show();
                }
                if(page.equals(mContext.getResources().getString(R.string.loan))){
                    Toast.makeText(mContext, "loan", Toast.LENGTH_SHORT).show();
                }
                if(page.equals(mContext.getResources().getString(R.string.rep))){
                    Toast.makeText(mContext, "repayment", Toast.LENGTH_SHORT).show();
                }
                if(page.equals(mContext.getResources().getString(R.string.report))){
                    Toast.makeText(mContext, "report", Toast.LENGTH_SHORT).show();
                }
                if(page.equals(mContext.getResources().getString(R.string.log))){
                    Toast.makeText(mContext, "logout", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    @Override
    public int getItemCount() {
        return imageList.size();
    }

    //before passing anything create a view class
    public class HomeView extends RecyclerView.ViewHolder{
        ImageView image;
        TextView imageDescr;
        CardView hCV;
    //create constructor of that view
        public HomeView(@NonNull View itemView) {
            super(itemView);

            imageDescr = itemView.findViewById(R.id.imageDescription);
            image = itemView.findViewById(R.id.image);
            hCV = itemView.findViewById(R.id.hCV);
        }
    }
}