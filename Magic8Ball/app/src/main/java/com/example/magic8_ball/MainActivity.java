package com.example.magic8_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText questionInput;
    Button submitButton;
    TextView answer;
    ImageView ballImg;
    String a, b, c, d, e;
    int num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionInput = (EditText) findViewById(R.id.questionInput);
        answer = (TextView) findViewById(R.id.answer);
        ballImg = (ImageView) findViewById(R.id.ballImg);
        final Button button = findViewById(R.id.submitbutton);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                num = r.nextInt(5);
                if (num == 0) {
                    a = "Very Doubtful.";
                    ballImg.setImageResource(R.drawable.doubtful);
                    answer.setText("Very Doubtful");
                    questionInput.setText("");
                }
                else if (num == 1){
                    b = "My sources say no.";
                    ballImg.setImageResource(R.drawable.no);
                    answer.setText("My sources say no.");
                    questionInput.setText("");
                }
                else if (num == 2){
                    c = "Most likely.";
                    ballImg.setImageResource(R.drawable.mostlikely);
                    answer.setText("Most likely.");
                    questionInput.setText("");
                }
                else if (num == 3){
                    d = "As I see it, Yes.";
                    ballImg.setImageResource(R.drawable.yes);
                    answer.setText("As I see it, Yes.");
                    questionInput.setText("");
                }
                else if (num == 4){
                    e = "It is decidedly so.";
                    ballImg.setImageResource(R.drawable.decided);
                    answer.setText("It is decidedly so.");
                    questionInput.setText("");
                }

            }
        });




    }
}