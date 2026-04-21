package com.app.todolist.domain

data class Todo(
    val id: Long,
    val title: String,
    val description: String?,
    val isCompleted: Boolean,
)

// fake objects
val todo1 = Todo(
    id = 1,
    title = "Tarefa1",
    description = "fazer tal coisa",
    isCompleted = false
)

val todo2 = Todo(
    id = 2,
    title = "Tarefa2",
    description = "fazer tal coisa",
    isCompleted = true
)

val todo3 = Todo(
    id = 3,
    title = "Tarefa3",
    description = "fazer tal coisa",
    isCompleted = false
)