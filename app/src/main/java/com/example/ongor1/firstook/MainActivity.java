package com.example.ongor1.firstook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private Button mButton;
 private TextView mTextview;
 private EditText meditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.mbutton);
        mTextview = (TextView)findViewById(R.id.mtextView);
        meditText = (EditText)findViewById(R.id.mEditText);

        mButton.setText(R.string.buttonName);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enterText;

                enterText = meditText.getText().toString();

                mTextview.setVisibility(View.VISIBLE);
                mTextview.setText(enterText);
            }
        });
    }
}
