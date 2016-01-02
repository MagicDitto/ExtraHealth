package xt449.ExtraHealth.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;

public class PlayerListener implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public final void onPlayerJoin(PlayerJoinEvent event) {
		updateMaxHealth(event.getPlayer());
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public final void onPlayerLevelChange(PlayerLevelChangeEvent event) {
		updateMaxHealth(event.getPlayer());
	}

	private final void updateMaxHealth(Player player) {
		final int health = 20 + player.getLevel();

		player.resetMaxHealth();

		player.setMaxHealth(health);
		player.setHealth((player.getHealth() / player.getMaxHealth()) * health);

		// test comment for pull request
	}
}
