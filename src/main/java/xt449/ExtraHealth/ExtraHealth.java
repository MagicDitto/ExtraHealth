package xt449.ExtraHealth;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xt449.ExtraHealth.Listener.PlayerListener;

public class ExtraHealth extends JavaPlugin {

	@Override
	public final void onEnable() {
		Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);

		getLogger().info("Plugin - Enabled!");
	}

	@Override
	public final void onDisable() {
		getLogger().info("Plugin - Disabled!");
	}
}
