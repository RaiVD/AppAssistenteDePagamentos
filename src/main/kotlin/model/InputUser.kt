package model

class InputUser {
    fun ReadIntegerFromUser(mensagem: String): Int {
        while (true) {
            print(mensagem)
            val entrada = readlnOrNull()
            try {
                return entrada?.toInt() ?: throw NumberFormatException()
            } catch (e: NumberFormatException) {
                println("Entrada inválida. Por favor, digite um número inteiro válido.")
            }
        }
    }
}