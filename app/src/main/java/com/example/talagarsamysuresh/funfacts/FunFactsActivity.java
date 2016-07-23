package com.example.talagarsamysuresh.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private TextView mFactTextView;
    private Button mShowFactButton;
    private FactBook mFactBook= new FactBook();
    private RelativeLayout mRelativeLayout;
    private ColorWheel mColor = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mFactTextView=(TextView)findViewById(R.id.FactTextView);
        mShowFactButton=(Button)findViewById(R.id.showFactButton);
        mRelativeLayout=(RelativeLayout) findViewById(R.id.relativelayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String fact = mFactBook.getFact();
                int color = mColor.getColor();
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);


            }
        };
        mShowFactButton.setOnClickListener(listener);



    }
}
