package example

object GameSession{
    init {
        println("сессия создана")
    }
    var isActive: Boolean = false
    fun start(){
        isActive = true
        println("игра началась")
    }
    fun end(){
        isActive = false
        println("игра закончилась")
    }
}

object Logger{
    var count = 0

    fun log(message: String){
        count++
        println("[$count] $message")
    }
}

object AppSettings {
    val version = "1.0.0"
    var isDarkMode = true

    fun toggleTheme(){
        isDarkMode = !isDarkMode
    }
    fun checkTheme(){
        if (AppSettings.isDarkMode){
            println("тёмная тема включена")
        }
    }
}

object Colors {
    const val RED = "#FF0000"
    const val GREEN = "#00FF00"
    const val BLUE = "0000FF"
}

class MyCar(val model: String) {
    fun drive() = println("$model едет")
}

object TrafficController {
    var carCount = 0
    fun carPassed(){
        carCount++
    }
}

fun main(){
    println("программа запущена")
    println("проверяем состояние, но не трогаем GameSession")
    println("запускаем катку")
    GameSession.start()
    println("проверка состоянии")
    println("активна ли сессия: ${GameSession.isActive}")

    Logger.log("первое сообщение")
    Logger.log("второе сообщение")
    // тот же самый object
    val logger1 = Logger
    val logger2 = Logger
    println(logger1 === logger2) // true

    val handler = object {
        val name = "обработчик"
        fun handle(){
            println("обрабатываю....")
        }
    }
    println(handler.name)
    handler.handle()

    MyCar("Formula")
    MyCar("BMW") // other object
    TrafficController.carPassed()
}