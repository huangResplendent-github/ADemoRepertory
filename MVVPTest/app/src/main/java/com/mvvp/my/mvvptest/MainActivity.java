package com.mvvp.my.mvvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * view
 */

public class MainActivity extends AppCompatActivity {
    private EditText et_inputAge,et_inputName;
    private TextView tv_nameVal,tv_ageVal;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_inputAge=(EditText)findViewById(R.id.et_inputAge);
        et_inputName=(EditText)findViewById(R.id.et_inputName);
        tv_nameVal=(TextView)findViewById(R.id.tv_nameVal);
        tv_ageVal=(TextView)findViewById(R.id.tv_ageVal);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
