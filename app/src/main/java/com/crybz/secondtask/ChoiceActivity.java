package com.crybz.secondtask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ChoiceActivity extends AppCompatActivity implements View.OnClickListener{
    MainActivity mainActivity = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_activity);

        Button btnWhite = findViewById(R.id.btn_them_white);
        Button btnBlack = findViewById(R.id.btn_theme_black);
        Button btnClose  = findViewById(R.id.btn_close);
        btnBlack.setOnClickListener(this);
        btnWhite.setOnClickListener(this);
        btnClose.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        ConstraintLayout consChoice = findViewById(R.id.choice_lay);
        switch (v.getId()){


            case R.id.btn_them_white:
                mainActivity.bacGrou = R.color.white_castom;
                consChoice.setBackgroundResource(R.color.white_castom);

                break;

            case R.id.btn_theme_black:
                mainActivity.bacGrou = R.color.blaac;
                consChoice.setBackgroundResource(R.color.blaac);

                break;

            case R.id.btn_close:
                Intent intent = new Intent(ChoiceActivity.this,MainActivity.class);
                startActivity(intent);
                break;

        }
    }
    }
