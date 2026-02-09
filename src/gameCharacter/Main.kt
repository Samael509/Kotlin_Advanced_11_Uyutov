package gameCharacter

fun processState(state: CharacterState) {
    when (state) {
        is CharacterState.Idle -> println("отошёл")
        is CharacterState.Running -> println("бежит")
        is CharacterState.Attack -> println("атакует с уроном ${state.damage}")
        is CharacterState.Death -> println("умер: ${state.reason}")
    }
}

fun main() {
    val character = GameCharacter(name = "Lxrd")
    processState(character.state)

    character.changeState(CharacterState.Running)
    processState(character.state)

    character.changeState(CharacterState.Attack(damage = 30))
    processState(character.state)

    character.changeState(CharacterState.Death(reason = "забили черти"))
    processState(character.state)
}