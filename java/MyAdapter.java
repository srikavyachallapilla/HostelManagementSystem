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

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>  {

    Context context;
    //create Arraylist of type User
    ArrayList<User> list;
    //create instance of onNoteListener
    OnNoteListener mOnNoteListener;
    //create parameterised constructor with onNotelistener and list of type User

    public MyAdapter(Context context, ArrayList<User> list,OnNoteListener onNoteListener) {
        this.context = context;
        this.list = list;
        this.mOnNoteListener=onNoteListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creating the items view display of credentials of Foodper data credentials
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return  new MyViewHolder(v,mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //  storing multiple induvidual credentials as single unit

        User user = list.get(position);
        holder.name.setText(user.getName());
        holder.regno.setText(user.getReg());
        holder.hostel.setText(user.getHostel());
        holder.roomno.setText(user.getRoomno());
        holder.complaint.setText(user.getComplaint());
        holder.phone.setText(user.getPhone());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    //creating a view holder class to implement multiple data as single unit in list

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView name,regno,hostel,roomno,complaint,phone;
        OnNoteListener onNoteListener;
        LinearLayout linearLayout;
        // Connecting all components of corresponding xml class
        public MyViewHolder(@NonNull View itemView,OnNoteListener onNoteListener) {
            super(itemView);
            name=itemView.findViewById(R.id.t1);
            regno=itemView.findViewById(R.id.t2);
            hostel=itemView.findViewById(R.id.t3);
            roomno=itemView.findViewById(R.id.t4);
            complaint=itemView.findViewById(R.id.t5);
            phone=itemView.findViewById(R.id.t6);
            linearLayout=itemView.findViewById(R.id.linearlayout);
            this.onNoteListener=onNoteListener;
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
        void  onNoteClick(int position);
    }
}
