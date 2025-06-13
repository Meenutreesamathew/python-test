package com.example.customradiobutton

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.alpha

@Composable
fun CustomRadioButtonSample() {
    val options = listOf("Option A", "Option B", "Disabled")
    var selected by remember { mutableStateOf(options[0]) }

    Column(Modifier.padding(16.dp)) {
        options.forEach { option ->
            val isDisabled = option == "Disabled"
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(enabled = !isDisabled) { selected = option }
                    .padding(vertical = 4.dp)
            ) {
                CustomRadioButton(
                    selected = option == selected,
                    onClick = { selected = option },
                    enabled = !isDisabled
                )
                Text(
                    text = option,
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .alpha(if (isDisabled) 0.5f else 1f)
                )
            }
        }
        Text("Selected: $selected", Modifier.padding(top = 16.dp))
    }
}
