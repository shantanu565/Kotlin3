
// WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

fun main(){
    try {
        Class.forName("oracle.jdbd.driver.OracleDriver")
    }catch (e:ClassNotFoundException){
        e.printStackTrace()
    }

}