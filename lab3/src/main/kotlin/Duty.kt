class Duty (
    job:String,
    workExperience:String,
    salary:Int
    ) {
    var job = job
        private set
    var workExperience = workExperience
        private set
    var salary = salary
        private set

    override fun toString() = "\n$job, опыт работы (лет): $workExperience, зарплата: $salary руб."
}