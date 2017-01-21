package me.guigarciazinho.eventos;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPreLoginEvent;
import org.bukkit.event.player.PlayerPreLoginEvent.Result;

@SuppressWarnings("deprecation")
public class Eventos implements Listener{
	
	
	@EventHandler
	private void aoJogadorEntrar(PlayerPreLoginEvent e){
		if(!e.getName().equalsIgnoreCase("kami")){
			e.setResult(Result.KICK_BANNED);
			e.setKickMessage("O servidor está em manutenção.");
		}
	}

}
