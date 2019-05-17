package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivitiy extends AppCompatActivity {

    TextView tvAnswer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_activitiy);

        setContentView(R.layout.activity_third);


        tvAnswer3 = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        double doubleValue = intentReceived.getDoubleExtra("Double",99.99);
        tvAnswer3.setText("Double value revceived is: " + doubleValue);
    }
}
