package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


/**
 * Created by va on 1/27/2017.
 */

public class CameraActivity extends Activity {
    public void btnOpenCameraClicked(View view) {
        Intent intent1 = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent1);
    }

}