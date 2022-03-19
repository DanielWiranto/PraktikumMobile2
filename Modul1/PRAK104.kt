package Modul1

class Hewan(nama: String, habitat: String, Makanan: String, Pernapasan: String){
    var nama = nama;
    var habitat = habitat;
    var Makanan = Makanan;
    var Pernapasan = Pernapasan;

    fun print(){
        println("Nama Hewan : $nama");
        println("Habitat : $habitat");
        println("Makanan : $Makanan")
        println("Alat Pernapasan : $Pernapasan");
    }

}

fun main(args: Array<String>) {
    val data_A = Hewan("Kelinci ","Darat", "Herbivora","Paru-Paru");
    data_A.print();
}
