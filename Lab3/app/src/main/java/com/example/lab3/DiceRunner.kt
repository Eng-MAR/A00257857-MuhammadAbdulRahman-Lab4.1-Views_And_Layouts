/* Name: Muhammad Abdul Rahman
   Student ID: A00257857
   Lab: 3 - Classes And Objects
 */

package com.example.lab3
// DICE RUNNER.KT
fun main(args: Array<String>){

    println("WELCOME TO DICE ROLLER ... !!! \n")


    println("Using 0 ARGUMENT CONSTRUCTOR | 6-SIDED DICE |")
    val runDice = Dice()


    println("Using 2 ARGUMENT CONSTRUCTOR")
    println("Input Dice Color: ")
    var dicecolor = readln()

    println("Input 6 for Six(6) Sided Dice \nInput 8 for Eight(8) Sided Dice \nInput 10 for Ten(10) Sided Dice")
    var dicetype = Integer.valueOf(readln())

    val runDice2 = Dice2(dicecolor,dicetype)
}