package Modul1

import java.util.*

fun main ()
{
    val input = Scanner(System.`in`)
    print("Input Bilangan : ")
    val nilai = input.nextInt();

    var Jumlah : Int
    var kali : Int = 0;
    for(i in 1..999)
    {
        Jumlah = nilai*i
        if(((Jumlah%2)==0)|| ((Jumlah%3)==0)) {
            print("$Jumlah ")

            kali = kali+1
        }
        if(kali == 5){
            break
        }
    }

}
