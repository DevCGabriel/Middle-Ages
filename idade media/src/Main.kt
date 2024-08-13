//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Lista que armazenará as idades colocadas pelo usuário
    val idades = mutableListOf<Int>()

    // Loop para receber idades do usuário
    println("Digite as idades (digite -1 para terminar):")
    while (true){
            val input = readLine()?.toIntOrNull()
            if (input != null && input >= 0) {
                idades.add(input)

            }else if (input == -1) {
                break

            }else {
                println("Por favor, insira uma idade válida")
            }
    }

    if (idades.isNotEmpty()){
        val soma = idades.sum()
        val media = soma.toDouble() / idades.size


        println("As idade inseridas foram $idades")
        println("A média das idades é: $media")



    } else {
        println("Nenhuma idade foi inserida. ")
    }













}

