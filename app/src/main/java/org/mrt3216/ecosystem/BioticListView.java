package org.mrt3216.ecosystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BioticListView extends AppCompatActivity {
    private ListView listView;
    private String[] strings = new String[] {"Producers", "Consumers", "Decomposers"};
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biotic_list_view);
        listView = findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
                if(item.equals("Producers")) {
                    Intent intent = new Intent(this, ProducerList.class);
                    startActivity(intent);

                }
            }
        });
    }
}
