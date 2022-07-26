fun main(args: Array<String>) {
    println("Digite um número: ")
    var numero = readLine()!!.toInt()
    println("O antecessor de $numero é ${numero - 1}.")
    println("O sucessor de $numero é ${numero + 1}.")

}