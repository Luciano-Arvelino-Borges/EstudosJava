fun main(args: Array<String>){
    print("Digite o primeiro valor: ")
    var numero1:Float = readLine()!!.toFloat()
    print("Digite o segundo valor: ")
    var numero2:Float = readLine()!!.toFloat()

    println("A soma entre $numero1  e $numero2 é  ${numero1+numero2}")
    println("A diferença entre $numero1 e $numero2 é ${numero1 - numero2}")
    println("O produto entre $numero1 e $numero2 é ${numero1*numero2}")
    println("O quociente entre $numero1 e $numero2 é ${numero1/numero2}")
    println("O resto da divisão entre $numero1 e $numero2 é ${numero1%numero2}")

}
