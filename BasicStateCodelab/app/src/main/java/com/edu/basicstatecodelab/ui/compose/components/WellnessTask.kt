package com.edu.basicstatecodelab.ui.compose.components

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class WellnessTask(
    val id: Int,
    val label: String,
    initiallyChecked: Boolean = false
) {
    var checked: Boolean by mutableStateOf(initiallyChecked)
}

