package com.example.web_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

    List<Data> dataList;
    Context context;

    public DataAdapter(Context context, List<Data> datas){
        this.context = context;
        dataList = datas;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {

        Data data = dataList.get(position);
        holder.title.setText("Name: " + data.getIdDrink());
        holder.category.setText("Category: " + data.getStrCategory());
        holder.tags.setText("Tags: " + data.getStrTags());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder{
        TextView title, category, tags;
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            category = itemView.findViewById(R.id.category);
            tags = itemView.findViewById(R.id.tags);
        }
    }
}
