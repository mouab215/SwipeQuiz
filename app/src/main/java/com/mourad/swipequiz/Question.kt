package com.mourad.swipequiz

data class Question(
    var statement: String,
    var answer: Boolean
) {
    companion object {
        val STATEMENTS = arrayOf(
            "A \'val\' and \'var\' are the same.",
            "Mobile Application Development grants 12 ECTS.",
            "A Unit in Kotlin corresponds to a void in Java.",
            "In Kotlin \'when\' replaces the \'switch\' operator in Java."
        )

        val ANSWERS = arrayOf(
            false,
            false,
            true,
            true
        )
    }
}