package com.example.recyclerviewforclass.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewforclass.R;
import com.example.recyclerviewforclass.model.Contacts;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter  extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>{

    Context mContext;
    List<Contacts> contactsList;

    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //view holder ma attach garni

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contacts,parent, false);
        return new ContactsViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
    //data lai set garni
        Contacts contacts=contactsList.get(position);
        holder.imgProfile.setImageResource(contacts.getImageId());
        holder.textViewphone.setText(contacts.getPhoneNo());
        holder.textViewname.setText(contacts.getName());
    }

    @Override
    public int getItemCount() {
        //kati ota data dekhauni
        return contactsList.size();
    }


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
