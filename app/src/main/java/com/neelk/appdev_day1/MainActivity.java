package com.neelk.appdev_day1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText numberSides;
    private Button roll;
    private TextView resultTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberSides = findViewById(R.id.numberOfSidesEditText);
        roll = findViewById(R.id.rollButton);
        resultTextView = findViewById(R.id.resultTextView);

        View.OnClickListener rollOnClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sides = 0;

                String input = numberSides.getText().toString().trim();
                try {
                    sides = Integer.parseInt(input);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                    return;
                }

                int number = (int) (Math.random()*sides) + 1;
                resultTextView.setText(Integer.toString(number));
            }
        };

        roll.setOnClickListener(rollOnClick);












//        TextView tv = new TextView(MainActivity.this);
//        tv.setText("Hello World!");

       // Button btn = findViewById(R.id.button);
//        View.OnClickListener btnOnClick = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this, SecondActivity.class));
//            }
//        };


        //Toast.makeText(MainActivity.this, "This is a toast!", Toast.LENGTH_SHORT).show();

//        EditText editText = findViewById(R.id.textField);
//        String input = editText.getText().toString();
//        if(input.equals(code)){
//
//        }














    }
}
