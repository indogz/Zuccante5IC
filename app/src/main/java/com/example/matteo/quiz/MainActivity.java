package com.example.matteo.quiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnQuizFacile = (Button) findViewById(R.id.buttonQuiz1);
        Button btnQuizDifficile = (Button) findViewById(R.id.buttonQuiz2);

        final Context context = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;

        btnQuizFacile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(i);
                Toast toast = Toast.makeText(context, "BTNFACILE", duration);
                toast.show();
            }
        });

        btnQuizDifficile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ActivityThree.class);
                startActivity(i);
                Toast toast = Toast.makeText(context, "BTNDIFFICILE", duration);
                toast.show();
            }
        });

    }
}
