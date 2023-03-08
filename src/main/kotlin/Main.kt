fun main() {
    var fruits = type("mango","orange","apple")
    var num = numbers(34,67,89,36,98)
    record()
    details()
    var human = Human("alice","female",4,59,"dark")
    human.rest()
    human.identity()
    var book = Book("Trevor","Born a crime",98,2004)
    println(book.title)

}
fun type(fruit1:String,fruit2:String,fruit3:String){
    var fruits = arrayOf(fruit1,fruit2,fruit3)
    println(fruits.contentToString())
    //getting the index of a string
    fruits.indexOf("mango")
    println(fruits.indexOf("mango"))
    //counting number of elements
    println(fruits.count())
    //sorting arrays
    println(fruits.sortedArray().contentToString())
    println(fruits[2])

}
fun numbers(num1:Int,num2:Int,num3:Int,num4:Int,num5:Int){
    var numb = arrayOf(num1,num2,num3,num4,num5)
    println(numb.contentToString())
    //getting the largest number
    println(numb.max())
    //getting the smallest number
    println(numb.min())
    //getting the sum
    println(numb.sum())
    println(numb.count())
}
fun record(){
    var num = arrayOf(13,25,97,67,90)
    println(num.contentToString())
}
fun details(){
    var names = arrayOf("anitab","adalab","hopperlab","rwanda","kenya","tanzania")
    println(names.sortedArray().contentToString())
    println(names.sort())
}
class Human (var name:String,var gender:String,var height:Int,var weight:Int,var color:String ){
    fun rest(){
        println("sleep eight hours")
    }
    fun identity(){
        println("my name is alice")
    }

}
data class Book (var author:String,var title:String,var pages:Int,var yearpublished:Int){
}