package a.svecw.original;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class Admin1 extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6;
    Button b1,b2,b3,b4,b5;
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Connecting corresponnding xml file
        setContentView(R.layout.admin1);
        //connecting the components of connected xml file
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        t4 = findViewById(R.id.t4);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        t6 = findViewById(R.id.t6);


        i1 = findViewById(R.id.i1);
        //on submit to go  to screen for food permissions
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent = new Intent(getApplicationContext(), Foodrequests.class);
                startActivity(newintent);
            }
        });
        //on submit to go  to screen for birthday permissions
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent = new Intent(getApplicationContext(), Birthdayrequests.class);
                startActivity(newintent);
            }
        });
        //on submit to go  to screen for hospitalpermissions
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent = new Intent(getApplicationContext(), Hospitalrequests.class);
                startActivity(newintent);
            }
        });
        //on submit to go  to screen for complaint permissions
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent = new Intent(getApplicationContext(),userlist.class);
                startActivity(newintent);
            }
        });
        //on submit to go  to screen for Ratingpermissions
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent = new Intent(getApplicationContext(),Ratingrequests.class);
                startActivity(newintent);
            }
        });

    }
}
