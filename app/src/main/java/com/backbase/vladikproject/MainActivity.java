package com.backbase.vladikproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.backbase.vladikproject.controller.AllMoneyJob;
import com.backbase.vladikproject.controller.AnimalJob;
import com.backbase.vladikproject.controller.ClientAnimalJob;
import com.backbase.vladikproject.controller.MaxSpeedJob;
import com.backbase.vladikproject.controller.OrderJob;
import com.backbase.vladikproject.controller.PerimeterJob;
import com.backbase.vladikproject.controller.SelectCatJob;
import com.backbase.vladikproject.model.Animal;
import com.backbase.vladikproject.model.Client;
import com.backbase.vladikproject.model.Rectangle;

import java.util.ArrayList;
import java.util.List;

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
                //MaxSpeedJob job = new MaxSpeedJob();
                //job.execute();
                //OrderJob orderJob = new OrderJob();
                //orderJob.execute();

                //AnimalJob job = new AnimalJob();
                //job.execute();
               //
                // PerimeterJob job = new PerimeterJob();

                ClientAnimalJob clientAnimalJob = new ClientAnimalJob();
                clientAnimalJob.execute();

                /*
                Rectangle rectangle1 = new Rectangle(3,5);
                Rectangle rectangle2 = new Rectangle(6,5);
                Rectangle rectangle3 = new Rectangle(10,5);

                List<Rectangle> rectangles = new ArrayList<>();

                rectangles.add(rectangle1);
                rectangles.add(rectangle2);
                rectangles.add(rectangle3);

               // job.execute(rectangles);

                SelectCatJob job1 = new SelectCatJob();
                job1.execute();


                 */
            }
        });
    }
}