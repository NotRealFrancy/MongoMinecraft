package org.github.notrealfrancy.mongospigot;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class MongoSpigot extends JavaPlugin {

    @Getter private static MongoSpigot instance;

    @Override
    public void onEnable() {
        MongoSpigot.instance = this;
    }

    @Override
    public void onDisable() {
        MongoSpigot.instance = null;
    }

    public static String getPrefix() {
        return "[MONGOSPIGOT] ";
    }

}
