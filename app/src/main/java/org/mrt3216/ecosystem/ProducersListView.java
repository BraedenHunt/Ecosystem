package org.mrt3216.ecosystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProducersListView extends AppCompatActivity {
    private ListView listView;
    private String[] strings = new String[] {"Thistles", "Fireweed", "Grasses"};
    private Attribute Thistles = new Attribute("Thistles", "Description goes here", R.drawable.tundra);
    private Attribute Fireweed = new Attribute("Fireweed", "Desc", R.drawable.tundra);
    private Attribute Grasses  = new Attribute("Grasses", "desc", R.drawable.tundra);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
                if(item.equals("Thistles")) {
                    Intent intent = new Intent(getApplicationContext(), AttributeDisplayer.class);
                    intent.putExtra("attribute", Thistles);
                    startActivity(intent);
                }
                if(item.equals("Fireweed")) {
                    Intent intent = new Intent(getApplicationContext(), AttributeDisplayer.class);
                    intent.putExtra("attribute", Fireweed);
                    startActivity(intent);
                }
                if(item.equals("Grasses")) {
                    Intent intent = new Intent(getApplicationContext(), AttributeDisplayer.class);
                    intent.putExtra("attribute", Grasses);
                    startActivity(intent);
                }
            }
        });
    }
}
