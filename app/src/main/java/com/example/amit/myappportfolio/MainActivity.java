package com.example.amit.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button project1;
    Button project2;
    Button project3;
    Button project4;
    Button project5;
    Button project6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        project1 = (Button)findViewById(R.id.project1);
        project2 = (Button)findViewById(R.id.project2);
        project3 = (Button)findViewById(R.id.project3);
        project4 = (Button)findViewById(R.id.project4);
        project5 = (Button)findViewById(R.id.project5);
        project6 = (Button)findViewById(R.id.project6);

        project1.setOnClickListener(this);
        project2.setOnClickListener(this);
        project3.setOnClickListener(this);
        project4.setOnClickListener(this);
        project5.setOnClickListener(this);
        project6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.project1:
                Toast.makeText(this,"This button will launch " + project1.getText() + "!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.project2:
                Toast.makeText(this,"This button will launch " + project2.getText() + "!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.project3:
                Toast.makeText(this,"This button will launch " + project3.getText() + "!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.project4:
                Toast.makeText(this,"This button will launch " + project4.getText() + "!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.project5:
                Toast.makeText(this,"This button will launch " + project5.getText() + "!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.project6:
                Toast.makeText(this,"This button will launch " + project6.getText() + "!",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this,"Button action is not defined!",Toast.LENGTH_SHORT).show();
        }
    }
}
