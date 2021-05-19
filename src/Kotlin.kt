fun main() {
    introduction("Stella",22)
    machine(8)
    machine(4)
    machine(24)
    println(names(arrayOf("Victorine","Mary","Jane")))
    multiply(22,12)
    divide(6,3)
    modulus(8,4)
    println(comparison(20,10))

}
fun introduction(name:String,age:Int){
    println("My name is $name and I am $age years old")

}
fun machine(age:Int){
    if (age>6 && age<=15){
        println("A bootle of fanta")
    }
    else if(age<6){
        println("A glass of milk")
    }
    else{
        println("Cocacola")
    }
}
fun names(name:Array<String>):Int{
   var count=0
    for (name in name) {
        if (name.length > 4) {
            count += 1
        }
        }
    return count
}
fun multiply(num1:Int,num2:Int):Int{
    return num1*num2
}
fun divide(num1:Int,num2:Int):Int{
    return num1/num2
}
fun modulus(num1:Int,num2:Int):Int{
    return num1%num2
}
fun comparison(num1:Int,num2:Int){
    num1>num2

}