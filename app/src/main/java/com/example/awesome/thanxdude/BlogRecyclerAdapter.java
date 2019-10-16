package com.example.awesome.thanxdude;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;


import com.bumptech.glide.Glide;

import java.util.List;


import androidx.annotation.NonNull;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;

public class BlogRecyclerAdapter extends RecyclerView.Adapter<BlogRecyclerAdapter.ViewHolder> {

    public List<BlogPost> blog_list1;
    public Context mContext;



    public BlogRecyclerAdapter(List<BlogPost> blog_list){
            this.blog_list1 = blog_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.blog_list_item, parent,false);

        mContext = parent.getContext();

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String desc_data = blog_list1.get(position).getDesc();
        holder.setDescText(desc_data);

        String image_url = blog_list1.get(position).getImage_url();
        holder.setBlogImage(image_url);
    }

    @Override
    public int getItemCount() {
        return blog_list1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private View mView;
        private EditText descView;
        private ImageView blogImageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;


        }
        public void setDescText(String desctext){
            descView = mView.findViewById(R.id.blog_desc);
            descView.setText(desctext);
        }

        public void setBlogImage(String DownloadUri){
            blogImageView = mView.findViewById(R.id.blog_image);
            Glide.with(mContext).load(DownloadUri).into(blogImageView);
        }

    }

}
