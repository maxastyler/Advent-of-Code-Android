package com.maxtyler.adventofcode

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.maxtyler.adventofcode.puzzles.year2021.day01
import com.maxtyler.adventofcode.ui.theme.AdventOfCodeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdventOfCodeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Day01()
                }
            }
        }
    }
}

@Composable
fun Day01() {
    var input by remember { mutableStateOf("") }
    var part1 by remember {mutableStateOf("na")}
    var part2 by remember {mutableStateOf("na")}
    val scope = LaunchedEffect(input) {
        val parsed = day01.parseInput(input)
        part1 = day01.part1(parsed)
        part2 = day01.part2(parsed)
    }
    Column {
        Row(modifier = Modifier.fillMaxHeight(0.5F)) {
            TextField(input, { input = it })
            Button(onClick = { input = "" }) {
                Text("clear")
            }
        }
        Text("Part 1: ${part1}")
        Text("Part 2: ${part2}")
    }
}

@Composable
fun Greeting(name: String) {
    var text by remember { mutableStateOf("") }
    TextField(value = text, onValueChange = { text = it })
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AdventOfCodeTheme {
        Greeting("Android")
    }
}