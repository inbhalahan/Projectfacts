package com.example.talagarsamysuresh.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private TextView mFactTextView;
    private Button mShowFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mFactTextView=(TextView)findViewById(R.id.FactTextView);
        mShowFactButton=(Button)findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] facts = {"Ants stretch when they wake up in the morning", "Ostriches can run faster than horses",
                        "Olympics are good to watch", "India is a Secular Country", "I born in India", "Born to win"};
                String fact = "";
               Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);
                fact = facts[randomNumber];
               //fact=randomNumber + "";
                mFactTextView.setText(fact);
            }
        };
        mShowFactButton.setOnClickListener(listener);



    }
}
