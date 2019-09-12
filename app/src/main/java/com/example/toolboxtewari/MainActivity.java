package com.example.toolboxtewari;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView subwayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subwayImage = (ImageView) findViewById(R.id.subwayImage);

        subwayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Subway", Toast.LENGTH_LONG).show();
            }
        });


    }
}
