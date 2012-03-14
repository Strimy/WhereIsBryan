package strimy.bukkit.plugins.where.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import strimy.bukkit.plugins.where.WhereIsPlugin;

public class WhereCE implements CommandExecutor 
{
	private WhereIsPlugin plugin;
	
	public WhereCE(WhereIsPlugin plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2,
			String[] arg3) 
	{
		if(arg3.length == 1)
		{
			String userName = arg3[0];
			
			Player searchedPlayer = plugin.getServer().getPlayer(userName);
			
			if(searchedPlayer != null)
			{
				Location loc = searchedPlayer.getLocation();
				String formattedLocation = "X : " + loc.getBlockX() + " / Y : " + loc.getBlockY() + " / Z : "+loc.getBlockZ();
				sender.sendMessage(ChatColor.LIGHT_PURPLE + " Player '"+searchedPlayer.getDisplayName()+"' is at "+formattedLocation);
			}
			else
			{
				if(userName.equals("Bryan"))
				{
					sender.sendMessage("Bryan is in the kitchen !");
				}
				else
				{
					sender.sendMessage(ChatColor.RED + "Can't find this player");
				}
			}
			return true;
		}
		return false;
	}

}
