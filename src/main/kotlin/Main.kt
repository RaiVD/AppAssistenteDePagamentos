import controller.ChoiceValidation
import model.InputUser

fun main() {
    val option = InputUser().ReadIntegerFromUser("Qual tipo de sorteio deseja fazer?")
    ChoiceValidation(option).validateOption()
}

