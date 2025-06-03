import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.OnlineStatus
import net.dv8tion.jda.api.entities.Activity

object Bot {
    @JvmStatic
    fun main(args: Array<String>) {
        val jda: JDABuilder = JDABuilder.createLight(args[0])
        jda.setStatus(OnlineStatus.IDLE)
        jda.setActivity(Activity.customStatus("( ͡° ͜ʖ ͡°)"))
        jda.build().awaitReady()
    }
}
