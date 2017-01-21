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
					sender.sendMessage("§2Manutenção iniciada.");
					return true;
				}
				plugin.status.setStatus(false);
				sender.sendMessage("Manutenção encerrada");

			} else {
				sender.sendMessage("§cVocê não tem permissão para isso");
				return true;
			}

		}
		return false;
	}

}
