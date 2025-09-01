class CNYConverter : CurrencyConverter {
    override val currencyName: String = "YUAN"
    override val currencyCode: String = "156"
    override fun convertRub(amount: Double): Double = amount / 11.8
}