package com.example.zoerebeccakaplan.stressbegone;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FirstAnswer extends AppCompatActivity implements View.OnClickListener {
    private ImageView answer, yesButton, noButton;
    private ArrayList<ImageView> answerOpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_answer);

        wireWidgets();
        setOnClickListeners();
        answerOptions();
    }

    private void answerOptions() {
        answerOpt = new ArrayList<ImageView>();

    }

    private void setOnClickListeners() {
        yesButton.setOnClickListener(this);
        noButton.setOnClickListener(this);
    }

    private void wireWidgets() {
        yesButton = (ImageView) findViewById(R.id.imageView_yes);
        noButton = (ImageView) findViewById(R.id.imageView_no);
        answer = (ImageView) findViewById(R.id.imageView_answer);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView_no:
                Intent i = new Intent(FirstAnswer.this, FeelBetter.class);
                startActivity(i);
            case R.id.imageView_yes:
                Intent x = new Intent(FirstAnswer.this, SecondQuestion.class);
                startActivity(x);
        }

    }
}
