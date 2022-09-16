
fun main() {
    print("Digite o nome do aluno: ")
    var nome = readLine()!!
    print("Digite o telefone do aluno ou responsável: ")
    var tel = readLine()!!
    print("Digite a série do aluno: ")
    var serie = readLine()!!
    println("------------------------------")
    print("Digite a primeira nota: ")
    var nota1 = readLine()!!.toFloat()
    print("Digite a segunda nota: ")
    var nota2 = readLine()!!.toFloat()
    print("Digite a terceira nota: ")
    var nota3 = readLine()!!.toFloat()
    print("Digite a quarta nota: ")
    var nota4 = readLine()!!.toFloat()
    var media = (nota1+nota2+nota3+nota4)/4
        print("Aluno: $nome. Telefone: $tel. Série: $serie.")
    if (media>=7){
        print("A média é: $media. APROVADO.")
    }else{
        print(" A média é: $media. REPROVADO.")
    }

}
