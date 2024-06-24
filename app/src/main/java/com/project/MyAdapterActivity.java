package com.project;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MyAdapterActivity extends RecyclerView.Adapter<MyAdapterActivity.MyViewHolder> {
    Context context;
    ArrayList<PersonActivity> list;

    public MyAdapterActivity(Context context, ArrayList<PersonActivity> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.activity_items,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        PersonActivity pda =list.get(position);
        holder.nameview.setText(pda.getName());
        holder.numberview.setText(pda.getNumber());
        holder.amountview.setText(pda.getAmount());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nameview, numberview, amountview;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nameview = itemView.findViewById(R.id.nameview);
            numberview = itemView.findViewById(R.id.numberview);
            amountview = itemView.findViewById(R.id.amountview);
        }
    }
}