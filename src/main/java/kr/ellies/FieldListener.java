package kr.ellies;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import io.lumine.mythic.api.mobs.MythicMob;
import io.lumine.mythic.bukkit.BukkitAdapter;
import io.lumine.mythic.bukkit.MythicBukkit;
import io.lumine.mythic.core.mobs.ActiveMob;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FieldListener implements Listener {
    @EventHandler
    public void onJump(PlayerJumpEvent event){
        MythicMob mob = MythicBukkit.inst().getMobManager().getMythicMob("SkeletalKnight").orElse(null);
        Location spawnLocation = event.getPlayer().getLocation();
        if(mob != null){
            // spawns mob
            ActiveMob knight = mob.spawn(BukkitAdapter.adapt(spawnLocation),1);

            // get mob as bukkit entity
            Entity entity = knight.getEntity().getBukkitEntity();
        }

    }
}
