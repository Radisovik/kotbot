package us.hubbardfamily.kotbot.sample

import us.hubbardfamily.kotbot.*

class MyProgram : PlayerProgram("ehubbard") {
    override fun tick() {
        val bot = MyBot("Joe")
        this.Build(bot)
        bot.driveTowards(Location(10, 10))

    }
}

class MyBot(name: String) : Bot(name), Wheels {

}

