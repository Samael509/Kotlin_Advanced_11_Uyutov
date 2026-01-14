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
```
abstract class Human(val name: String){
abstract var age: Int
abstract fun hello()
}
```
## Автор
[Uyutov]
## Лицензия