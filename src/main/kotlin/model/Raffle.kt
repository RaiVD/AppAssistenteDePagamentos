package model

import view.OutputUser
import kotlin.random.Random

class Raffle(private val view: OutputUser) {
    fun raffleName(names: ArrayList<String>){
        val randomIndex = Random.nextInt(names.size)
        return view.displayDrawnName(randomIndex)
    }
    fun raffleNumber(value: ArrayList<Int>){
        val randomIndex = Random.nextInt(value.size)
        return view.displayDrawnNumber(randomIndex)
    }

}