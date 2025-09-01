object Converters {
    private val converters = listOf(USDConverter(), EURConverter(), CNYConverter())

    fun get(currencyCode: String): CurrencyConverter {
        return converters.find { it.currencyCode == currencyCode } ?: let {

            println("Введенная вами валюта не найдена. Введите курс для данной валюты $currencyCode:")
            val currencyRate = readln().toDoubleOrNull() ?: let {
                println("Введен неверный курс. Установлен курс по умолчанию равный 1.0")
                1.0
            }

            println("Введите название данной валюты $currencyCode:")
            val userCurrencyName = readln()

            object : CurrencyConverter {
                override val currencyName: String = userCurrencyName
                override val currencyCode: String = currencyCode
                override fun convertRub(amount: Double): Double = amount / currencyRate
            }
        }
    }

    fun getUserCurrency() {
        println("Введите количество RUB, которые вы хотите конвертировать:")
        val amount = readln().toDoubleOrNull() ?: run {
            println("Неверный формат ввода")
            return
        }

        println("Введите код валюты (840 для доллара, 978 для евро, 156 для юаня):")
        val currencyCode = readln()

        val converter = get(currencyCode)
        val result = converter.convertRub(amount)

        println("$amount рублей = $result %${converter.currencyCode}% ${converter.currencyName}")
    }
}
