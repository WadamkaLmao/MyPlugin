package me.wadamka.eatpotiontwist;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class EatListener implements Listener {

    @EventHandler
    public void onEat(PlayerItemConsumeEvent event){

        Player player = event.getPlayer();

        Random randNumber = new Random();

        int potID = randNumber.nextInt(12);

        int potDura = randNumber.nextInt(60);
        int potAmpl = randNumber.nextInt(5);

        if(potID == 0){
            player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, potDura * 20, potAmpl));
        }
        if(potID == 1){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 + potDura * 20, potAmpl));
        }
        if(potID == 2){
            player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 20 + potDura * 20, potAmpl));
        }
        if(potID == 3){
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 + potDura * 20, potAmpl));
        }
        if(potID == 4){
            player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 + potDura * 20, potAmpl));
        }
        if(potID == 5){
            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 + potDura * 20, potAmpl));
        }
        if(potID == 6){
            player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20 + potDura * 20, potAmpl));
        }
        if(potID == 7){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 20 + potDura * 20, potAmpl));
        }
        if(potID == 8){
            player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20 + potDura * 20, potAmpl));
        }
        if(potID == 9){
            player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20 + potDura * 20, potAmpl));
        }
        if(potID == 10){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20 + potDura * 20, potAmpl));
        }
        if(potID == 11){
            player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 20 + potDura * 20, potAmpl));
        }

    }

}
