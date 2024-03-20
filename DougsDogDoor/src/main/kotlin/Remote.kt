package org.example

class Remote(
    private var door: DogDoor
) {

    fun pressButton(){
        if (door.isOpen())
            door.close()
        else
            door.open()
    }
}
