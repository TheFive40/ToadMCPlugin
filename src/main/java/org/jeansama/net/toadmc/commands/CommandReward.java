package org.jeansama.net.toadmc.commands;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jeansama.net.toadmc.utils.CC;
import org.jeansama.net.toadmc.utils.commands.BaseCommand;
import org.jeansama.net.toadmc.utils.commands.Command;
import org.jeansama.net.toadmc.utils.commands.CommandArgs;

import java.io.IOException;

public class CommandReward extends BaseCommand {
    @Command(name = "toadmc.youtube", aliases = {"youtube", "yt"})
    @Override
    public void onCommand(CommandArgs command) throws IOException {
        command.getPlayer().getInventory()
                .addItem(new ItemStack(Material.DIAMOND,10));
        command.getPlayer().sendMessage(CC.translate("&c¡Haz recibido 10 diamantes!"));
        Player player = command.getPlayer();
        command.getPlayer().playSound(player.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_BLAST, 10F,10F);

    }
}
