//fourth Code Test How to Take Input

fun main (args:Array<String>)
{
    println("Enter name: ")
    var name = readLine()
    println("Enter Roll num : ")
    var roll : Int = readLine()!!.toInt()
    println("Enter Depart: ")
    var dep :String?
    dep = readLine()
    println("Enter Pi num: ")
    var pi : Double= readLine()!!.toDouble()

    println("**** OutPut ****")
    println("Name : " +name)
    println("Roll no : " +roll)
    println("Dep : " +dep)
    println("Pi : " +pi)

}