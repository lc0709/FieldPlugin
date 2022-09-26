package kr.ellies;

import org.bukkit.plugin.java.JavaPlugin;

public class Field extends JavaPlugin {
    public Field inst(){
        return this;
    }
    @Override
    public void onEnable(){
        getLogger().info("Field Prototype.");
        getServer().getPluginManager().registerEvents(new FieldListener(), this);
    }
}
