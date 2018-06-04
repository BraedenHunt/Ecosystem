package org.mrt3216.ecosystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView biotic, abiotic;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        biotic = findViewById(R.id.button1);
        abiotic = findViewById(R.id.button2);
        image = findViewById(R.id.imageView);

        image.setImageResource(R.drawable.tundra);

        biotic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BioticListView.class);
                startActivity(intent);
            }
        });
        abiotic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AbioticListView.class);
                startActivity(intent);
            }
        });


    }
}
