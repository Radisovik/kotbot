

class PlayerData() {

}

public class Bot(val name :String) {

}

data class Location(val x:Int, val y:Int)

interface Wheels {
    fun driveTowards(loc: Location) {

    }
}

class SampleBot: Bot(), Wheels {

}
