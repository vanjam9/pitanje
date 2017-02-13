package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.ActionBarDrawerToggle;

import rs.aleph.android.example12.R;

// Each activity extends Activity class
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }






    // onCreate method is a lifecycle method called when he activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.


        Toast toast = Toast.makeText(getBaseContext(), "MainActivity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();
        // Loads fruits from array resource
        final List<String> jelaNames = JeloProvajder.getJelaNames();

        // Creates an ArrayAdaptar from the array of String
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.list_item, jelaNames);
        ListView listView = (ListView) findViewById(R.id.listaJela);

        // Assigns ArrayAdaptar to ListView
        listView.setAdapter(dataAdapter);

        // Starts the SecondActivity and sends it the selected URL as an extra data
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }


        });
    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu, menu);
            return super.onCreateOptionsMenu(menu);
        }

        // onOptionsItemSelected method is called whenever an item in the Toolbar is selected.
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_create:
                    Toast.makeText(this, "Action " + getString(R.string.fragment_master_action_create) + " executed.", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.action_update:
                    Toast.makeText(this, "Action " + getString(R.string.fragment_detal_action_update) + " executed.", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.action_delete:
                    Toast.makeText(this, "Action " + getString(R.string.fragment_detal_action_delete) + " executed.", Toast.LENGTH_SHORT).show();
                    break;
            }

            return super.onOptionsItemSelected(item);
        }

    }