package id.co.noz.sample.usecaseview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.co.noz.sample.usecaseview.activity.ActivityDemo01;
import id.co.noz.sample.usecaseview.activity.ActivityDemo02;
import id.co.noz.sample.usecaseview.activity.ActivityDemo03;
import id.co.noz.sample.usecaseview.activity.ActivityDemo04;
import id.co.noz.usecaseview.view1.MaterialShowcaseView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btnDemo1);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.btnDemo2);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.btnDemo3);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.btnDemo4);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.btnReset);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.btnDemo1:
                intent = new Intent(this, ActivityDemo01.class);
                break;
            case R.id.btnDemo2:
                intent = new Intent(this, ActivityDemo02.class);
                break;
            case R.id.btnDemo3:
                intent = new Intent(this, ActivityDemo03.class);
                break;
            case R.id.btnDemo4:
                intent = new Intent(this, ActivityDemo04.class);
                break;
            case R.id.btnReset:
                MaterialShowcaseView.resetAll(this);
                break;
            default:
                System.out.println("Error!!");
                break;
        }

        if(intent!=null){
            startActivity(intent);
        }
    }
}
