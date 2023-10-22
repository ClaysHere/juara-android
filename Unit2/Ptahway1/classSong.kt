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
