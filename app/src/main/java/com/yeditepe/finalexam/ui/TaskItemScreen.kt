package com.yeditepe.finalexam.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yeditepe.finalexam.model.Task

@Composable
fun TaskItemScreen(task: Any) {

    var isCompleted by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(16.dp)) {

        Text(
            text = "Submit Final Project",
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = if (isCompleted) "Completed" else "Not Completed"
        )

        Button(
            onClick = {
                isCompleted = !isCompleted
            }
        ) {
            Text("Change Status")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun TaskItemPreview() {

    @Preview(showBackground = true)
    @Composable
    fun TaskItemPreview() {
        TaskItemScreen(
            task = Task(
                id = 1,
                title = ".",
                description = "..",
                isCompleted = false
            )
        )
    }
}


