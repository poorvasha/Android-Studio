package com.example.fontandcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //intialize for switch
    int ch = 1;
    // component intialization
    TextView text1;
    Button btn;
    //font intialization
    float font = 30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variable intialization
        text1 =  findViewById(R.id.textView);
        btn = findViewById(R.id.button);

        //onclick listener for button - on clicking the button the action takes
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //to change the font size
                text1.setTextSize(font);
                font = font + 5;
                if( font == 50){
                    font = 30;
                }

                //to change the color
                 switch (ch){
                     case 1:
                         text1.setTextColor(Color.RED);
                         break;
                     case 2:
                         text1.setTextColor(Color.GREEN);
                         break;
                     case 3:
                         text1.setTextColor(Color.YELLOW);
                         break;
                     case 4:
                         text1.setTextColor(Color.BLACK);
                         break;
                     case 5:
                         text1.setTextColor(Color.BLUE);
                         break;
                 }
                 ch++;
                if(ch == 7){
                    ch = 1;
                }


            }
        });

    }
}
