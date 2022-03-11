fun main() {
    college("CodeHive")
    divide(24,45)
    fact("Zuennah",21)
    python("akirachix")


}
fun college(name:String){
        var text1= name[5]
        var text2= name[6]
        var text3= name[7]
        var text4= name[8]
        println(text1.toString()+text2+text3+ text4)


    }
fun divide(x:Int,w:Int):Int{
        var modulous=x%w
        return modulous

    }
fun fact(a:String,b:Int):String{
        var come="hi,my name is $a and i am $b years old"
        return come
    }
fun python(good:String):Int{
        return good.length
    }
