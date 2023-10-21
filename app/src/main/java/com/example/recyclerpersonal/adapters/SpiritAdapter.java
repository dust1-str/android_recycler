package com.example.recyclerpersonal.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerpersonal.R;
import com.example.recyclerpersonal.models.Spirit;

import java.util.List;

public class SpiritAdapter extends RecyclerView.Adapter<SpiritAdapter.ViewHolder> {
    private List<Spirit> espiritus;

    public SpiritAdapter(List<Spirit> espiritus) {
        this.espiritus = espiritus;
    }

    @NonNull
    @Override
    public SpiritAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.spirititem, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SpiritAdapter.ViewHolder holder, int position) {
        Spirit s = espiritus.get(position);
        holder.setData(s);
    }

    @Override
    public int getItemCount() {
        return espiritus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtnombre, txtcolor, txtarma;
        Spirit spiritHolder;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtnombre=itemView.findViewById(R.id.txtNombre);
            txtcolor=itemView.findViewById(R.id.txtColor);
            txtarma=itemView.findViewById(R.id.txtArma);
        }

        public void setData(Spirit s) {
            this.spiritHolder = s;
            txtnombre.setText(s.getNombre());
            txtcolor.setText(s.getColor());
            txtarma.setText(s.getArma().getNombre());
        }
    }
}
