package com.example.matteo.quiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {

    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        Button btnTermina = (Button) findViewById(R.id.buttonTermina);
        result= (TextView) findViewById(R.id.result);
        result.setEnabled(false);

        final Context context = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;

        btnTermina.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Toast toast = Toast.makeText(context, "BTNTERMINA", duration);
                toast.show();
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio1:
                if (checked)
                    result.setText("Raio1");
                    result.setEnabled(true);
                    break;
            case R.id.radio2:
                if (checked)
                    result.setText("Raio2");
                result.setEnabled(true);
                    break;
            case R.id.radio3:
                if (checked)
                    result.setText("Raio3");
                result.setEnabled(true);
                    break;
            case R.id.radio4:
                if (checked)
                    result.setText("Raio4");
                result.setEnabled(true);
                    break;
        }
    }
}
