package com.github.coyclab.gittestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView1);
        mTextView.setText(R.string.good_day);
        // Show toast message
        toastShow();
    }

    public void toastShow() {
        final Toast toast = Toast.makeText(getApplicationContext(), "Hello EPAM!", Toast.LENGTH_SHORT);
        toast.show();
    }

    // futureRelease implementation

    // futureRelease another implementation
}
