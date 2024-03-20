import org.example.DogDoor
import org.example.Remote

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

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

    @Test
    fun `should open the door when the button is pressed`(){
        val door = DogDoor()
        val remote = Remote(door)

        remote.pressButton()

        val open = door.isOpen()

        assertTrue { open }
    }

}