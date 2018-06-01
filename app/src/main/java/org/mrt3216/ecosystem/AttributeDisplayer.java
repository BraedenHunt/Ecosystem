package org.mrt3216.ecosystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AttributeDisplayer extends AppCompatActivity {
    private ImageView imageView;
    private TextView desc;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attribute_displayer);
        imageView = findViewById(R.id.attributeImage);
        desc = findViewById(R.id.desc);
        intent = getIntent();
        Attribute attribute = (Attribute) intent.getSerializableExtra("attribute");
        setTitle(attribute.getTitle());
        imageView.setImageResource(attribute.getImage());
        desc.setText(attribute.getDesc());
    }
}
