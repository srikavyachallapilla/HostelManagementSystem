package a.svecw.original;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter4 extends RecyclerView.Adapter<MyAdapter4.MyViewHolder>  {

    Context context;
    //create Arraylist of type Userrating
    ArrayList<Userrating> list;
    //create parameterised constructor with onNotelistener and list of type Userrating
    public MyAdapter4(Context context, ArrayList<Userrating> list) {
        this.context = context;
        this.list = list;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creating the items view display of credentials of Ratingper data credentials
        View v = LayoutInflater.from(context).inflate(R.layout.item4,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //  storing multiple induvidual credentials as single unit
       Userrating user = list.get(position);
       holder.worker.setText(user.getWorker());
       holder.work.setText(user.getWork());
       holder.rating.setText(user.getRating());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    //creating a view holder class to implement multiple data as single unit in list


    public static class MyViewHolder extends RecyclerView.ViewHolder  {

        TextView  rating,work,worker;
        // Connecting all components of corresponding xml class
        LinearLayout linearLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            worker = itemView.findViewById(R.id.t1);
            work=itemView.findViewById(R.id.t2);
            rating = itemView.findViewById(R.id.t3);

            linearLayout=itemView.findViewById(R.id.linearlayout);

        }


    }

}
