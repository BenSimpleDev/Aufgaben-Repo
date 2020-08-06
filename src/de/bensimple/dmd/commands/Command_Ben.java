package de.bensimple.dmd.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_Ben implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs, Command command, String s, String[] args) {
        if(cs instanceof Player) {
            Player p = ((Player) cs).getPlayer();

            p.sendMessage("§2Hallo, ich bin ein Command");
            p.setFoodLevel(20);
        }

        return true;
    }
}
