package me.superischroma.emotesrevived.command;

import me.superischroma.emotesrevived.EmotesRevived;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class Command_emotes extends EmotesCommand implements CommandExecutor
{
    private final Plugin plugin = EmotesRevived.getPlugin(EmotesRevived.class);

    // Server Name
    String SERVER_NAME = plugin.getConfig().getString("server_name");
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String c, String[] args) 
    {
        if (args.length > 1)
        {
            return false;
        }
        if (args.length == 1)
        {
            if (args[0].equalsIgnoreCase("list"))
            {
                sender.sendMessage(EmotesRevived.IN_GAME_PREFIX + ChatColor.DARK_GREEN + " Command list: ");
                sender.sendMessage(ChatColor.GREEN + "/backflip - Do a backflip!");
                sender.sendMessage(ChatColor.GREEN + "/emotes - Plugin information.");
                sender.sendMessage(ChatColor.GREEN + "/greet - Greet someone!");
                sender.sendMessage(ChatColor.GREEN + "/grin - Smirky smirk...");
                sender.sendMessage(ChatColor.GREEN + "/highfive - High-five someone!");
                sender.sendMessage(ChatColor.GREEN + "/hug - Hug someone!");
                sender.sendMessage(ChatColor.GREEN + "/kiss - Kiss someone!");
                sender.sendMessage(ChatColor.GREEN + "/laugh - The sin of laugh...");
                sender.sendMessage(ChatColor.GREEN + "/raspberry - Blow a raspberry!");
                sender.sendMessage(ChatColor.GREEN + "/smile - Turn that frown upside down!");
                return true;
            }
            return false;
        }
        sender.sendMessage(EmotesRevived.IN_GAME_PREFIX + ChatColor.GREEN + "EmotesRevived " + "v" + EmotesRevived.PLUGIN_VERSION + " running on " + SERVER_NAME);
        sender.sendMessage(ChatColor.GREEN + "Plugin created by supernt.");
        sender.sendMessage(ChatColor.GREEN + "For a list of all commands, do " + "\"" + ChatColor.AQUA + "/emotes list" + ChatColor.GREEN + "\"");
        return true;
    }
}
