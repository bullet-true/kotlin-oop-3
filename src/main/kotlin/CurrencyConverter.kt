interface CurrencyConverter {
    val currencyName: String
    val currencyCode: String
    fun convertRub(amount: Double): Double
}