class Nuts(private val pastry: Pastry) : PastryDecorator(pastry) {

    override fun getName(): String {
        return if (pastry is PastryDecorator)
            super.getName() + " and" + getNameWithNuts()
        else
            super.getName() + " with" + getNameWithNuts()
    }

    override fun getPrice(): Double {
        return super.getPrice() + 0.2
    }

    fun getNameWithNuts(): String {
        return " nuts"
    }
}