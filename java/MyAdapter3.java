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

public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.MyViewHolder>  {
//create instance of onNoteListener
    Context context;
    //create Arraylist of type Userfood
    OnNoteListener monNoteListener;
    ArrayList<Userfood> list;
    //create parameterised constructor with onNotelistener and list of type Userfood

    public MyAdapter3(Context context, ArrayList<Userfood> list,OnNoteListener onNoteListener) {
        this.context = context;
        this.list = list;
        this.monNoteListener=onNoteListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creating the items view display of credentials of Foodper data credentials
        View v = LayoutInflater.from(context).inflate(R.layout.item3,parent,false);
        return  new MyViewHolder(v,monNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      //  storing multiple induvidual credentials as single unit

        Userfood userfood = list.get(position);
        holder.name.setText(userfood.getName());
        holder.regno.setText(userfood.getRegno());
        holder.hostel.setText(userfood.getHostel());
        holder.roomno.setText(userfood.getRoomno());
        holder.reason.setText(userfood.getReason());
        holder.phone.setText(userfood.getPhone());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    //creating a view holder class to implement multiple data as single unit in list


    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // Connecting all components of corresponding xml class
        TextView name,regno,hostel,roomno,reason,phone;
        OnNoteListener onNoteListener;
        LinearLayout linearLayout;
        public MyViewHolder(@NonNull View itemView,OnNoteListener onNoteListener) {
            super(itemView);
            name=itemView.findViewById(R.id.t1);
            regno=itemView.findViewById(R.id.t2);
            hostel=itemView.findViewById(R.id.t3);
            roomno=itemView.findViewById(R.id.t4);
            reason=itemView.findViewById(R.id.t5);
            phone=itemView.findViewById(R.id.t6);
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
    public interface  OnNoteListener{
        void onNoteClick(int position);
    }
}
