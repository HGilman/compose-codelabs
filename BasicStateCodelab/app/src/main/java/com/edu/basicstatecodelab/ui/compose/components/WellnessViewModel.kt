package com.edu.basicstatecodelab.ui.compose.components

import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {

    private val _tasks: SnapshotStateList<WellnessTask> = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask> = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeCheckedTask(item: WellnessTask, checked: Boolean) {
        _tasks.find { it.id == item.id }?.let { task ->
            task.checked = checked
        }
    }
}


fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task number: $i") }
