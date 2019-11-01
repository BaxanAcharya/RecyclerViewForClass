package com.example.recyclerviewforclass.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewforclass.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter {

public class ContactsViewHolder extends RecyclerView.ViewHolder{

    CircleImageView imgProfile;
    TextView textViewname;
    TextView textViewphone;

    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
        imgProfile=itemView.findViewById(R.id.imgProfile);
        textViewname=itemView.findViewById(R.id.textViewname);
        textViewphone=itemView.findViewById(R.id.textViewphone);

    }
}

}
