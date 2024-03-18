package org.jeansama.net.toadmc.commands;

import java.io.IOException;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.jeansama.net.toadmc.ToadMC;
import org.jeansama.net.toadmc.utils.commands.BaseCommand;
import org.jeansama.net.toadmc.utils.commands.Command;
import org.jeansama.net.toadmc.utils.commands.CommandArgs;

public class CommandTepearse extends BaseCommand {

    @Command(name = "toadmc.tepearse", aliases = { "tpt", "teletransportation", "teletransportacion", "soymarica" })
    @Override
    public void onCommand(CommandArgs command) throws IOException {

        // Obtenemos a nuestro usuario
        Player culeMaricon = command.getPlayer();
        Location dondeEstaElMarica = culeMaricon.getLocation();// Aquí obtenemos la ubicación del jugador
        try {
            Player otroMarica = ToadMC.instance.getServer().getPlayer(command.getArgs(0));
            culeMaricon.teleport(otroMarica);
        } catch (Exception e) {
            culeMaricon.sendMessage("Ey care monda,escribe ese maldito comando bien");
        }
    }

}
