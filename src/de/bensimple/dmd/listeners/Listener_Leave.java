package de.bensimple.dmd.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Listener_Leave implements Listener {

    String lmsg = " hat den Server erfolgriech verlassen.";

    @EventHandler
    public void pleave(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        Bukkit.broadcastMessage(p.getDisplayName() + lmsg);


    }

}
