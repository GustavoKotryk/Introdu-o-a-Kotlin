fun Licao1() {
    println("=== LIÇÃO 1: Variáveis da Máquina ===")

    val nomeMaquina = "Torno CNC"
    var temperatura = 36.5
    var ligado = false
    var velocidade = 1200

    println("Nome da máquina:  $nomeMaquina")
    println("Temperatura: $temperatura")
    println("Status: ${if (ligado) "Ligado" else "Desligado"}")
    println("Velocidade $velocidade rpm")

}