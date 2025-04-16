package racingcar
import camp.nextstep.edu.missionutils.Randoms
import camp.nextstep.edu.missionutils.Console

fun main() {
    // TODO: Implement the program
    val names = input_names()
    //println("Car names are are $names")

    println("How many rounds will be played?")
    val rounds = Console.readLine()
    //println("number of rounds = $rounds")

    racing_func(names,rounds)

}

fun racing_func(names:List<String>,rounds:String){
    println("$names, $rounds")
    val size = names.size
    val carPos = mutableMapOf<String, String>()
    for(i in 0 until size){
        carPos[names[i]] = ""
    }


     for (i in 0 until rounds.toInt()) {
         for(j in 0 until size){
            val no = Randoms.pickNumberInRange(0, 9)
             if(no>=4){
                carPos[j]+="-"
                 println("$no")
             }
         }
     }
    println("new car dict = $carPos")


}

fun input_names() : List<String>
{
    println("Enter the names of the cars (comma-separated):")
    val names = readLine()
    //println("names are $names")
    // try{
    //     if (names.isNullOrEmpty()) {
    //     throw IllegalArgumentException("List cannot be null")
    // }
    // else {
    return names!!.split(",")
    // }}
    // catch (e: IllegalArgumentException) {
    //     println("Error: ${e.message}")
    //     input_names()
    // }
}
