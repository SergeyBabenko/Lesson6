enum class Sex {
    MALE, FEMALE, UNKNOWN
}

class Pet {
    var nickname: String = ""
    var age: Int = 0
    var sex: Sex? = Sex.UNKNOWN
    override fun toString(): String = "Pet(nickname=$nickname, age=$age, sex=$sex)"
}

fun main() {
    val dog = Pet().apply {
        this.nickname = "Jessie"
        this.age = 10
        this.sex = Sex.FEMALE
    }
    val cat = Pet().also {
        it.nickname = "Salem"
        it.age = 13
        it.sex = Sex.MALE
    }
    val snail = Pet().let {
        it.nickname = "Spotty"
        it.age = 1
        it.sex = Sex.UNKNOWN
        it
    }
    val anotherCat = with(Pet(), {
        this.nickname = "Murka"
        this.age = 16
        this.sex = Sex.FEMALE
        this
    })
    println(dog)
    println(cat)
    println(snail)
    println(anotherCat)
}

