package com.edu.basicstatecodelab.ui.compose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.edu.basicstatecodelab.ui.compose.components.StatefulCounter
import com.edu.basicstatecodelab.ui.compose.components.WellnessTasksList
import com.edu.basicstatecodelab.ui.compose.components.WellnessViewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter(modifier)
        WellnessTasksList(
            list = wellnessViewModel.tasks,
            onCheckedTask = { task, checked -> wellnessViewModel.changeCheckedTask(task, checked) },
            onCloseTask = { task -> wellnessViewModel.remove(task) }
        )
    }
}

@Composable
@Preview
fun WellnessScreenPreview() {
    WellnessScreen()
}


