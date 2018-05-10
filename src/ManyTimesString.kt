/**
 * Created by plee06 on 07/05/2018.
 */



fun manyTimesString(s: String, i: Int): String {
    var res = StringBuilder()
    (1..i).forEach { res.append(s) }

    return res.toString()
}


fun main(args: Array<String>) {
    var resultingString: String

    resultingString = manyTimesString("hello", 3) // should return hellohellohello


    println(resultingString)
}