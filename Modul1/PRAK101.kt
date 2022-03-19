package Modul1

import java.util.*

fun main(args: Array<String>){

    val input = Scanner(System.`in`)

    print("Waktu Sekarang : ")
    val Time = input.nextLine();
    print("Nama Anda : ")
    val Name = input.nextLine();
    print("Umur Anda : ")
    val Age = input.nextLine();
    print("Suhu Tubuh Anda Anda : ")
    val Temp = input.nextLine();

    println()
    println("Selamat $Time, $Name.\nUmur anda $Age Tahun. \nSuhu Tuhuh anda $Temp derajat \nCelcius.")



}
