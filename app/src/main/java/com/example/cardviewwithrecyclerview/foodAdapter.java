package com.example.cardviewwithrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<food_iteam > al;
    foodAdapter(Context context, ArrayList<food_iteam> al){
        this.context=context;
        this.al=al;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v =layoutInflater.inflate(R.layout.row,parent,false);
        MyViewHolder mvh = new MyViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.img.setImageResource(al.get(position).image);
        holder.foodname.setText(al.get(position).name);
        holder.fooddes.setText(al.get(position).details);

    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView foodname,fooddes;
        ImageView img;
        public MyViewHolder(View itemView){
            super(itemView);
            foodname = itemView.findViewById(R.id.tvname);
            fooddes = itemView.findViewById(R.id.tvdes);
            img=itemView.findViewById(R.id.img);
        }

    }
}
