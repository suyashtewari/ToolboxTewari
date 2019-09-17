package com.example.toolboxtewari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CheckboxActivity extends AppCompatActivity {
    ImageButton next2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        next2 = (ImageButton) findViewById(R.id.next_two);

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CheckboxActivity.this, DisplayActivity.class);
                startActivity(intent);
            }
        });


    }
}
