package us.hubbardfamily.kotbot

class PlayerData(val program: PlayerProgram, val field: PlayingField) {
    val bots = ArrayList<Bot>()
    var energy = 0
    var mass = 0

}

val EMPTY_BOT = Bot("NONE")

abstract class PlayingField(val width: Int, val height: Int) {
    val players = ArrayList<PlayerData>()
    val fieldOfPlay = Array(width) { Array(height) { EMPTY_BOT } }


}


abstract class PlayerProgram(val name: String) {
    fun Build(bot: Bot) {

    }

    abstract fun tick()
}

open class Bot(val name: String) {
    private var energy = 0;
    private var mass = 0;

}

data class Location(val x: Int, val y: Int)

data class Direction(val angle: Float)

interface Hauler {
    var mass: Int
    fun scoop() {

    }
}

interface Cannon {
    fun fire(loc: Location) {

    }
}

interface Laser {
    fun shoot(dir: Direction) {

    }
}

interface Wheels {
    fun driveTowards(loc: Location) {

    }
}

class SampleBot(name: String) : Bot(name), Wheels {

}
