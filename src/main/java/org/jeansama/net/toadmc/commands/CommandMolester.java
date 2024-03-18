package org.jeansama.net.toadmc.commands;

import java.io.IOException;

import org.bukkit.entity.Player;
import org.jeansama.net.toadmc.ToadMC;
import org.jeansama.net.toadmc.utils.commands.BaseCommand;
import org.jeansama.net.toadmc.utils.commands.Command;
import org.jeansama.net.toadmc.utils.commands.CommandArgs;

public class CommandMolester extends BaseCommand {

    @Command(name = "toadmc.molester", aliases = { "molestar", "molester", "molestarniños", "molesterkids" })
    @Override
    public void onCommand(CommandArgs command) throws IOException {
        try {
            Player victima = ToadMC.instance.getServer().getPlayer(command.getArgs(0));
            String message = null;
            for (int i = 1; i < command.getArgs().length; i++) {
                message += command.getArgs(i);
            }
            victima.chat(message);
        } catch (Exception e) {
            command.getPlayer().sendMessage("COPIA LOS MALPARIDOS COMANDOS BIEN EY");
        }
    }

}
