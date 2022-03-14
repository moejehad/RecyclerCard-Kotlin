package com.example.recyclercard.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclercard.R
import com.example.recyclercard.model.Student
import kotlinx.android.synthetic.main.student_item.view.*

class StudentAdapter(var activity: Activity, var data:ArrayList<Student>) : RecyclerView.Adapter<StudentAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvID = itemView.tvId
        val tvName = itemView.tvName
        val tvAvg = itemView.tvAvg
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val root = LayoutInflater.from(activity).inflate(R.layout.student_item,parent,false)
        return MyViewHolder(root)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvID.text = data[position].id.toString()
        holder.tvName.text = data[position].name
        holder.tvAvg.text = data[position].avg.toString()
    }

}