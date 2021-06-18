
fun main(args:Array<String>){
    var str:String= ("Good Food")
 
 if (str.equals("")){
     print("Good Food")
 }
 
 else{  
 
 print("Reverse A String\n\nEnter a string: $str\nAfter reverse: ")
 
 for (i in (str. length-1).downTo(0)){
     print(str[i])
 } 
 }  
}