package payment

class PaymentProcessor {
    private val validator = PaymentValidator()

    fun pay(payment: Payment): PaymentResult {
        if (!validator.check(payment)) {
            return PaymentResult.Error("ошибка валидации")
        }

        return when (payment.type) {
            CardType.VISA -> PaymentResult.Success("VISA-${System.currentTimeMillis()}")
            CardType.MASTERCARD -> PaymentResult.Proccessing
            CardType.MIR -> PaymentResult.Success("MIR-${System.currentTimeMillis()}")
            CardType.UNKNOWN -> PaymentResult.Error("unknown card")
        }
    }

    fun show(result: PaymentResult) {
        when (result) {
            is PaymentResult.Success -> println("успех: ${result.id}")
            is PaymentResult.Error -> println("ошибка: ${result.reason}")
            PaymentResult.Proccessing -> println("в обработке....")
        }
    }
}