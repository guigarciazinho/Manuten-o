package me.guigarciazinho.status;


public class Status {
	
	private boolean status;
	
	public Status(){
		this.status = false;
	}
	
	/**
	 * 
	 * @return retorna o status da manutenção.
	 */
	public boolean getStatus(){
		return this.status;
	}
	
	/**
	 * 
	 * @param status define o status da manutenção
	 */
	
	public void setStatus(boolean status){
		this.status = status;
	}

}
