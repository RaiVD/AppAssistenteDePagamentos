package controller

import model.Raffle

class ChoiceValidation(val option: Int) {
    fun validateOption(){
        val raffle = Raffle()
        when(option){
            1-> raffle.raffleNameFemale()
            2-> raffle.raffleNameMale()
            3-> raffle.raffleAnimal()
            else -> println("Opção invalida!")
        }
    }
}