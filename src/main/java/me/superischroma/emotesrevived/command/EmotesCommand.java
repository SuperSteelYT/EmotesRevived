package me.superischroma.emotesrevived.command;

import me.superischroma.emotesrevived.EmotesRevived;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class EmotesCommand 
{
    public final String ONLY_IN_GAME = "Only in-game senders are allowed to execute this command!";
    public final String PLAYER_NOT_FOUND = EmotesRevived.IN_GAME_PREFIX + ChatColor.RED + "Player not found!";
    
    public boolean isConsole(CommandSender sender)
    {
        return sender instanceof ConsoleCommandSender;
    }
    
    public void broadcast(String message)
    {
        Bukkit.broadcastMessage(message);
    }
}
