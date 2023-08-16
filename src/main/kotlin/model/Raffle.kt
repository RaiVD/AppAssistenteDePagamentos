package model

import view.OutputUser
import kotlin.random.Random

class Raffle() {
    private val view = OutputUser()
    val database = Database()
    fun raffleNameFemale(){
        val namesFemale = database.listOfFemaleNames
        println(view.displayDrawnNameFemale(raffle(namesFemale)))
    }
    fun raffleNameMale(){
        val namesMale = database.listOfMaleNames
        println(view.displayDrawnNameMale(raffle(namesMale)))
    }
    fun raffleAnimal(){
        val nameAnimal = database.animalList
        println(view.displayDrawnNameAnimal(raffle(nameAnimal)))
    }
    private fun raffle(names: ArrayList<String> = arrayListOf<String>()): String {
        val randomIndex = Random.nextInt(names.size)
        return names[randomIndex]
    }

}