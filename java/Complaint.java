package a.svecw.original;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Complaint extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7,e8;
    TextView t1;
    Button b1;
    Spinner s1,s2;
    //Creating database referenece
    DatabaseReference complaints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Connecting corresponnding xml file
        setContentView(R.layout.complaint);
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
        s1=findViewById(R.id.s1);
        b1=findViewById(R.id.b1);

        //creating database with branch Complaintper for firebasedatabase
        complaints= FirebaseDatabase.getInstance().getReference().child("Complaintper");
        //on click submit to get all details filled in components credentials to verify
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if any of the credentials is empty then requesting to fill all details
                if(e1.getText().toString().equals("")||e2.getText().toString().equals("")||s2.toString().equals("")||e4.getText().toString().equals("")||s1.toString().equals("")||e5.getText().toString().equals("")){
                    Toast.makeText(Complaint.this,"Fields Cannot Be Empty",Toast.LENGTH_SHORT).show();
                }else{
                    // if all credentials are filled then call insertComplaint() method to push data to database and show registered message on screen
                    insertComplaint();
                    Toast.makeText(Complaint.this,"Registered",Toast.LENGTH_SHORT).show();
                    Intent newintent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(newintent);

                }



            }
        });
    }
    private void insertComplaint(){
        //Getting all credentials filled into string form
        String  name=e1.getText().toString();
        String regno=e2.getText().toString();
        String hostel=s2.getSelectedItem().toString();
        String roomno=e4.getText().toString();
        String complaint =s1.getSelectedItem().toString();
        String phone=e5.getText().toString();
        //Calling constructor with all credentials as parameters of Complaintper class
        Complaintper complaintper = new Complaintper(name,regno,hostel,roomno,complaint,phone);
        //pushing the object to store data into Firebasedatabase
        complaints.push().setValue(complaintper);
    }
}
