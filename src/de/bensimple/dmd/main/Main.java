package de.bensimple.dmd.main;

import de.bensimple.dmd.commands.Command_Ben;
import de.bensimple.dmd.listeners.Listener_Leave;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Bens Plugin wurde erfolgreich geladen !");
        getCommand("ben").setExecutor(new Command_Ben());
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new Listener_Leave(), this);


    }


    @Override
    public void onDisable() {

    }
}
