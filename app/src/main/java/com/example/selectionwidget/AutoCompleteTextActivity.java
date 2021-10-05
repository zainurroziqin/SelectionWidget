package com.example.selectionwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextActivity extends AppCompatActivity {

    private static final String[] CITIES = new String[]{
            "Jember", "Pasuruan", "Probolinggo", "Malang", "Bondowoso", "Situbondo", "Surabaya", "Madiun", "Blitar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);

        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, CITIES);
        editText.setAdapter(adapter);
    }
}