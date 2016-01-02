package xt449.ExtraHealth;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xt449.ExtraHealth.Listener.PlayerListener;

public class ExtraHealth extends JavaPlugin {

	@Override
	public final void onEnable() {
		getLogger().info("has been enabled!");
		Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
	}

	@Override
	public final void onDisable() {
		getLogger().info("has been disabled!");
	}
}
