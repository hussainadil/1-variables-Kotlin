//Third Code Test difference B/w  var and val

fun main (args:Array<String>)
{
    var name ="Aadil"  // in var Read
    name="Aasim"       // and Write
    println("Name : " +name) // Here Aadil Replaced by Aasim

    // Now using val
    val name1= "Aamir"  // Only Readable
    //name1="Aatif"     error msg val can not be reasigned
    println("Name :" +name1)
}