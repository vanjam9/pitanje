package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import java.io.InputStream;
import java.io.InputStream;
import java.io.IOException;
import rs.aleph.android.example12.R;

// Each activity extends Activity class
public class SecondActivity extends Activity {

    // onCreate method is a lifecycle method called when he activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.activity_second);

        // Shows a toast message (a pop-up message)
     //   Toast toast = Toast.makeText(getBaseContext(), "Activity.onCreate()", Toast.LENGTH_SHORT);
       // toast.show();
    //}

    // onStart method is a lifecycle method called after onCreate (or after onRestart when the
    // activity had been stopped, but is now again being displayed to the user)
    //@Override
    //protected void onStart() {
      //  super.onStart();

        //Toast toast = Toast.makeText(getBaseContext(), "Activity.onStart()", Toast.LENGTH_SHORT);
        //toast.show();
    //}
    Jelo j = new Jelo("jastog.jpg","Jastog","Res pecen", "Glavno jelo", "Rak iz mora",8, 150.00);


    ImageView ivImage = (ImageView)findViewById(R.id.iv_image);
    ivImage.setImageResource(R.drawable.jastog);

        TextView tvIme = (TextView) findViewById(R.id.tv_ime);
    tvIme.setText(j.getIme());

    TextView tvOpis = (TextView) findViewById(R.id.tv_opis);
    tvOpis.setText(j.getOpis());

    TextView tvSastojci = (TextView) findViewById(R.id.tv_sastojci);
    tvSastojci.setText(j.getSastojci());

    TextView tvKategorija = (TextView) findViewById(R.id.tv_kategorija);
    tvKategorija.setText(j.getKategorija());

    TextView tvKalorije = (TextView) findViewById(R.id.tv_kalorije);
    tvKalorije.setText(Integer.toString(j.getKalorije()));

    TextView tvCena = (TextView) findViewById(R.id.tv_cena);
                tvCena.setText(Double.toString(j.getCena()));

                }
    // onRestart method is a lifecycle method called after onStop when the current activity is
    // being re-displayed to the user
   // @Override
    //protected void onRestart() {
      //  super.onRestart();

        //Toast toast = Toast.makeText(getBaseContext(), "Activity.onRestart()", Toast.LENGTH_SHORT);
        //toast.show();
    //}

    // onResume method is a lifecycle method called after onRestoreInstanceState, onRestart, or
    // onPause, for your activity to start interacting with the user
    /*@Override
    protected void onResume() {
        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "Activity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onPause method is a lifecycle method called when an activity is going into the background,
    // but has not (yet) been killed
 /*   @Override
    protected void onPause() {
        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "Activity.onPause()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onStop method is a lifecycle method called when the activity are no longer visible to the user
    @Override
    protected void onStop() {
        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "Activity.onStop()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onDestroy method is a lifecycle method that perform any final cleanup before an activity is destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "Activity.onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
    }*/
   /* public void btnStartActivityClicked(View view) {
        // This is an explicit intent (class property is specified)
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        // startActivity method starts an activity
        startActivity(intent);
    }*/
  /*  public void btnOpenCameraClicked(View view) {
        Intent intent1 = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent1);
    }*/
    }



