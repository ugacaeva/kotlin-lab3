class Passport (
    val series: String,
    val number: String
    ) {
    init {
        if (!series.matches("\\d{4}".toRegex())) {
            throw Exception("Серия паспорта не валидна!")
        }
    }

    init {
        if (!number.matches("\\d{6}".toRegex())) {
            throw Exception("Номер паспорта не валиден!")
        }
    }

    override fun toString() = "$series $number"
}