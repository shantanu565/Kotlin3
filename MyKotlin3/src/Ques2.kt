
//WAP to create singleton class.

object MySingleton{
    val instance=MySingleton
}
fun main(){
    val mysingleton=MySingleton.instance
    println(mysingleton)
}