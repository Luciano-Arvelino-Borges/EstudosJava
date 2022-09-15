fun main() {
    print("Nome do Funcionário: ")
    var nome:String = readLine()!!
    print("Salário R$: ")
    var salario:Float = readLine()!!.toFloat()
    print("Reajuste %: ")
    var reaj:Float = readLine()!!.toFloat()
    println("$nome que ganhava R$ $salario de salário e depois do reajuste de $reaj % passará a ganhar ${salario+(salario*reaj/100)}.")


    //sal + ( sal * reaj /100 )

}