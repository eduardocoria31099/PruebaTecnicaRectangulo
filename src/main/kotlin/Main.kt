private var alto: String? = ""
private var ancho: String? = ""
private var newAncho: Int? = 0
private var newAlto: Int? = 0
private var square: Int = 0
private var dimensions = IntArray(2)
private var value1: Int? = 0
private var value2: Int? = 0


fun main(args: Array<String>) {
    welcome()
}

private fun welcome() {
    putValues()
    if (ancho == alto) {
        println("Los valores ingresados forman un cuadrado")
        putValues()
    } else {
        newAncho = ancho?.toInt()
        newAlto = alto?.toInt()
        getSquare(alto = newAlto ?: 0, ancho = newAncho ?: 0)
        square++
        println("---> Total de cuadrados: $square")
    }
}

private fun getSquare(alto: Int, ancho: Int) {
    if (alto < ancho) {
        newAncho = ancho - alto
        square++

        dimensions[0] = alto
        dimensions[1] = alto

        value1 = dimensions[0]
        value2 = dimensions[1]

        println("Cuadrado: $square")
        println("Sus medidas son:")
        println("Alto:$value1")
        println("Ancho:$value2")

        println("---new ancho:$newAncho")
        println("---new alto:$value1")
        getSquare(value1 ?: 0, newAncho ?: 0)

    } else if (ancho < alto) {
        newAlto = alto - ancho
        square++

        dimensions[0] = ancho
        dimensions[1] = ancho

        value1 = dimensions[0]
        value2 = dimensions[1]

        println("Cuadrado: $square")
        println("Sus medidas son:")
        println("Alto:$value1")
        println("Ancho:$value2")

        println("---new alto:$newAlto")
        println("---new ancho:$value1")
        getSquare(newAlto ?: 0, value1 ?: 0)
    }
}

private fun putValues() {
    println("Ingrese el alto del rectangulo")
    alto = readln()
    println("Ingrese el ancho del rectangulo")
    ancho = readln()
}
