// My Solution

fun main() {
	val tes = Song("I'm in Love","Reza Darmawangsa",2020,1000)
    tes.desc()
}



class Song (val title: String, val artist: String, val published: Int, val countPlay: Int)  {
    val isPopular = when {
    countPlay >= 1000 -> true
    else -> false
}
    
    fun desc() {
        println("${title}, performed by ${artist}, was released in ${published}.")
    }
}

// Solution

fun main() {    
    val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
    brunoSong.printDescription()
    println(brunoSong.isPopular)
}


class Song(
    val title: String, 
    val artist: String, 
    val yearPublished: Int, 
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }   
}
