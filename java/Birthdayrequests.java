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

public class Birthdayrequests extends AppCompatActivity  implements MyAdapter2.OnNoteListener {
    RecyclerView recyclerView;
    // creating database reference
    DatabaseReference database;
    //creating  object of MyAdapter2 class
    MyAdapter2 myAdapter;
    //creating  arraylist of type Userbirthday
    ArrayList<Userbirthday> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //connecting the components of connected xml file
        setContentView(R.layout.birthdayrequests);
        recyclerView = findViewById(R.id.userlist);
        //Accessing firebase database to path birthdayper
        database = FirebaseDatabase.getInstance().getReference("Birthdayper");
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        //calling constructer of Myadapter2 class
        myAdapter = new MyAdapter2(this, list,this::onNoteClick);
        //adding MyAdapter2 object to recycler view
        recyclerView.setAdapter(myAdapter);
        //adding the data one by one present in given Food per database to recycler view list
        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    Userbirthday user = (Userbirthday) dataSnapshot.getValue(Userbirthday.class);
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
        //getting the data at the item clicked in recycler view list
        Intent newintent = new Intent(getApplicationContext(), New.class);
        Userbirthday user1 =list.get(position);
        //Storing the data from database of clicked item to transfer to another screen
        newintent.putExtra("name",user1.getName());
        newintent.putExtra("regno",user1.getRegno());
        newintent.putExtra("hostel",user1.getHostel());
        newintent.putExtra("roomno",user1.getRoomno());
        newintent.putExtra("no of people",user1.getNo_of_people());
        newintent.putExtra("place",user1.getPlace());
        newintent.putExtra("date",user1.getDate());
        newintent.putExtra("phone",user1.getPhone());
        startActivity(newintent);
    }
}
