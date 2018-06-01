package org.mrt3216.ecosystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConsumersListView extends AppCompatActivity {
    private ListView listView;
    private String[] strings = new String[] {"Primary: Pika ", "Secondary: Arctic Fox"," Tertiary: Arctic Wolf"};
    private Attribute Pika = new Attribute("Pika", "Desc", R.drawable.tundra);

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
                if(position == 1) {
                    Intent intent = new Intent(getApplicationContext(), AttributeDisplayer.class);
                    intent.putExtra("attribute", Pika);
                    startActivity(intent);
                }
            }
        });
    }
}
