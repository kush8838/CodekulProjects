import java.util.function.BiConsumer

/**
 * Created by SHREE on 22/03/2018.
 */
fun list() {
    val lst= arrayListOf<String>()
    lst.add("Kotlin")
    lst.add("java")
    lst.add("C++")
    lst.add("C")
    lst.add("Javascript")

    lst.forEach {
        println("Element is $it")
    }

    for (i in lst){
        println("Element is $i")
    }

    for(i in 1..200){
        println("Element is $i")
    }
}

fun map(){
    val map= mapOf<Int,String>(
            1 to "Kotlin",
            2 to "Java",
            3 to "C",
            4 to "C++"
    )
    map.forEach { (t, u) -> println("Key is $t And Value is $u") }

    val mp= hashMapOf<Int,String>()
    mp[1]="JavaScript"
    mp[2]="Html"
    mp[3]="CSS"
    mp[4]="Json"
    mp.forEach { (key, value) -> println("Key is $key value is $value") }
}

fun set() {
    val st= hashSetOf<String>()
    st.add("Kotlin")
    st.add("Java")
    st.add("Php")

    st.forEach { println("Elements $it") }
}

fun main(args: Array<String>) {
    //list()
    //map()
    set()
}