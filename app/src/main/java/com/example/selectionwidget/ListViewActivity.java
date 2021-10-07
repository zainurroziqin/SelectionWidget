package com.example.selectionwidget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView listViewMonth;
    String[] month;
    private RecyclerView rvHeroes;
    private ArrayList<Adapter> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        rvHeroes = findViewById(R.id.listView);
        rvHeroes.setHasFixedSize(true);

        list.addAll(DataAdapter.getListData());
        showRecyclerList();





//        listViewMonth = findViewById(R.id.lvMonth);
//        month = new DateFormatSymbols().getMonths();
//        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, month);
//        listViewMonth.setAdapter(monthAdapter);
//        listViewMonth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                String month = ((TextView) view).getText().toString();
//                Toast.makeText(getApplicationContext(), "Clicked : " + month, Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    private void showRecyclerList(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(list);
        rvHeroes.setAdapter(listAdapter);
        listAdapter.setOnItemClickCallback(new ListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Adapter data) {
                showSelected(data);
            }
        });
    }

    private void showSelected(Adapter makanan){
        Toast.makeText(this, "Kamu memilih " + makanan.getName(), Toast.LENGTH_SHORT).show();
    }
}