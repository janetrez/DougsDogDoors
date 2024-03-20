import org.example.DogDoor
import org.example.Remote

import kotlin.test.Test
import kotlin.test.assertFalse

class RemoteTests {

    @Test
    fun `should close the door when the button is pressed`(){
        val door = DogDoor()
        val remote = Remote(door)
        door.open()

        remote.pressButton()

        val open = door.isOpen()

        assertFalse { open }
    }

}