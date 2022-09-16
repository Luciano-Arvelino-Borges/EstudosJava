fun main() {
    print("Ente com sua idade: ")
    var idade = readLine()!!.toInt()
    if(idade>=18) {
        print("Maior de idade. Voto obrigatório")
    }else{
    print("Menor de idade.")
    }
}