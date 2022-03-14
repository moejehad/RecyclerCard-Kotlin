package com.example.recyclercard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclercard.adapter.StudentAdapter
import com.example.recyclercard.model.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = ArrayList<Student>()
        data.add(Student(1,"Mohammed Jehad",90.0))
        data.add(Student(2,"Mohanad Jehad",80.0))
        data.add(Student(3,"moe Jehad",70.0))
        data.add(Student(4,"mad Jehad",60.0))


        rvStudent.layoutManager = LinearLayoutManager(this)
        //rvStudent.layoutManager = GridLayoutManager(this,3)
        val studentAdapter = StudentAdapter(this,data)
        rvStudent.adapter = studentAdapter

    }
}