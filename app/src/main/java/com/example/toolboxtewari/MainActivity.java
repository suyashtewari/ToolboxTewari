package com.example.toolboxtewari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
        import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView subwayImage;
    Spinner spinner;
    Button changeImage;
    ImageButton next;
    RadioGroup typeOfBread;
    RadioButton selectedBread;
    Switch toasted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subwayImage = (ImageView) findViewById(R.id.subwayImage);
        spinner = (Spinner) findViewById(R.id.sandwichChoices);
        changeImage = (Button) findViewById(R.id.imageChange);
        next = (ImageButton) findViewById(R.id.next);
        typeOfBread = (RadioGroup) findViewById(R.id.breadChoices);
        toasted = (Switch) findViewById(R.id.toasted);

        //Intent intent = new Intent(this, CheckboxActivity.class);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int radioId = typeOfBread.getCheckedRadioButtonId();
                selectedBread = findViewById(radioId);
                String breadString = selectedBread.getText().toString();

                String sandwichString = spinner.getSelectedItem().toString();

                boolean toastedBool = toasted.isChecked();

                Intent intent = new Intent(MainActivity.this, CheckboxActivity.class);

                intent.putExtra(DisplayActivity.BREAD, breadString);
                intent.putExtra(DisplayActivity.TYPE, sandwichString);
                intent.putExtra("toasted", toastedBool);

                startActivity(intent);
            }
        });

        changeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //https://teamtreehouse.com/community/how-do-i-change-an-imageview-another-image

                subwayImage.setImageResource(R.drawable.eat_fresh);
            }
        });

        subwayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Subway", Toast.LENGTH_SHORT).show();
            }
        });

        String[] sandwichChoices = new String[]{
                "Ham", "Oven Roasted Chicken", "Sweet Onion Chicken Teriyaki", "Veggie Delite"
        };

        //https://www.youtube.com/watch?v=on_OrrX7Nw4

        ArrayAdapter<String> adapter = new ArrayAdapter(this, R.layout.spinner_item, sandwichChoices);

        adapter.setDropDownViewResource(R.layout.spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    //radiogroup = https://www.youtube.com/watch?v=fwSJ1OkK304&t=82s
}
