package com.example.habibaabbasii.bioform;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    Button b;
    EditText etName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewByIds();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_LONG).show();
            }
        });

        b.setOnClickListener(this);
    }

    private void findViewByIds(){
        b=(Button) findViewById(R.id.btnSubmit);
        etName = (EditText) findViewById(R.id.etName);
    }
    public void doSomething(View v){

        if(v.getId() == b.getId()) {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show();
            Intent i = new Intent(MainActivity.this,secondActivity.class);
            String name = etName.getText().toString();
            i.putExtra("nameKey",name);
            startActivity(i);
        }

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == b.getId()) {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show();
        }
    }
}
