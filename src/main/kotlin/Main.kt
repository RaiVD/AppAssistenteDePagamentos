import controller.ChoiceValidation
import model.InputUser

fun main() {
    println("--------------------- Sorteador ---------------------")
    println("1. Nome Feminino | 2. Nome Masculino | 3. Nome Animal")
    val option = InputUser().ReadIntegerFromUser("Qual tipo de sorteio deseja fazer: ")
    ChoiceValidation(option).validateOption()
}

