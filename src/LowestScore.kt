fun main(){
    val Score = arrayOf(20,30,10,5)
    var lowest = Score[0]
    for (i in Score){
        if (i < lowest){
            lowest = i
        }
    }
    println(lowest)
}