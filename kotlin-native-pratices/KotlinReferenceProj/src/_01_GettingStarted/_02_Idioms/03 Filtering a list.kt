package _01_GettingStarted._02_Idioms

fun main(){

    val list = listOf(5, -2, 0,2,4,8,9,-23)

    val positives = list.filter { x -> x > 0 }
    print(positives)

    //  Or alternatively, even shorter:
    val negatives = list.filter { it < 0 }

    print(negatives)


}