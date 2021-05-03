package com.test.mysequencelayouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.transferwise.sequencelayout.SequenceStep;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SequenceStep step1,step2,step3,step4,step5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        step1=(SequenceStep)findViewById(R.id.step1);
        step2=(SequenceStep)findViewById(R.id.step2);
        step3=(SequenceStep)findViewById(R.id.step3);
        step4=(SequenceStep)findViewById(R.id.step4);
        step5=(SequenceStep)findViewById(R.id.step5);

        //programatically activating
        //step3，這意味著進度條將顯示到序列步驟3
        step3.setActive(true);
        step3.setTitle("Active Step");
        step3.setAnchor("Date...");
        step3.setSubtitle("Subtitle of this step third.");

        //programatically seting style to Title
        step3.setTitleTextAppearance(R.style.TextAppearance_AppCompat_Title);

        step1.setOnClickListener(this);
        step2.setOnClickListener(this);
        step3.setOnClickListener(this);
        step4.setOnClickListener(this);
        step5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.step1:
                Toast.makeText(MainActivity.this,"This is 1 step",Toast.LENGTH_LONG).show();
                break;
            case R.id.step2:
                Toast.makeText(MainActivity.this,"This is 2 step",Toast.LENGTH_LONG).show();
                break;
            case R.id.step3:
                Toast.makeText(MainActivity.this,"This is 3 step",Toast.LENGTH_LONG).show();
                break;
            case R.id.step4:
                Toast.makeText(MainActivity.this,"This is 4 step",Toast.LENGTH_LONG).show();
                break;
            case R.id.step5:
                Toast.makeText(MainActivity.this,"This is 5 step",Toast.LENGTH_LONG).show();
                break;
        }
    }
}