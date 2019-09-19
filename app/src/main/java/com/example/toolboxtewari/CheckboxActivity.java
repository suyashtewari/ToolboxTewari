package com.example.toolboxtewari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class CheckboxActivity extends AppCompatActivity {
    ImageButton next2;
    CheckBox lettuce, cucumber, tomato, onion, ranch, chipotle, honey, mayo;
    public static final String BREAD = "bread";
    public static final String TYPE = "type";
    public static final boolean TOASTED = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        lettuce = (CheckBox) findViewById(R.id.lettuce);
        cucumber = (CheckBox) findViewById(R.id.cucumber);
        tomato = (CheckBox) findViewById(R.id.tomato);
        onion = (CheckBox) findViewById(R.id.onion);
        ranch = (CheckBox) findViewById(R.id.ranch);
        chipotle = (CheckBox) findViewById(R.id.chipotle);
        honey = (CheckBox) findViewById(R.id.honey);
        mayo = (CheckBox) findViewById(R.id.mayo);

        next2 = (ImageButton) findViewById(R.id.next_two);

        Intent intent = getIntent();
        final String bread = intent.getStringExtra(BREAD);
        final String type = intent.getStringExtra(TYPE);
        final boolean toasted = intent.getBooleanExtra("toasted", false);

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean lettuceChecked = lettuce.isChecked();
                boolean cucumberChecked = cucumber.isChecked();
                boolean tomatoChecked = tomato.isChecked();
                boolean onionChecked = onion.isChecked();
                boolean ranchChecked = ranch.isChecked();
                boolean chipotleChecked = chipotle.isChecked();
                boolean honeyChecked = honey.isChecked();
                boolean mayoChecked = mayo.isChecked();

                Intent intent = new Intent(CheckboxActivity.this, DisplayActivity.class);

                intent.putExtra("lettuce",lettuceChecked);
                intent.putExtra("cucumber",cucumberChecked);
                intent.putExtra("tomato",tomatoChecked);
                intent.putExtra("onion",onionChecked);
                intent.putExtra("ranch",ranchChecked);
                intent.putExtra("chipotle",chipotleChecked);
                intent.putExtra("honey",honeyChecked);
                intent.putExtra("mayo",mayoChecked);

                intent.putExtra(DisplayActivity.BREAD, bread);
                intent.putExtra(DisplayActivity.TYPE, type);
                intent.putExtra("toasted", toasted);

                startActivity(intent);
                //123
            }
        });


    }
}
