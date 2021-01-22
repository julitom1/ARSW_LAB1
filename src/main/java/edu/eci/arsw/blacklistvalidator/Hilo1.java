package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

public class Hilo1 extends Thread{
	private int inisegmento;
	private int finsegmento;
	private String ip;
	private HostBlacklistsDataSourceFacade skds=HostBlacklistsDataSourceFacade.getInstance();
	private int countmal;
	
	public Hilo1(int inisegmento,int finsegmento,String ip){
		 this.inisegmento=inisegmento;
		 this.finsegmento=finsegmento;
		 this.ip = ip;
	}
	
	public void run() {
		for(int i=inisegmento; i<= finsegmento;i++) {
		countmal=0;
			 if (skds.isInBlackListServer(i, ip)){
				 countmal+=1;
			 }
		 }
	}
	
	public int getcountmal(){
		return countmal;
	}
}
