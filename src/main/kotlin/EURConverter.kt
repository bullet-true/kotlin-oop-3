class EURConverter : CurrencyConverter {
    override val currencyName: String = "EUR"
    override val currencyCode: String = "978"
    override fun convertRub(amount: Double): Double = amount / 88.5
}

