package a.svecw.original;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class New extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    Button b1,b2;
    String etmessage1="Your request for Birthday permissions is accepted";
    String etmessage2="Your request for Birthday permissions is rejected";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new1);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        t8=findViewById(R.id.t8);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);

        String x1 = getIntent().getStringExtra("name");
        String x2 = getIntent().getStringExtra("regno");
        String x3 = getIntent().getStringExtra("hostel");
        String x4 = getIntent().getStringExtra("roomno");
        String x5 = getIntent().getStringExtra("no of people");
        String x6=getIntent().getStringExtra("place");
        String x7 = getIntent().getStringExtra("date");
        String x8 = getIntent().getStringExtra("phone");

        t1.setText(x1);
        t2.setText(x2);
        t3.setText(x3);
        t4.setText(x4);
        t5.setText(x5);
        t6.setText(x6);
        t7.setText(x7);
        t8.setText(x8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ContextCompat.checkSelfPermission(New.this, Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){
                    sendMessage1();
                }
                else{
                    ActivityCompat.requestPermissions(New.this,new String[]{Manifest.permission.SEND_SMS},100);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(New.this, Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){
                    sendMessage2();
                }
                else{
                    ActivityCompat.requestPermissions(New.this,new String[]{Manifest.permission.SEND_SMS},100);
                }
            }
        });
    }
    private  void sendMessage1(){
        String sphone = t8.getText().toString().trim();
        String sMessage =etmessage1;
        if(!sphone.equals("")&&!sMessage.equals("")){
            SmsManager smsManager =SmsManager.getDefault();
            smsManager.sendTextMessage(sphone,null,sMessage,null,null);
            Toast.makeText(getApplicationContext(),"SMS sent successfully!",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Enter value first",Toast.LENGTH_SHORT).show();
        }
    }
    private  void sendMessage2(){
        String sphone = t8.getText().toString().trim();
        String sMessage =etmessage2;
        if(!sphone.equals("")&&!sMessage.equals("")){
            SmsManager smsManager =SmsManager.getDefault();
            smsManager.sendTextMessage(sphone,null,sMessage,null,null);
            Toast.makeText(getApplicationContext(),"SMS sent successfully!",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Enter value first",Toast.LENGTH_SHORT).show();
        }
    }


}
