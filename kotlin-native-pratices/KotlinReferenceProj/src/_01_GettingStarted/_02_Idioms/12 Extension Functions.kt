package _01_GettingStarted._02_Idioms

fun String.toTitleCase(): String {
    val words = this.split(" ").toMutableList()


    var output = ""

    for (word in words) {
        output += word.capitalize() + " "
    }

    output = output.trim()
    return output
}

fun String.toSentenceCase(): String {

    val words = this.split(" ").toMutableList()

    var output = ""

    for (index in 0 until words.size) {

        //if as statement

//        if(index==0){
//            output += words[0].capitalize() +" "
//        }else{
//            output += words[index] + " "
//        }


// if as expression

        output += if (index == 0) {
            words[0].capitalize() + " "
        } else {
            words[index] + " "
        }

    }

    output = output.trim()
    return output

}

fun main() {
    var sentence = "the quick brown fox jumps over the lazy dog."

    println(sentence.toTitleCase())
    println(sentence.toSentenceCase())

}