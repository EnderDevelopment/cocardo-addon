package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShareCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length > 1) {
                String targetPlayer = args[0];
                String cocardo = args[1];
                // Logic to share the cocardo
                player.sendMessage("Sharing cocardo " + cocardo + " with " + targetPlayer);
                return true;
            }
        }
        return false;
    }
}