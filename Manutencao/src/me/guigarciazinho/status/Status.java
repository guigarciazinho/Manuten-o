package me.guigarciazinho.status;


public class Status {
	
	private boolean status;
	
	public Status(){
		this.status = false;
	}
	
	/**
	 * 
	 * @return retorna o status da manuten��o.
	 */
	public boolean getStatus(){
		return this.status;
	}
	
	/**
	 * 
	 * @param status define o status da manuten��o
	 */
	
	public void setStatus(boolean status){
		this.status = status;
	}

}
