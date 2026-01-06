package com.yeditepe.finalexam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.yeditepe.finalexam.model.Task
import com.yeditepe.finalexam.viewmodel.TaskViewModel

@Composable
fun TaskListScreen(
    viewModel: TaskViewModel = viewModel(),
    navController: NavHostController,
    task: Task
) {
    val tasks = viewModel.tasks
    Column {
            TaskRow(task = task, navController = navController)
        }
    }
}
@Composable
fun TaskRow(task: Task, navController: NavController) {
    Text(
        text = task.title,
        modifier = Modifier.clickable {
            navController.navigate("taskDetail/${task.title}")
        }
    )
}

