// Latihan 1 Hello World

fun main() {
    println("Hello, world!!!")
}

// Latihan 2 Fungsi Main

fun main(args: Array<String>) {
    println("Hello, world!!!")
}

// Latihan 3 Tipe Data dan variabel

fun main() {
    var nama = "Kotlin"
    println(nama)
}

// Latihan 4 Kondisi
fun main() {
    var umur: Int = 25
    if (umur >= 18) {
        println("Anda Sudah Dewasa")
    } else {
        println("Kamu belum dewasa")
    }
}

// Latihan 5 Loop
fun main() {
    for (i in 1..5) {
        println("i")
    }
}
fun main() {
    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }
}
fun main() {
    var i = 0
    do {
        println(i)
        i++
    } while (i <= 5)
}

// Latihan 6 Fungsi
fun main() {
    greeting("Kotlin")
}
fun greeting(nama: String) {
    println("Hello, $nama")
}

// Latihan 7 Lambda
fun main() {
    val greet = { name: String -> greeting(name) }
    greet("Kotlin")
}
fun greeting(name: String) {
    println("Hello, $nama")
}
