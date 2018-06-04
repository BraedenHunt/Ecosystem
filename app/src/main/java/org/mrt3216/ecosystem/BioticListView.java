package org.mrt3216.ecosystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BioticListView extends AppCompatActivity {
    private ListView listView;
    private String[] strings = new String[] {"Food Web", "Producers", "Consumers", "Decomposers", "Resources"};
    private Attribute Lichen = new Attribute("Lichen", "desc", R.drawable.tundra);
    private Attribute Resources = new Attribute("Resources", "Water and food...", R.drawable.tundra);
    private Attribute FoodWeb = new Attribute("Food Web", "", R.drawable.tundra);

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
                if(item.equals("Producers")) {
                    Intent intent = new Intent(getApplicationContext(), ProducersListView.class);
                    startActivity(intent);
                }
                if(item.equals("Consumers")){
                    Intent intent = new Intent(getApplicationContext(), ConsumersListView.class);
                    startActivity(intent);
                }
                if(item.equals("Decomposers")) {
                    Intent intent = new Intent(getApplicationContext(), AttributeDisplayer.class);
                    intent.putExtra("attribute", Lichen);
                    startActivity(intent);
                }
                if(item.equals("Resources")) {
                    Intent intent = new Intent(getApplicationContext(), AttributeDisplayer.class);
                    intent.putExtra("attribute", Resources);
                    startActivity(intent);
                }
                if(item.equals("Food Web")) {
                    Intent intent = new Intent(getApplicationContext(), AttributeDisplayer.class);
                    intent.putExtra("attribute", FoodWeb);
                    startActivity(intent);
                }
            }
        });
    }
}
