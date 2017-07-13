package com.example.habibaabbasii.bioform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
Button goBackButton;
    TextView tvText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        goBackButton = (Button) findViewById(R.id.btnBack);
        tvText = (TextView) findViewById(R.id.tvText);
        Intent i = getIntent();
        String name = i.getExtras().getString("nameKey","No.git/vonfig Name Entered");
        tvText.setText(name);

        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
