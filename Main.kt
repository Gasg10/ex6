fun main(){
    println("Introduza uma palavra:")
    var pal1 = readln().toString()
    if (pal1 == null){
        println("Palavra Inválida")
    }
    val comprimento = pal1.length
    when (comprimento){
        1,3 -> println("A palavra $pal1 é curta")
        4,9 -> println("A palavra $pal1 é média")
        else -> println("A palavra $pal1 é longa")
    }
}