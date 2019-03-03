package com.farhanshahoriar.bdfoodmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FoodList extends AppCompatActivity {
    private TextView keyText;
    private String key = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        keyText = (TextView) findViewById(R.id.search_key);
        Intent searchIntent = getIntent();
        if(searchIntent.hasExtra("key")){
            key = searchIntent.getStringExtra("key");
            Toast.makeText(this,key, Toast.LENGTH_LONG).show();
            keyText.setText("Search Key:\n"+key);
        }


    }
}
