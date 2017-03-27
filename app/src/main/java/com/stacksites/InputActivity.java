package com.stacksites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InputActivity extends Activity {

    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        mTextView = (TextView) findViewById(R.id.editText);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent data = new Intent(v.getContext(), MainActivity.class);
                data.putExtra("text", mTextView.getText().toString());
                startActivity(data);
            }
        });
    }
}
