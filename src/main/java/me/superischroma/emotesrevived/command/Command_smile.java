package me.superischroma.emotesrevived.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_smile extends EmotesCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String c, String[] args) 
    {
        if (isConsole(sender))
        {
            sender.sendMessage(ONLY_IN_GAME);
            return true;
        }
        Player playerSender = (Player) sender;
        if (args.length > 1)
        {
            return false;
        }
        if (args.length == 1)
        {
            Player player = Bukkit.getPlayer(args[0]);
            if (player == null)
            {
                sender.sendMessage(PLAYER_NOT_FOUND);
                return true;
            }
            broadcast(ChatColor.GREEN + playerSender.getDisplayName() + ChatColor.GREEN + " smiles at " + player.getDisplayName() + ChatColor.GREEN + "!");
            return true;
        }
        broadcast(ChatColor.GREEN + playerSender.getDisplayName() + ChatColor.GREEN + " smiles!");
        return true;
    }
}
