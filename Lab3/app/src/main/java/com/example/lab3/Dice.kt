/* Name: Muhammad Abdul Rahman
   Student ID: A00257857
   Lab: 3 - Classes And Objects
 */

package com.example.lab3


import kotlin.random.Random

var diceNum: Int = 0

class Dice {
    /*
       0 Argument Constructor/Default Constructor will be automatically Generated
       No need to explicitly define it
*/
    init
    {
        getDiceNum()
    }

    private var diceN: Int
        get() = diceNum             // GETTER

        set(value) {                // SETTER
            diceN
        }

    init
    {
        for (i in 1..diceN)
        {

            val randomNum = List(6) { Random.nextInt(6) }
            val upside = randomNum.elementAt(0)
            println("Dice $i Rolled | ALL SIDES |: $randomNum")
            println("UPSIDE of Dice $i: $upside")
            println("\n")
        }
    }


}
// Created this class to Separately show working of 2 Arguments Constructor
class Dice2 {
    private var diceType: Int
    private var diceColor: String


    // 2 ARGUMENTS CONSTRUCTOR
    constructor(diceC: String, diceT: Int)
    {
        this.diceColor = diceC
        this.diceType = diceT

        /*      Restricting the DICE TYPE using IF-ELSE to 6-Sided | 8-Sided | 10-Sided to be more precise
                and if user input other than listed DICES Error Message will be thrown
        */
        if (diceT == 6 || diceT == 8 || diceT == 10)
        {
            getDiceNum()
            println("The Color of Dice is: $diceC")
            rollDice(diceT)

        }
        else
        {
            println("Select the Listed DICES ")
        }

    }
}

// FUNCTIONS
fun getDiceNum(){
    // Created this FUNCTION to get Number of Dices to be rolled whenever needed
    println("How many Dices you wanted to Roll: ")
    diceNum = Integer.valueOf(readln())
}
fun rollDice(num: Int){
    // This FUNCTION gets the type of DICE and Generate Numbers accordingly
    for (i in 1..diceNum)
    {

        val randomNum = List(num) { Random.nextInt(num) }
        val upside = randomNum.elementAt(0)
        println("Dice $i Rolled | ALL SIDES |: $randomNum")
        println("UPSIDE of Dice $i: $upside")
        println("\n")
    }
}