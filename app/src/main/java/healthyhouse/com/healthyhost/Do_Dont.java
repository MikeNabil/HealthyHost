package healthyhouse.com.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Do_Dont extends AppCompatActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_dont);

        //set up the buttons and the functionality
        Button button1 = (Button) findViewById(R.id.Dos);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.Dont);
        button2.setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()) {
            case R.id.Dos:
                Intent Dos = new Intent(Do_Dont.this, Dos.class);
                startActivity(Dos);
                break;
        }

        switch(v.getId()) {
            case R.id.Dont:
                Intent Dont = new Intent(Do_Dont.this, Dont.class);
                startActivity(Dont);
                break;
        }
    }
}