package griefProtection;

import java.util.ArrayList;
import java.util.logging.Logger;





import org.bukkit.Location;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class GriefProtectionPlugin extends JavaPlugin {
	
	
	public final Logger logger = Logger.getLogger("MineCraft");
	public final ArrayList <Location> blocks = new ArrayList<Location>();
	
	public void onEnable()
	{
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + "Version " + pdfFile.getVersion() + " Has been Enabled!");
		
		// gets the varibales from GriefProtectionListener 
		getServer().getPluginManager().registerEvents( new GiefProtectionListener(this),(this));
		
	}

}
