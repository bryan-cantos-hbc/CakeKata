class Chocolate(private val pastry: Pastry) : PastryDecorator(pastry) {

    override fun getName(): String {
        return if(pastry is PastryDecorator)
            super.getName() + " and" +  getNameWithChoco()
        else
            super.getName() + " with" +  getNameWithChoco()
    }

    override fun getPrice(): Double {
        return super.getPrice() + 0.1
    }

    fun getNameWithChoco(): String{
        return " chocolate"
    }
}