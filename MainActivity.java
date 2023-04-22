package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generate(View view)
    {
        Random rand = new Random();
        EditText et1;
        et1 = findViewById(R.id.id1);
        int rand_int1 = rand.nextInt(1000);
        rand_int1 = (rand_int1)%2;
        if(rand_int1 == 0)
        {
            et1.setText("" + "Heads");
        }
        else
        {
            et1.setText("" + "Tails");
        }
    }
}
