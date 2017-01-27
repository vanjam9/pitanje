package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import rs.aleph.android.example12.R;

/**
 * Created by va on 1/27/2017.
 */

public class ThirdActivity extends Activity {

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toast toast = Toast.makeText(getBaseContext(), "Activity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
