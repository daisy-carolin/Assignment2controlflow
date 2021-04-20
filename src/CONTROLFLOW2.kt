import java.awt.List
import java.util.*

fun main(){
    isEven(4)
    isEven(5)
    isEven(7)
    isEven(8)
    var n=supermarket("carrefour")
    println(n[0])
    println(n[2])
    println(n[4])
    println(n[6])
    println(n[8])

    var product = Product("mango",20,30,"grocery")
    product("mango")

    var ans = names("Daisi","Beth","Juliet","Mercy")
    println(ans)

}
fun isEven(num:Int){
    if (num%2==0){
        println("True")
    }
    else{
        println("false")
    }
}
fun productlist() {

}
fun supermarket(supermarket:String):String{
    var n=supermarket
    return supermarket

}
data class Product(var name:String, var weight:Int, var price:Int, var category: String){

}
fun product (item:String){

    listOf<String>("grocery")
    listOf<String>("hygiene")
    listOf<String>("others")

    when (item){
        "grocery" -> listOf("grocery")
        "hygiene" -> listOf("hygiene")
         else -> listOf("others")
    }

}
fun names (name1:String,name2:String,name3:String,name4:String): String {
    var arrayNames = arrayOf(name1,name2,name3,name4)
    var answer = " "
    for (name in arrayNames){
        if (name.length %2 == 0){
            answer.plus(name)
        }
    }
    return answer

}

