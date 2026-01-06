package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task

class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        return api.getTasks().map { dto ->
            Task(
                id = dto.id,
                title = dto.title,
                description = dto.description
            )
        }
    }
}
