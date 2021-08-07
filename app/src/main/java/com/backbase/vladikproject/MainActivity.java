package com.backbase.vladikproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.backbase.vladikproject.controller.AllMoneyJob;
import com.backbase.vladikproject.controller.MaxSpeedJob;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView helloTextView = findViewById(R.id.id_text_view);
        TextView resultTextView = findViewById(R.id.id_result_text_view);

        ImageView coronaImageView = this.findViewById(R.id.corona_image_view);

        Button executeButton = findViewById(R.id.id_execute_button);

        executeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // AllMoneyJob job = new AllMoneyJob();
                // job.execute(resultTextView);
                MaxSpeedJob job = new MaxSpeedJob();
                job.execute();
            }
        });
    }
}