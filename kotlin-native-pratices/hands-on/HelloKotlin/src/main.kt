

fun main(){
    try {
        print("Hello World!")

        var b:String?=null

        val l = b?.length

        print("Value $l")
    }catch (e:Exception){
        e.printStackTrace()
    }


}