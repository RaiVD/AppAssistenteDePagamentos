package model

import view.OutputUser
import kotlin.random.Random

class Raffle() {
    private val view = OutputUser()
    val database = Database()
    fun raffleNameFemale(){
        val namesFemale = database.listOfFemaleNames
        val randomIndex = Random.nextInt(namesFemale.size)
        val nomeSorteado = namesFemale[randomIndex]
        println(view.displayDrawnNameFemale(nomeSorteado))
    }
    fun raffleNameMale(){
        val namesMale = database.listOfMaleNames
        val randomIndex = Random.nextInt(namesMale.size)
        val nomeSorteado = namesMale[randomIndex]
        println(view.displayDrawnNameMale(nomeSorteado))
    }
    fun raffleAnimal(){
        val nameAnimal = database.animalList
        val randomIndex = Random.nextInt(nameAnimal.size)
        val nomeSorteado = nameAnimal[randomIndex]
        println(view.displayDrawnNameAnimal(nomeSorteado))
    }

}