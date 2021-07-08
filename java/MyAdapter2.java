package a.svecw.original;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder>  {
    Context context;
    //create Arraylist of type Userbirthday
    ArrayList<Userbirthday> list;
    //create instance of onNoteListener
    OnNoteListener monNoteListener;
    //create parameterised constructor with onNotelistener and list of type Userbirthday
    public MyAdapter2(Context context, ArrayList<Userbirthday> list,OnNoteListener onNoteListener) {
        this.context = context;
        this.list = list;
        this.monNoteListener=onNoteListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creating the items view display of credentials of Birthdayper data credentials
        View v = LayoutInflater.from(context).inflate(R.layout.item2,parent,false);
        return  new MyViewHolder(v,monNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //  storing multiple induvidual credentials as single unit
        Userbirthday userbirthday = list.get(position);
        holder.name.setText(userbirthday.getName());
        holder.regno.setText(userbirthday.getRegno());
        holder.hostel.setText(userbirthday.getHostel());
        holder.roomno.setText(userbirthday.getRoomno());
        holder.place.setText(userbirthday.getPlace());
        holder.no_of_people.setText(userbirthday.getNo_of_people());
        holder.date.setText(userbirthday.getDate());
        holder.phone.setText(userbirthday.getPhone());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    //creating a view holder class to implement multiple data as single unit in list

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // Connecting all components of corresponding xml class
        TextView name,regno,hostel,roomno,place,date,no_of_people,phone;
        OnNoteListener onNoteListener;
        LinearLayout linearLayout;
        public MyViewHolder(@NonNull View itemView,OnNoteListener onNoteListener) {
            super(itemView);
            name=itemView.findViewById(R.id.t1);
            regno=itemView.findViewById(R.id.t2);
            hostel=itemView.findViewById(R.id.t3);
            roomno=itemView.findViewById(R.id.t4);
            place=itemView.findViewById(R.id.t5);
            no_of_people=itemView.findViewById(R.id.t6);
            date=itemView.findViewById(R.id.t7);
            phone=itemView.findViewById(R.id.t8);
            this.onNoteListener=onNoteListener;
            linearLayout=itemView.findViewById(R.id.linearlayout);
            itemView.setOnClickListener(this);

        }

        // on click function to get all the data as single unit find in the list
        @Override
        public void onClick(View view) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }
    // Defining abstract method OnNoteListener
    public interface OnNoteListener{
        void onNoteClick(int position);
    }
}
