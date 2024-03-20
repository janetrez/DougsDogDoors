import org.example.DogDoor
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DogDoorTests {
    @Test
    fun `should open the dog door`(){
        val dogDoor = DogDoor()

        dogDoor.open()
        val open = dogDoor.isOpen()

        assertTrue{ open }
    }

    @Test
    fun `should close the dog door`(){
        val dogDoor = DogDoor()
        dogDoor.open()

        dogDoor.close()
        val open = dogDoor.isOpen()

        assertFalse{ open }
    }


}