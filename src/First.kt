fun main(){
    println("Masai School")
    Names()
    Perimeter(4)
    diffrence()
    greater()
    Week()
    odd()
    sum()
}
fun Name(){
    val name = "Abhishek"
    println(name)
}
fun Names(){
    var name ="Student_Name"
    println(name)
    name = "Father_Name"
    println(name)
}
fun Perimeter( n : Int){
    println("Area of perimeter "+4*n)
}
fun diffrence(){
    val a = "10"
    val b = "5"
    val out = a.toInt() - b.toInt();
    println(out)
}
fun greater(){
    val a = 10
    val b = 5
    if (a < b) println(b) else println(a)
}
fun odd(){
    val num = 5
    if (num % 2 != 0) println("Odd Number ") else println("Even")
}
fun Week(){
    val day = "Monday"
    when(day){
        "Monday" -> println("mon")
        "Tuesday" -> println("tue")
        "Wednesday" -> println("wed")
        "Thrusday" -> println("thu")
        "Friday" -> println("fri")
        "Saturday" -> println("sat")
        else -> println("Invalid day")

    }
}
fun sum(){
    var n = 0;
    for (i in 1..10){
        if (i % 3 == 0){
            n += i;
        }
    }
    println(n)
}