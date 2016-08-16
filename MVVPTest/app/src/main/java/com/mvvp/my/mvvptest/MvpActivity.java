package com.mvvp.my.mvvptest;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.mvvp.my.mvvptest.com.mvp.test.biz.StudentBiz;
import com.mvvp.my.mvvptest.com.mvp.test.presenter.StudentPresenter;
import com.mvvp.my.mvvptest.com.mvp.test.view.IStudentView;


/**
 * view
 */

public class MvpActivity extends AppCompatActivity implements IStudentView{
    private EditText et_inputAge,et_inputName;
    private TextView tv_nameVal,tv_ageVal;
    private Button btn,btn2;
    private EditText test1;
    private ProgressDialog loading;
    private StudentPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter=new StudentPresenter(this);
        et_inputAge=(EditText)findViewById(R.id.et_inputAge);
        et_inputName=(EditText)findViewById(R.id.et_inputName);
        tv_nameVal=(TextView)findViewById(R.id.tv_nameVal);
        tv_ageVal=(TextView)findViewById(R.id.tv_ageVal);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.reset();
            }
        });

        btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.select();
            }
        });
        presenter.select();
    }


    @Override
    public String getStuentName() {
        return et_inputName.getText().toString();
    }

    @Override
    public String getStuentAge() {
        return et_inputAge.getText().toString();
    }

    @Override
    public void clearInput() {
        et_inputName.setText("");
        et_inputAge.setText("");
    }

    @Override
    public void setStuentName(String stuentName) {
        tv_nameVal.setText(stuentName);

    }

    @Override
    public void setStuentAge(String age) {
        tv_ageVal.setText(age);

    }

    @Override
    public void showLoading(boolean isShow) {
        if(isShow)
        loading=ProgressDialog.show(this,null,"加载中...");
        else{
            if(loading!=null)
                loading.dismiss();

        }

    }

    @Override
    public void showToast(String text) {
        if(!TextUtils.isEmpty(text))
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
}
