fun Licao4(){
    val temp = 75

    when{
        temp < 60 -> println("Temperatudo normal")
        temp < 80 -> println("Atencao")
        else -> println("Critico")
    }
}