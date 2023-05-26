package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MhsAdapter extends RecyclerView.Adapter<MhsAdapter.MhasVH>{

    private ArrayList<Mhs> mhslist;

    public MhsAdapter(ArrayList<Mhs> mhslist) {
        this.mhslist = mhslist;
    }

    @NonNull
    @Override
    public MhasVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.item_listmhs, parent, false);

        return new MhasVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MhasVH holder, int position) {
        holder.tvNamaVal.setText(mhslist.get(position).getNama());
        holder.tvNimVal.setText(mhslist.get(position).getNim());
        holder.tvNoHpVal.setText(mhslist.get(position).getnoHp());
    }

    @Override
    public int getItemCount() {
        return mhslist.size();
    }

    public class MhasVH extends RecyclerView.ViewHolder {

        private TextView tvNamaVal, tvNimVal, tvNoHpVal;

        public MhasVH(@NonNull View itemView) {
            super(itemView);

            tvNamaVal = itemView.findViewById(R.id.tvNamaVal);
            tvNimVal = itemView.findViewById(R.id.tvNimVal);
            tvNoHpVal = itemView.findViewById(R.id.tvNoHpVal);

        }
    }
}