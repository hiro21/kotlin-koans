package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

fun todoTask1(collection: Collection<Int>): String {
    return JavaCode1().task1(collection)
}


fun task1(collection: Collection<Int>): String {
    return todoTask1(collection)
}