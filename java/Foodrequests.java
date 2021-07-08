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

public class Foodrequests extends AppCompatActivity implements MyAdapter3.OnNoteListener {
    RecyclerView recyclerView;
    // creating database reference
    DatabaseReference database;
    //creating  object of MyAdapter3 class
    MyAdapter3 myAdapter;
    //creating  arraylist of type User food
    ArrayList<Userfood> list;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Connecting corresponnding xml file
        setContentView(R.layout.foodrequests);
        //connecting the components of connected xml file
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        recyclerView = findViewById(R.id.userlist);
        //Accessing firebase database to path foodper
        database = FirebaseDatabase.getInstance().getReference("Foodper");
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        //calling constructer of Myadapter3 class
        myAdapter = new MyAdapter3(this, list,this::onNoteClick);
        //adding MyAdapter3 object to recycler view
        recyclerView.setAdapter(myAdapter);
        //adding the data one by one present in given Food per database to recycler view list
        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    Userfood user = (Userfood) dataSnapshot.getValue(Userfood.class);
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
        Intent newintent = new Intent(getApplicationContext(), New3.class);
        //getting the data at the item clicked in recycler view list
        Userfood user1 =list.get(position);
        //Storing the data from database of clicked item to transfer to another screen
        newintent.putExtra("name",user1.getName());
        newintent.putExtra("regno",user1.getRegno());
        newintent.putExtra("hostel",user1.getHostel());
        newintent.putExtra("roomno",user1.getRoomno());
        newintent.putExtra("reason",user1.getReason());
        newintent.putExtra("phone",user1.getPhone());
        startActivity(newintent);
    }
}
