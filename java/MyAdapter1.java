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

public class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.MyViewHolder>  {

    Context context;
    //create Arraylist of type Userhospital
    ArrayList<Userhospital> list;
    //create instance of onNoteListener
    OnNoteListener monNoteListener;
    //create parameterised constructor with onNotelistener and list of type Userhospital

    public MyAdapter1(Context context, ArrayList<Userhospital> list,OnNoteListener onNoteListener) {
        this.context = context;
        this.list = list;
        this.monNoteListener=onNoteListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creating the items view display of credentials of Hospitalper data credentials
        View v = LayoutInflater.from(context).inflate(R.layout.item1,parent,false);
        return  new MyViewHolder(v,monNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //  storing multiple induvidual credentials as single unit
        Userhospital userhospital = list.get(position);
        holder.name.setText(userhospital.getName());
        holder.regno.setText(userhospital.getRegno());
        holder.hostel.setText(userhospital.getHostel());
        holder.roomno.setText(userhospital.getRoomno());
       holder.reason.setText(userhospital.getReason());
       holder.hospitalname.setText(userhospital.getHospitalname());
        holder.date.setText(userhospital.getDate());
        holder.time.setText(userhospital.getTime());
        holder.phone.setText(userhospital.getPhone());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    //creating a view holder class to implement multiple data as single unit in list

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // Connecting all components of corresponding xml class

        TextView name,regno,hostel,roomno,reason,hospitalname,date,time,phone;
        OnNoteListener onNoteListener;
        LinearLayout linearLayout;
        public MyViewHolder(@NonNull View itemView,OnNoteListener onNoteListener) {
            super(itemView);
            name=itemView.findViewById(R.id.t1);
            regno=itemView.findViewById(R.id.t2);
            hostel=itemView.findViewById(R.id.t3);
            roomno=itemView.findViewById(R.id.t4);
            reason=itemView.findViewById(R.id.t5);
            hospitalname=itemView.findViewById(R.id.t6);
            date=itemView.findViewById(R.id.t7);
            time=itemView.findViewById(R.id.t8);
            phone =itemView.findViewById(R.id.t9);
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
    public  interface OnNoteListener{
        void onNoteClick(int position);
    }
}
