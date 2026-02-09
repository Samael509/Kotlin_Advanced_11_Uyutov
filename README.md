## Абстрактные классы
Это базовый класс, который нельзя создать напрямую

Содержит:
* Поля
* Конкретные методы
* Абстрактные методы
* Абстрактные свойства
* Конструкторы
## Пример
Создание абстрактного класса фигуры
```bash
abstract class Figure{
    abstract  fun perimetr() : Float
    abstract  fun area() : Float
}
```

Абстрактный класс человека
```kotlin
abstract class Human(val name: String){
abstract var age: Int
abstract fun hello()
}
```
# Galaxy Outpost Manager

Учебный проект на Kotlin, демонстрирующий основы объектно-ориентированного программирования и архитектурные приёмы языка.

## Sealed-классы

Sealed-классы используются для представления ограниченного набора состояний или результатов, которые известны на этапе компиляции. Они позволяют:

- Гарантировать обработку всех возможных вариантов;
- Безопасно использовать конструкцию `when` без `else`;
- Удобно описывать состояния, события и результаты действий.

Пример: результат работы модуля

```kotlin
sealed class ModuleResult {
    data class Success(val message: String) : ModuleResult()
    data class ResourceProduced(val resourceName: String, val amount: Int) : ModuleResult()
    data class NotEnoughResources(
        val resourceName: String, val required: Int, val available: Int
    ) : ModuleResult()
    data class Error(val reason: String) : ModuleResult()
}
```
## Object в kotlin
`object` - это конструкция kotlin, которая создаёт единственный экземпляр класса (singleton). Особености:
- Создаётся при первом обращении;
- Существует в одном экземпляре;
- Не имеет конструктора

Пример:
```kotlin
object Logger {
    private var counter = 0
    fun log(message: String) {
        counter++
        println("[$counter] $message")
    }
}
```
Использование:
```kotlin
Logger.log("инициализация системы")
Logger.log("модуль запущен")
```
Удобно использовать для:
- логгеров;
- конфигураций;
- состояний без данных в sealed-классах;
- утилитарных классов
## Автор
[Uyutov]
## Лицензия