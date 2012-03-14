package strimy.bukkit.plugins.where;
import org.bukkit.plugin.java.JavaPlugin;

import strimy.bukkit.plugins.where.commands.WhereCE;


public class WhereIsPlugin extends JavaPlugin
{
	@Override
	public void onEnable() 
	{
		getCommand("where").setExecutor(new WhereCE(this));
		super.onEnable();
	}
	
}
