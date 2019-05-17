package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        tvAnswer2 = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        char charValue = intentReceived.getCharExtra("Char",'a');

        if(tvAnswer2 == null){
            Log.e("anything","an");
        }
        tvAnswer2.setText("Character value revceived is: " + charValue);

    }
}
