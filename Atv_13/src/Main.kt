fun main() {
    var opcao: Int = 0
    while(opcao != -1){
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Voce escolheu a opção $opcao")

    }
    println("Até a proxima!")
}