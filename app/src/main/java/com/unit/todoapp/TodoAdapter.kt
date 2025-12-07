package com.unit.todoapp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter (
    var todos: List<TodoItem>
): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){
    inner class TodoViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TodoViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: TodoViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}