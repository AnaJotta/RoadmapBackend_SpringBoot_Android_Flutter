package com.example.piedrapapeltijeras

import java.util.Locale

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    println("¿Piedra, Papel o Tijeras? Introduce tu elección")
    playerChoice = readln().lowercase(Locale.ROOT)

    while (playerChoice !in listOf("piedra", "papel", "tijeras")) {
        println("No has introducido una opción válida. Por favor, escribe 'piedra', 'papel' o 'tijeras'. Vuelve a intentarlo.")
        playerChoice = readln().lowercase(Locale.ROOT)
    }


    val randomNumber = (1..3).random()

   /* if (randomNumber == 1) {
        computerChoice = "Piedra
    }else if(randomNumber ==2) {
        computerChoice = "Papel
    }else if(randomNumber == 3) {
        computerChoice = "Tijeras"
    }
 */

    when (randomNumber) {
        1 -> {
            computerChoice = "piedra"
        }
        2 -> {
            computerChoice = "papel"
        }
        3 -> {
            computerChoice = "tijeras"
        }
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Empate"
        playerChoice == "piedra" && computerChoice == "tijeras" -> "Gana jugador"
        playerChoice == "papel" && computerChoice == "piedra" -> "Gana jugador"
        playerChoice == "tijeras" && computerChoice == "papel" -> "Gana jugador"
        else -> "Gana pc"

    }
        println(winner)

}