@JvmInline
value class Fio(val fio:String) {
    override fun toString() = fio
}

class Person (
    val fio:Fio,
    val age:Int,
    val sex:String
    ) {
    var passport:Passport? = null
    var duties:MutableList<Duty>? = mutableListOf()
    constructor(fio:Fio, age:Int, sex: String, passport:Passport) : this(fio,age,sex) {
        this.passport = passport
    }

    constructor(fio:Fio, age:Int, sex:String, passport:Passport, duties:MutableList<Duty>) : this(fio,age,sex,passport) {
        this.duties = duties
    }

    fun addDuty(duty: Duty) {
        duties?.add(duty)
    }

    fun removeDuty(job: String) {
        duties?.removeAll {
            it.job == job
        }
    }

    init {
        if (age<18) duties = null
    }

    override fun toString() = "ФИО: $fio, возраст: $age, пол: $sex, \nпаспортные данные(серия и номер): $passport \nСписок должностей:$duties\n"
}
