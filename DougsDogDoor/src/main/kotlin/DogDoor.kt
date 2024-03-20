package org.example

class DogDoor {

    private var open : Boolean = false

    fun open() {
        println("The dog door opens")
        open = true
    }

    fun isOpen() = open

}
