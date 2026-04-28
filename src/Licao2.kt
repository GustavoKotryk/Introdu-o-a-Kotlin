fun Licao2() {
    val temp1 = 10
    val temp2 = 20

    val soma = temp1 + temp2
    val quantidade = 2
    val media = soma/quantidade

    println("Media temperatura: $media")

    val tempAlerta = 12

    if(media > tempAlerta){
        println("Alerta maquina superaquecida")
    } else{
        println("Temperatura normal")
    }
}