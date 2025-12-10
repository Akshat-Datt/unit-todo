package com.unit.todoapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.unit.todoapp.ui.theme.TodoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rvTodo = findViewById<RecyclerView>(R.id.rvTodo)
        val btnAddItem = findViewById<Button>(R.id.btnAddItem)

        var todoList = mutableListOf<TodoItem>(
            TodoItem("New Todo", true)
        )

        val adapter = TodoAdapter(todoList)

        rvTodo.adapter = adapter
        rvTodo.layoutManager = LinearLayoutManager(this)

        btnAddItem.setOnClickListener {
            val title = findViewById<EditText>(R.id.etItemText).text.toString()
            val todo = TodoItem(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size -1)
        }
    }
}
