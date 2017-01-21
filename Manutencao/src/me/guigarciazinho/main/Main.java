package me.guigarciazinho.main;

import org.bukkit.plugin.java.JavaPlugin;

import me.guigarciazinho.comando.Comando;
import me.guigarciazinho.eventos.Eventos;
import me.guigarciazinho.status.Status;

public class Main extends JavaPlugin{
	public Comando comando;
	public Status status;
	private Eventos eventos;
	
	public void onEnable(){
		comando = new Comando(this);
		status = new Status();
		eventos = new Eventos();
		getServer().getPluginManager().registerEvents(eventos, this);
		getCommand("manu").setExecutor(comando);
		
	}
	
	public void onDisable(){
		
	}

}
