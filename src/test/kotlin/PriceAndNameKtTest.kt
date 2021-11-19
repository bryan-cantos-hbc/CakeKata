import junit.framework.Assert.assertEquals
import org.junit.Test


internal class PriceAndNameKtTest {
    @Test
    fun testGetCupcakeName() {
        val cupcake = CupCake()
        val result = getName(cupcake)
        val expected = "cupcake"
        assertEquals(expected, result)
    }

    @Test
    fun testGetCakeName() {
        val cake = Cake()
        val result = getName(cake)
        val expected = "cake"
        assertEquals(expected, result)
    }

    @Test
    fun testChocolateCupcake() {
        val expected = "cupcake with chocolate"
        val result = getName(Chocolate(CupCake()))
        assertEquals(expected, result)
    }

    @Test
    fun testChocolateCake() {
        val expected = "cupcake with chocolate"
        val cupcake = Chocolate(CupCake())
        val result = getName(cupcake)

        assertEquals(expected, result)
    }

    @Test
    fun testCakeWithChocolateAndNuts() {
        val expected = "cake with chocolate and nuts"
        val result = getName(Nuts(Chocolate(Cake())))
        assertEquals(expected, result)
    }

    @Test
    fun testCakeWithNutsAndChocolate() {
        val expected = "cake with nuts and chocolate"
        val result = getName(Chocolate(Nuts(Cake())))
        assertEquals(expected, result)
    }

    @Test
    fun testCupcakePrice() {
        val expected = 1.0
        val cupcake = CupCake()
        val result = getPrice(cupcake)
        assertEquals(expected, result)
    }

    @Test
    fun testCakePrice() {
        val expected = 2.0
        val cake = Cake()
        val result = getPrice(cake)
        assertEquals(expected, result)
    }

    @Test
    fun testChocolateCupcakePrice() {
        val expected = 1.1
        val result = getPrice(Chocolate(CupCake()))
        assertEquals(expected, result)
    }

    @Test
    fun testChocolateCakePrice() {
        val expected = 2.1
        val result = getPrice(Chocolate(Cake()))
        assertEquals(expected, result)
    }

    @Test
    fun testNutsCakePrice() {
        val expected = 2.2
        val result = getPrice(Nuts(Cake()))
        assertEquals(expected, result)
    }
}