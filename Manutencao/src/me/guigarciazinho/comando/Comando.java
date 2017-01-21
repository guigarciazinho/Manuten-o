package me.guigarciazinho.comando;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.guigarciazinho.main.Main;

public class Comando implements CommandExecutor {

	private Main plugin;

	public Comando(Main main) {
		this.plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		if (command.getName().equalsIgnoreCase("manu")) {
			if (sender.hasPermission("manutencao")) {
				if(plugin.status.getStatus() == false){
					plugin.status.setStatus(true);
					sender.sendMessage("�2Manuten��o iniciada.");
					return true;
				}
				plugin.status.setStatus(false);
				sender.sendMessage("Manuten��o encerrada");

			} else {
				sender.sendMessage("�cVoc� n�o tem permiss�o para isso");
				return true;
			}

		}
		return false;
	}

}
