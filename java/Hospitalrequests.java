package a.svecw.original;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Hospitalrequests extends AppCompatActivity implements MyAdapter1.OnNoteListener {
    RecyclerView recyclerView;
    // creating database reference
    DatabaseReference database;
    //creating  object of MyAdapter1 class
    MyAdapter1 myAdapter;
    //creating  arraylist of type Userhospital
    ArrayList<Userhospital> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //connecting the components of connected xml file
        setContentView(R.layout.hospitalrequests);

        recyclerView = findViewById(R.id.userlist);
        //Accessing firebase database to path hospitalper
        database =FirebaseDatabase.getInstance().getReference("Hospitalper");

        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        //calling constructer of Myadapter1 class
        myAdapter = new MyAdapter1(this,list,this::onNoteClick);
        //adding MyAdapter1 object to recycler view
        recyclerView.setAdapter(myAdapter);
        //adding the data one by one present in given Food per database to recycler view list
        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot:snapshot.getChildren()){
                    Userhospital user = (Userhospital) dataSnapshot.getValue(Userhospital.class);
                    list.add(user);

                }

                myAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
    //Setting onclick of an item in list to perform a action

    @Override
    public void onNoteClick(int position) {
        Intent newintent = new Intent(getApplicationContext(), New1.class);
        //getting the data at the item clicked in recycler view list
        Userhospital user1 =list.get(position);
        //Storing the data from database of clicked item to transfer to another screen
        newintent.putExtra("name",user1.getName());
        newintent.putExtra("regno",user1.getRegno());
        newintent.putExtra("hostel",user1.getHostel());
        newintent.putExtra("roomno",user1.getRoomno());
        newintent.putExtra("reason",user1.getReason());
        newintent.putExtra("hospital",user1.getHospitalname());
        newintent.putExtra("date",user1.getDate());
        newintent.putExtra("time",user1.getTime());
        newintent.putExtra("phone",user1.getPhone());
        startActivity(newintent);
    }
}
