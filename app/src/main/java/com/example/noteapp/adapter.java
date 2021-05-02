package com.example.noteapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public  class adapter extends RecyclerView.Adapter<adapter.viewHolder> {
ArrayList<plan>plans;
public adapter(){
    plans= new ArrayList<>();
    plans.add(new plan(R.drawable.ic_baseline_delete_24,"studying") );
    plans.add(new plan(R.drawable.ic_baseline_delete_24,"playing") );
    plans.add(new plan(R.drawable.ic_baseline_delete_24,"eating") );
}
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_plan,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
holder.bind(plans.get(position));
    }

    @Override
    public int getItemCount() {
        return  plans.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView delete;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv);
            delete=itemView.findViewById(R.id.delete);
        }

        public void bind(plan plan) {
          tv.setText(String.valueOf(plan.getHobby()));
          delete.setImageResource(plan.getImage());
        }
    }

}
