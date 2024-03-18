package org.jeansama.net.toadmc.commands;

import java.io.IOException;

import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jeansama.net.toadmc.ToadMC;
import org.jeansama.net.toadmc.utils.CC;
import org.jeansama.net.toadmc.utils.commands.BaseCommand;
import org.jeansama.net.toadmc.utils.commands.Command;
import org.jeansama.net.toadmc.utils.commands.CommandArgs;

public class CommandTroll extends BaseCommand {

    @Command(name = "toadmc.troll", aliases = { "troll", "memeoentucara" })
    @Override
    public void onCommand(CommandArgs command) throws IOException {
        try {
            int cantidad = Integer.parseInt(command.getArgs(0));
            Player victima = ToadMC.instance.getServer().getPlayer(command.getArgs(1));
            World mundo = victima.getWorld();
            for (int i = 0; i < cantidad; i++) {
                mundo.spawnEntity(victima.getLocation(), (EntityType.CREEPER));
            }
            command.getPlayer().sendMessage(CC.translate("&2 Ya le envie los creepers al maricon ese"));
        } catch (Exception e) {
            command.getPlayer().sendMessage("Ey asegurate de escribir el maldito comando bien cole");
        }
    }
}
