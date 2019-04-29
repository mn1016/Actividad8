package com.trabajo.activity_8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText et1;
    EditText et2;
    Button btn;
    TextView tw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button);
        tw = (TextView) findViewById(R.id.textViewResult);
        btn.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Double val_1 = Double.parseDouble(et1.getText().toString());
                Double val_2 = Double.parseDouble(et2.getText().toString());
                Double resta = val_1 - val_2;
                if (resta < 0 ){
                    resta = resta * -1;
                }
                Double res = resta / val_1;
                Double total = res * 100;
                tw.setText("Resultado: " + total + " %");
                break;
        }
    }
}
