package controller

import model.InputUser

class ChoiceValidation(val option: Int) {
    fun validateOption(){
        when(option){
            1->{

            }
            2->{

            }
            else -> println("Opção invalida!")
        }
    }
    fun names(){
        val inputUser = InputUser()
        val value = inputUser.ReadIntegerFromUser("Quantos nomes participaram do sorteio?")
        for (i in 1 .. value){
            val name = inputUser.ReadStringFromUser("Qual o nome $i: ")
        }
    }
}