package com.farhanshahoriar.bdfoodmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText searchText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchText = (EditText) findViewById(R.id.search_text);
    }

    public void onSearchFood(View view){
        String txt = searchText.getText().toString();

        Intent doSearchIntent = new Intent(this,FoodList.class);
        doSearchIntent.putExtra("key",txt);
        startActivity(doSearchIntent);
    }


}
