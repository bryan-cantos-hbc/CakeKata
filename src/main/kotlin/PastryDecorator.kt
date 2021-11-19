abstract class PastryDecorator(private val pastry: Pastry) : Pastry {

    override fun getName(): String {
        return pastry.getName()
    }

    override fun getPrice(): Double{
        return pastry.getPrice()
    }
}