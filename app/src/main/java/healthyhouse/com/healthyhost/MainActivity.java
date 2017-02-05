package healthyhouse.com.healthyhost;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up the buttons and the functionality
        Button button1 = (Button) findViewById(R.id.AntiBioInfoButton);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.IllnessesInfoButton);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.BackgroundInfoButton);
        button3.setOnClickListener(this);

        Button button4 =(Button) findViewById(R.id.LocationButton);
        button4.setOnClickListener(this);

        Button button5 =(Button) findViewById(R.id.DoAndDontButton);
        button5.setOnClickListener(this);

        Button button6 = (Button) findViewById(R.id.FAQ1);
        button6.setOnClickListener(this);

    }


    public void onClick(View v){

        switch(v.getId()){
            case R.id.AntiBioInfoButton:
                Intent AntiBio = new Intent(MainActivity.this, AntiBio.class);
                startActivity(AntiBio);
                break;
        }

        switch(v.getId()){
            case R.id.IllnessesInfoButton:
                Intent Illnesses = new Intent(MainActivity.this, Illnesses.class);
                startActivity(Illnesses);
                break;
        }

        switch(v.getId()){
            case R.id.BackgroundInfoButton:
                Intent BackgroundInfo = new Intent(MainActivity.this, BackgroundInfo.class);
                startActivity(BackgroundInfo);
                break;
        }

        switch(v.getId()){
            case R.id.LocationButton:
                Intent Location = new Intent(MainActivity.this, Location.class);
                startActivity(Location);
                break;
        }

        switch(v.getId()){
            case R.id.DoAndDontButton:
                Intent Do_Dont = new Intent(MainActivity.this, Do_Dont.class);
                startActivity(Do_Dont);
                break;
        }

        switch(v.getId()){
            case R.id.FAQ1:
                Intent FAQ = new Intent(MainActivity.this, FAQ.class);
                startActivity(FAQ);
                break;
        }

    }
}