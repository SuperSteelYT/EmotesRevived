package me.superischroma.emotesrevived;

import me.superischroma.emotesrevived.command.*;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class EmotesRevived extends JavaPlugin
{
    public static final String CONSOLE_PREFIX = "[EmotesRevived]";
    public static final String IN_GAME_PREFIX = ChatColor.DARK_AQUA + "[" + ChatColor.AQUA + "EmotesRevived" + ChatColor.DARK_AQUA + "]";
    public static final String PLUGIN_VERSION = "0.1";
    
    private final ConsoleCommandSender console = this.getServer().getConsoleSender();
    
    @Override
    public void onEnable()
    {
        loadCommands();
        loadConfig();
        console.sendMessage(CONSOLE_PREFIX + " Enabled EmotesRevived v" + PLUGIN_VERSION);
    }
    
    @Override
    public void onDisable()
    {
        console.sendMessage(CONSOLE_PREFIX + " Disabled EmotesRevived v" + PLUGIN_VERSION);
    }
    
    private void loadCommands()
    {
        this.getCommand("backflip").setExecutor(new Command_backflip());
        this.getCommand("greet").setExecutor(new Command_greet());
        this.getCommand("grin").setExecutor(new Command_grin());
        this.getCommand("highfive").setExecutor(new Command_highfive());
        this.getCommand("hug").setExecutor(new Command_hug());
        this.getCommand("kiss").setExecutor(new Command_kiss());
        this.getCommand("laugh").setExecutor(new Command_laugh());
        this.getCommand("raspberry").setExecutor(new Command_raspberry());
        this.getCommand("smile").setExecutor(new Command_smile());
    }
    
    private void loadConfig()
    {
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }
}
