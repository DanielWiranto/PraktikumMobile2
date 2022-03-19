package Modul1

import java.util.Scanner

fun rumus(nilai: Int):Int{
    return 2*(Math.pow(nilai.toDouble(),2.0).toInt())+(5*nilai) - 8

}

fun main(){

    val nilai : Int;
    val input = Scanner(System.`in`)
    print("Nilai = ")
    nilai = input.nextInt()

    println(rumus(nilai))
    
}

