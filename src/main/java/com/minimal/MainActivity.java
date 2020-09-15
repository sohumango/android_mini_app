package com.minimal;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends Activity {
    private final int REQUEST_CODE = 1000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // -------------check permissions---------------------------
        if (Build.VERSION.SDK_INT >= 23) {
            String[] permissions = { Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.INTERNET };
            ArrayList<String> lst = new ArrayList<>();
            for (String p : permissions) {
                if (ContextCompat.checkSelfPermission(this, p) != PackageManager.PERMISSION_GRANTED) {
                    lst.add(p);
                }
            }
            if (lst.size() > 0) {
                Log.d("permission", "request: " + lst.toString());
                ActivityCompat.requestPermissions(this, lst.toArray(new String[lst.size()]), REQUEST_CODE);
            } else {
                Log.d("permission", "all ok");
            }
        }
        // -------------UI programmatically---------------------------
        final LinearLayout frame = new LinearLayout(this);
        frame.setOrientation(LinearLayout.VERTICAL);
        setContentView(frame);
        final TextView label = new TextView(this);
        label.setText("Hello world!\n1\n2");
        final Button btn1 = new Button(this);
        btn1.setText("click me!");
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        frame.addView(label, params);
        frame.addView(btn1, params);
        // -------------Button event---------------------------
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                moduleA a = new moduleA();
                btn1.setText("ver:" + a.getVersion()+ " " + df.format(new Date()));
            }
        });

    }
}
