package de.bensimple.dmd.main;

import de.bensimple.dmd.commands.Command_Ben;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Bens Plugin wurde erfolgreich geladen !");
        getCommand("ben").setExecutor(new Command_Ben());

    }


    @Override
    public void onDisable() {

    }
}
