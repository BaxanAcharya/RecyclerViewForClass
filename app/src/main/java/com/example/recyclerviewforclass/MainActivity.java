package com.example.recyclerviewforclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewforclass.adapter.ContactsAdapter;
import com.example.recyclerviewforclass.model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        //making list
        List<Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Bhuwan", "9845895452", R.drawable.bhuwan));
        contactsList.add(new Contacts("Dahayang", "9845203157", R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat", "9812457820", R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan", "9845895452", R.drawable.bhuwan));
        contactsList.add(new Contacts("Dahayang", "9845203157", R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat", "9812457820", R.drawable.saugat));
        ContactsAdapter contactsAdapter=new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
