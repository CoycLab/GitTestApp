package com.github.coyclab.gittestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastShow();
    }

    public void toastShow() {
        final Toast toast = Toast.makeText(getApplicationContext(), "Hello EPAM!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
