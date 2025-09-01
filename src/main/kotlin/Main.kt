fun main() {
    // Получение нескольких конверторов для разных валют (п.4 домашнего задания):
    val usdConverter = Converters.get("840")
    val eurConverter = Converters.get("978")
    val cnyConverter = Converters.get("156")

    val amount = 1000.0
    val resultUsd = usdConverter.convertRub(amount)
    val resultEur = eurConverter.convertRub(amount)
    val resultCny = cnyConverter.convertRub(amount)
    println(
        "$amount рублей = $resultUsd %${usdConverter.currencyCode}% ${usdConverter.currencyName}\n" +
                "$amount рублей = $resultEur %${eurConverter.currencyCode}% ${eurConverter.currencyName}\n" +
                "$amount рублей = $resultCny %${cnyConverter.currencyCode}% ${cnyConverter.currencyName}"
    )

    // Если введен код неизвестной валюты (п.5 домашнего задания):
    val unknownConverter = Converters.get("777")
    val resultUnknownCurrency = unknownConverter.convertRub(amount)
    println("$amount рублей = $resultUnknownCurrency %${unknownConverter.currencyCode}% ${unknownConverter.currencyName}")

    // Считывание пользовательского ввода для конвертации конкретной валюты:
    Converters.getUserCurrency()
}