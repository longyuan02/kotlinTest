import charpter1.Car
import charpter1.now
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PackageTest {
    @Test
    fun testDefualtPackage(){
        now()
        val car=Car()
        car.drive(11)
    }

}