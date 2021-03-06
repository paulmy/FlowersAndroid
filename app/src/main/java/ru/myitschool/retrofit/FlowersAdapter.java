package ru.myitschool.retrofit;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;


public class FlowersAdapter extends RecyclerView.Adapter<FlowersAdapter.ViewHolder> {

    private List<Flower> flowers;

    public FlowersAdapter(List<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Flower post = flowers.get(position);
        holder.image.setImageResource(R.mipmap.ic_launcher);
        holder.name.setText(post.getName());
        holder.category.setText(post.getCategory());
        holder.price.setText(post.getPrice());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            holder.insruct.setText(Html.fromHtml(post.getElementPureHtml(), Html.FROM_HTML_MODE_LEGACY));
        } else {
            holder.insruct.setText(Html.fromHtml(post.getElementPureHtml()));
        }

    }


    @Override
    public int getItemCount() {
        if (flowers == null)
            return 0;
        return flowers.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        TextView insruct;
        TextView price;
        TextView category;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.postitem_name);
            price = (TextView) itemView.findViewById(R.id.postitem_price);
            insruct = (TextView) itemView.findViewById(R.id.postitem_instuction);
            category = (TextView) itemView.findViewById(R.id.postitem_category);
        }
    }
}
