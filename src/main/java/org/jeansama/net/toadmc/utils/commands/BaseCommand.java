package org.jeansama.net.toadmc.utils.commands;


import org.jeansama.net.toadmc.ToadMC;

import java.io.IOException;

public abstract class BaseCommand {

    public ToadMC main = ToadMC.instance;

    public BaseCommand() {
        main.getCommandFramework().registerCommands(this);
    }

    public abstract void onCommand(CommandArgs command) throws IOException;

}
