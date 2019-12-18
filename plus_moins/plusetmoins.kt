fun main (args: Array<String>){
    println("Entrez la valeur à trouver")
    val value = readLine()
    println("Vous allez deviner la valeur")

    do {
        var find = readLine()
        if ("$value" == "$find"){
            println("Bravo tu as trouvé !")
        } else {
            if ("$value" < "$find") {
                println("C'est moins")
            } else {
                println("C'est plus")
            }
        }
    } while ("$value" != "$find")

}