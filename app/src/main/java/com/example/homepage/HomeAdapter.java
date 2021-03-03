package com.example.homepage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeView> {

    List<Integer> imageList = new ArrayList<>();
    List<String> imageDescriptionList = new ArrayList<>();

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
        return  new HomeView(view);//pass the object we created
        //We have adapter ready so lets keep the data ready ie in main activity page

        //OR
        //HomeView holder = new HomeView(view);
       // return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull HomeView holder, int position) {

        //passing values
        holder.image.setImageResource(imageList.get(position));
        holder.imageDescr.setText(imageDescriptionList.get(position));





        //finally run

    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    //before passing anything create a view class
    public class HomeView extends RecyclerView.ViewHolder{
        ImageView image;
        TextView imageDescr;
    //create constructor of that view
        public HomeView(@NonNull View itemView) {
            super(itemView);

            imageDescr = (TextView)itemView.findViewById(R.id.imageDescription);
            image = (ImageView)itemView.findViewById(R.id.image);
        }
    }
}