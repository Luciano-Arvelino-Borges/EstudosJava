fun main(args: Array<String>) {
    print("Ente com sua idade: ")
    var idade = readLine()!!.toInt()
    if(idade>=18) {
        if (idade==18){
        print("Igual a 18.")
        }else{
        print("Maior que 18.")
        }
    }else{
    print("Menor de idade.")
    }

}



