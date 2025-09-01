class USDConverter : CurrencyConverter {
    override val currencyName: String = "USD"
    override val currencyCode: String = "840"
    override fun convertRub(amount: Double): Double = amount / 80.5
}
