package org.jeansama.net.toadmc;

import org.bukkit.plugin.java.JavaPlugin;
import org.jeansama.net.toadmc.utils.ClassesRegistration;
import org.jeansama.net.toadmc.utils.commands.CommandFramework;

public final class ToadMC extends JavaPlugin {
    public static ToadMC instance;
    private final CommandFramework commandFramework = new CommandFramework(this);
    private final ClassesRegistration classesRegistration = new ClassesRegistration();

    @Override
    public void onEnable() {
        instance = this;
        classesRegistration.loadCommands("org.jeansama.net.toadmc.commands");
        classesRegistration.loadCommands("org.jeansama.net.toadmc.listeners");
        System.out.println("Plugin successfully enabled");
        System.out.println("Version: 1.0.0 ");
        System.out.println("By DelawareX");
        System.out.println("By ToadMC");
        System.out.println("Bebecita ua lo de nosotros es un secreto");
    }

    @Override
    public void onDisable() {


    }

    public CommandFramework getCommandFramework() {
        return commandFramework;
    }

    public ClassesRegistration getClassesRegistration() {
        return classesRegistration;
    }
}
