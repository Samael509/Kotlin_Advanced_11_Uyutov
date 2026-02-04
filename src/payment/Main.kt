package payment

fun main() {

    println("\n=== работа с enum ===")
    val cardType = CardType.VISA
    println("тип карты: $cardType")
    println("порядковый номер: ${cardType.ordinal}")
    println("все типы карт: ${CardType.values().joinToString()}")

    val processor = PaymentProcessor()
    val payments = listOf(
        Payment("4_111_111_111_111_111", 1000, CardType.VISA),
        Payment("5_111_111_111_111_111", 1000, CardType.MASTERCARD),
        Payment("2_222_222_222_222_222", 2000, CardType.MIR),
        Payment("1234567812345678", 500, CardType.UNKNOWN),
        Payment("123", 3000, CardType.VISA) //  error
    )
    println("=== обработка ===")
    payments.forEach {payment ->
        println("\nплатёж ${payment.type}: ${payment.card.take(4)}..., ${payment.sum} руб")
        val result = processor.pay(payment)
        processor.show(result)
    }

    val payment1 = Payment("411111111111111", 1000, CardType.VISA)
    val payment2 = payment1.copy(type = CardType.MASTERCARD, sum = 2000)

    println("\n=== сравнение data class ===")
    println("платёж 1: $payment1")
    println("платёж 2: $payment2")
    println("одинаковые? ${payment1 == payment2}")
}