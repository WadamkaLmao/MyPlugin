package me.wadamka.eatpotiontwist;

import org.bukkit.plugin.java.JavaPlugin;

public final class EatPotionTwist extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Starting the Twist (Eating = random potion effect)");

        getServer().getPluginManager().registerEvents(new EatListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
