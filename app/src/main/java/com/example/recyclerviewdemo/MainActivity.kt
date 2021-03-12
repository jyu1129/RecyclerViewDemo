package com.example.recyclerviewdemo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var myStudentList = ArrayList<StudentItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateData()

        val recyclerView: RecyclerView = findViewById(R.id.myStudentView)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            recyclerView.adapter = MyAdapter(myStudentList)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.setHasFixedSize(true)
        }
    }

    fun generateData(){
        val stud1 = StudentItem(R.drawable.ic_face, "John", "RSF")
        val stud2 = StudentItem(R.drawable.ic_face, "Alex", "RDS")
        val stud3 = StudentItem(R.drawable.ic_face, "Mark", "RSF")
        val stud4 = StudentItem(R.drawable.ic_face, "Steven", "RDS")
        val stud5 = StudentItem(R.drawable.ic_face, "Alice", "RSF")

        myStudentList.add(stud1)
        myStudentList.add(stud2)
        myStudentList.add(stud3)
        myStudentList.add(stud4)
        myStudentList.add(stud5)
    }
}