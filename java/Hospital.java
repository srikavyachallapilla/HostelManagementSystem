package a.svecw.original;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Hospital extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9;
    TextView t1;
    Button b1;
    Spinner s2;
    //Creating database referenece
    DatabaseReference hospitals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Connecting corresponnding xml file
        setContentView(R.layout.hospital);
        //connecting the components of connected xml file
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        s2=findViewById(R.id.s2);
        e4=findViewById(R.id.e4);
        e5=findViewById(R.id.e5);
        e6=findViewById(R.id.e6);
        t1=findViewById(R.id.t1);
        e7=findViewById(R.id.e7);
        e8=findViewById(R.id.e8);
        e9=findViewById(R.id.e9);
        b1=findViewById(R.id.b1);
        //creating database with branch Hospitalper for firebasedatabase
        hospitals= FirebaseDatabase.getInstance().getReference().child("Hospitalper");
        //on click submit to get all details filled in components credentials to verify
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if any of the credentials is empty then requesting to fill all details
                if(e1.getText().toString().equals("")||e2.getText().toString().equals("")||s2.toString().equals("")||e4.getText().toString().equals("")||e5.getText().toString().equals("")||e6.getText().toString().equals("")||e7.getText().toString().equals("")||t1.getText().toString().equals("")||e1.getText().toString().equals("")||e9.getText().toString().equals("")){
                    Toast.makeText(Hospital.this,"Fields Cannot Be Empty",Toast.LENGTH_SHORT).show();
                }else{
                    // if all credentials are filled then call insertHospital() method to push data to database and show registered message on screen
                    insertHospital();
                    Toast.makeText(Hospital.this,"Registered",Toast.LENGTH_SHORT).show();
                    Intent newintent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(newintent);

                }



            }
        });
    }
    private void insertHospital(){
        //Getting all credentials filled into string form
        String  name=e1.getText().toString();
        String regno=e2.getText().toString();
        String hostel=s2.getSelectedItem().toString();
        String roomno=e4.getText().toString();
        String reason =e5.getText().toString();
        String hospitalname=e6.getText().toString();
        String date=e7.getText().toString();
        String time =e8.getText().toString();
        String phone = e9.getText().toString();
        //Calling constructor with all credentials as parameters of Hospitalper class
        Hospitalper hospitalper = new Hospitalper(name,regno,hostel,roomno,reason,hospitalname,date,time,phone);
        //pushing the object to store data into Firebasedatabase
        hospitals.push().setValue(hospitalper);
    }
}
