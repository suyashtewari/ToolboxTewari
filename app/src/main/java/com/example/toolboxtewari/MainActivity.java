package com.example.toolboxtewari;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView subwayImage;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subwayImage = (ImageView) findViewById(R.id.subwayImage);
        spinner = (Spinner) findViewById(R.id.sandwichChoices);

        subwayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Subway", Toast.LENGTH_LONG).show();
            }
        });

        String[] sandwichChoices = new String[]{
                "Ham", "Oven Roasted Chicken", "Sweet Onion Chicken Teriyaki", "Veggie Delite"
        };


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
}
