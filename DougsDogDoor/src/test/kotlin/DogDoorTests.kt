import org.example.DogDoor
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DogDoorTests {
    @Test
    fun `should open the dog door`(){
        val dogDoor = DogDoor()
        dogDoor.open()
        val open = dogDoor.isOpen()

        assertTrue{ open }
    }

}