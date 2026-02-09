package gameCharacter

class GameCharacter(
    val name: String,
    var state: CharacterState = CharacterState.Idle
) {
    fun changeState(newState: CharacterState) {
        state = newState
        println("$name изменил состояние на $newState")
    }
}