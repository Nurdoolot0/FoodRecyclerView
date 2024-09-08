package com.example.foodrecyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodrecyclerview.databinding.ItemFoodBinding;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private ArrayList<Food> foodList;

    public FoodAdapter(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemFoodBinding binding = ItemFoodBinding.inflate(inflater, parent, false);
        return new FoodViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food = foodList.get(position);
        holder.binding.foodName.setText(food.getName());
        holder.binding.foodDescription.setText(food.getDescription());

        // Используем Glide для загрузки изображений с интернета
        Glide.with(holder.binding.foodImage.getContext())
                .load(food.getImageUrl())
                .into(holder.binding.foodImage);
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        ItemFoodBinding binding;

        public FoodViewHolder(ItemFoodBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
