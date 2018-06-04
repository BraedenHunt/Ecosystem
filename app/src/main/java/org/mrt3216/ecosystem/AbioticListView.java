package org.mrt3216.ecosystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AbioticListView extends AppCompatActivity {
    private ListView listView;
    private String[] strings = new String[] {"Biome", "Climate", "Human Impacts", "Other"};
    private Attribute Biome = new Attribute("Biome", "the biome is...", R.drawable.tundra);
    private Attribute Climate = new Attribute("Climate", "the cliamte is...", R.drawable.tundra);
    private Attribute HumanImpacts = new Attribute("Human Impacts", "Humans impact the arctic tundra by...", R.drawable.tundra);
    private Attribute Other = new Attribute("Other", "", R.drawable.tundra);

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
                if(item.equals("Biome")) {
                    Intent intent = new Intent(getApplicationContext(), AttributeDisplayer.class);
                    intent.putExtra("attribute", Biome);
                    startActivity(intent);
                }
                if(item.equals("Climate")){
                    Intent intent = new Intent(getApplicationContext(), AttributeDisplayer.class);
                    intent.putExtra("attribute", Climate);
                    startActivity(intent);
                }
                if(item.equals("Human Impacts")) {
                    Intent intent = new Intent(getApplicationContext(), AttributeDisplayer.class);
                    intent.putExtra("attribute", HumanImpacts);
                    startActivity(intent);
                }
                if(item.equals("Other")) {
                    Intent intent = new Intent(getApplicationContext(), AttributeDisplayer.class);
                    intent.putExtra("attribute", Other);
                    startActivity(intent);
                }
            }
        });
    }
}
