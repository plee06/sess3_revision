


// Store in data structure then look up later if it already exists


fun memo(n: Int, f: (Int) -> Int): Int{
    val map = HashMap<Int, Int>()
    var result = map.getOrDefault(n, -1) // get the one in the map or return a -1

    if(result == -1){
        result = f(n)
        map[n] = result
    }

    return result
}

fun fact(n: Int): Int {
    if (n == 0) return 1

    return n * fact(n - 1)
}

fun main(args: Array<String>) {


    println(memo(12, ::fact))

}