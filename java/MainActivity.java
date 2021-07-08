package a.svecw.original;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Connecting xml file
        setContentView(R.layout.activity_main);
        //connecting components of corresponding xml file connected
        t1=findViewById(R.id.t1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b1=findViewById(R.id.b1);
        //Checking login credentials on submit of regno and password
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Checking if  username or password is empty
                if(e1.getText().toString().equals("")||e2.getText().toString().equals("")) {

                    Toast.makeText(MainActivity.this,"regno and password cannot be empty",Toast.LENGTH_SHORT).show();

                }
                //checking if given credentials belong to admin
                else if(e1.getText().toString().equals("admin")&&e2.getText().toString().equals("admin123")){
                    //login for admin option screen
                    Intent newintent = new Intent(getApplicationContext(), Admin1.class);
                    startActivity(newintent);
                }
                //checking if given credentials belong to student
                else if(e1.getText().toString().equals("17b01a0501")||e1.getText().toString().equals("17b01a0502")||e1.getText().toString().equals("17b01a0503")||e1.getText().toString().equals("17b01a0504")||e1.getText().toString().equals("17b01a0505")||e1.getText().toString().equals("17b01a0506")||e1.getText().toString().equals("17b01a0507")||e1.getText().toString().equals("17b01a0508")||e1.getText().toString().equals("17b01a0509")||e1.getText().toString().equals("17b01a0510")||e1.getText().toString().equals("17b01a0511")||e1.getText().toString().equals("17b01a0512")||e1.getText().toString().equals("17b01a0513")||e1.getText().toString().equals("17b01a0514")||e1.getText().toString().equals("17b01a0516")||e1.getText().toString().equals("17b01a0518")||e1.getText().toString().equals("17b01a0519")||e1.getText().toString().equals("17b01a0520")||e1.getText().toString().equals("17b01a0521")||e1.getText().toString().equals("17b01a0522")||e1.getText().toString().equals("17b01a0523")||e1.getText().toString().equals("17b01a0524")||e1.getText().toString().equals("17b01a0525")||e1.getText().toString().equals("17b01a0526")||e1.getText().toString().equals("17b01a0527")||e1.getText().toString().equals("17b01a0528")||e1.getText().toString().equals("17b01a0529")||e1.getText().toString().equals("17b01a0530")||e1.getText().toString().equals("17b01a0531")||e1.getText().toString().equals("17b01a0532")||e1.getText().toString().equals("17b01a0533")||e1.getText().toString().equals("17b01a0534")||e1.getText().toString().equals("17b01a0535")||e1.getText().toString().equals("17b01a0536")||e1.getText().toString().equals("17b01a0537")||e1.getText().toString().equals("17b01a0538")||e1.getText().toString().equals("17b01a0539")||e1.getText().toString().equals("17b01a0540")||e1.getText().toString().equals("17b01a0541")||e1.getText().toString().equals("17b01a0542")||e1.getText().toString().equals("17b01a0543")||e1.getText().toString().equals("17b01a0544")||e1.getText().toString().equals("17b01a0545")||e1.getText().toString().equals("17b01a0546")||e1.getText().toString().equals("17b01a0547")||e1.getText().toString().equals("17b01a0548")||e1.getText().toString().equals("17b01a0549")||e1.getText().toString().equals("17b01a0551")||e1.getText().toString().equals("17b01a0552")||e1.getText().toString().equals("17b01a0553")||e1.getText().toString().equals("17b01a0554")||e1.getText().toString().equals("17b01a0555")||e1.getText().toString().equals("17b01a0556")||e1.getText().toString().equals("17b01a0557")||e1.getText().toString().equals("17b01a0558")||e1.getText().toString().equals("17b01a0559")||e1.getText().toString().equals("17b01a0560")||e1.getText().toString().equals("17b01a0561")||e1.getText().toString().equals("17b01a0562")||e1.getText().toString().equals("17b01a0563")||e1.getText().toString().equals("17b01a0564")||e1.getText().toString().equals("17b01a0565")||e1.getText().toString().equals("17b01a0566")||e1.getText().toString().equals("17b01a0567")||e1.getText().toString().equals("17b01a0568")||e1.getText().toString().equals("17b01a0569")||e1.getText().toString().equals("17b01a0570")||e1.getText().toString().equals("17b01a0571")||e1.getText().toString().equals("17b01a0572")||e1.getText().toString().equals("17b01a0573")||e1.getText().toString().equals("17b01a0574")||e1.getText().toString().equals("17b01a075")||e1.getText().toString().equals("17b01a0576")||e1.getText().toString().equals("17b01a0577")||e1.getText().toString().equals("17b01a0578")||e1.getText().toString().equals("17b01a0579")||e1.getText().toString().equals("17b01a0580")||e1.getText().toString().equals("17b01a0581")||e1.getText().toString().equals("17b01a0581")||e1.getText().toString().equals("17b01a0582")||e1.getText().toString().equals("17b01a0583")||e1.getText().toString().equals("17b01a0584")||e1.getText().toString().equals("17b01a0585")||e1.getText().toString().equals("17b01a0586")||e1.getText().toString().equals("17b01a0587")||e1.getText().toString().equals("17b01a0588")||e1.getText().toString().equals("17b01a0589")||e1.getText().toString().equals("17b01a0590")||e1.getText().toString().equals("17b01a0591")||e1.getText().toString().equals("17b01a0592")||e1.getText().toString().equals("17b01a0593")||e1.getText().toString().equals("17b01a0594")||e1.getText().toString().equals("17b01a0595")||e1.getText().toString().equals("17b01a0596")||e1.getText().toString().equals("17b01a0597")||e1.getText().toString().equals("17b01a0598")||e1.getText().toString().equals("17b01a0599")||e1.getText().toString().equals("17b01a05a0")||e1.getText().toString().equals("17b01a05a1")||e1.getText().toString().equals("17b01a05a2")||(e1.getText().toString().equals("17b01a05a3")||e1.getText().toString().equals("17b01a05a4")||e1.getText().toString().equals("17b01a05a5")||e1.getText().toString().equals("17b01a05a6")||e1.getText().toString().equals("17b01a05a7")||e1.getText().toString().equals("17b01a05a8")||e1.getText().toString().equals("17b01a05a9")||e1.getText().toString().equals("17b01a05b0")||e1.getText().toString().equals("17b01a05b1")||e1.getText().toString().equals("17b01a05b2")||e1.getText().toString().equals("17b01a05b3")||e1.getText().toString().equals("17b01a05b4")||e1.getText().toString().equals("17b01a05b5")||e1.getText().toString().equals("17b01a05b6")||e1.getText().toString().equals("17b01a05b7")||e1.getText().toString().equals("17b01a05b8")||e1.getText().toString().equals("17b01a05b9")||e1.getText().toString().equals("17b01a05c0")||e1.getText().toString().equals("17b01a05c1")||e1.getText().toString().equals("17b01a05c2")||e1.getText().toString().equals("17b01a05c3")||e1.getText().toString().equals("17b01a05c4")||e1.getText().toString().equals("17b01a05c5")||e1.getText().toString().equals("17b01a05c6")||e1.getText().toString().equals("17b01a05c7")||e1.getText().toString().equals("17b01a05c8")||e1.getText().toString().equals("17b01a05c9")||e1.getText().toString().equals("17b01a05d0")||e1.getText().toString().equals("17b01a05d1")||e1.getText().toString().equals("17b01a05d2")||e1.getText().toString().equals("17b01a05d3")||e1.getText().toString().equals("17b01a05d4")||e1.getText().toString().equals("17b01a05d5")||e1.getText().toString().equals("17b01a05d6")||e1.getText().toString().equals("17b01a05d7")||e1.getText().toString().equals("17b01a05d8")||e1.getText().toString().equals("17b01a05d9")||e1.getText().toString().equals("17b01a05e0")||e1.getText().toString().equals("17b01a05e1")||e1.getText().toString().equals("17b01a05e2")||e1.getText().toString().equals("17b01a05e3")||e1.getText().toString().equals("17b01a05e4")||e1.getText().toString().equals("17b01a05e5")||e1.getText().toString().equals("17b01a05e6")||e1.getText().toString().equals("17b01a05e7")||e1.getText().toString().equals("17b01a05e8")||e1.getText().toString().equals("17b01a05e9")||e1.getText().toString().equals("17b01a05f0")||e1.getText().toString().equals("17b01a05f1")||e1.getText().toString().equals("17b01a05f2")||e1.getText().toString().equals("17b01a05f3")||e1.getText().toString().equals("17b01a05f4")||e1.getText().toString().equals("17b01a05f5")||e1.getText().toString().equals("17b01a05f6")||e1.getText().toString().equals("17b01a05f7")||e1.getText().toString().equals("17b01a05f8")||e1.getText().toString().equals("17b01a05f9")||e1.getText().toString().equals("17b01a0550")||e1.getText().toString().equals("17b01a0517")||e1.getText().toString().equals("17b01a0515")||e1.getText().toString().equals("17b01a05g0")||e1.getText().toString().equals("17b01a05g1")||e1.getText().toString().equals("17b01a05g2")||e1.getText().toString().equals("17b01a05g3")||e1.getText().toString().equals("17b01a05g4")||e1.getText().toString().equals("17b01a05g5")||e1.getText().toString().equals("17b01a05g6")||e1.getText().toString().equals("17b01a05g7")||e1.getText().toString().equals("17b01a05g8")||e1.getText().toString().equals("17b01a05g9")||e1.getText().toString().equals("17b01a05h0")||e1.getText().toString().equals("17b01a05h1")||e1.getText().toString().equals("17b01a05h2")||e1.getText().toString().equals("17b01a05h3")||e1.getText().toString().equals("17b01a05h4")||e1.getText().toString().equals("17b01a05h5")||e1.getText().toString().equals("17b01a05h6")||e1.getText().toString().equals("17b01a05h7")||e1.getText().toString().equals("17b01a05h8")||e1.getText().toString().equals("17b01a05h9")||e1.getText().toString().equals("17b01a05i0")||e1.getText().toString().equals("17b01a0515")||e1.getText().toString().equals("18b01a0501")||e1.getText().toString().equals("18b01a0502")||e1.getText().toString().equals("18b01a0503")||e1.getText().toString().equals("18b01a0504")||e1.getText().toString().equals("18b01a0505")||e1.getText().toString().equals("18b01a0506"))&&(e2.getText().toString().equals("webcap"))){
                    //login for student option screen
                    Intent newintent = new Intent(getApplicationContext(), Student.class);
                    startActivity(newintent);
                    //Toast.makeText(Hostel8.this,"regno and password perfect",Toast.LENGTH_SHORT).show();

                }
                else{

                    Toast.makeText(MainActivity.this,"Wrong regno or Wrong password",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
