package com.example.n01107705_hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        setTitle(R.string.receiver);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_message);
        Button ret_button = findViewById(R.id.bt_return);

        ret_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }

        });
        getResult();

    }
    public void getResult()
    {
        // TODO: Step 9. Get the data and display here. Finished
        Bundle extras = getIntent().getExtras();
        if (extras == null) { return; } // get data via the key
        String stdID = extras.getString("stdID");
        String msg = extras.getString("message");
        if (msg != null && stdID !=null) { // do something with the data
            TextView message =  findViewById(R.id.tv_message);
            message.setText(stdID + "\n" + msg);

        }
    }
}
