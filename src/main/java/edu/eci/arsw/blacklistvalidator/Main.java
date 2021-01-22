/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.ArrayList;
import java.util.List;

import edu.eci.arsw.threads.CountThread;

/**
 *
 * @author hcadavid
 */
public class Main {
    
	private static ArrayList <Hilo1> listahilo= new ArrayList();
	
    public static void main(String a[]){
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        
        for(int i=0 ; i<=7; i++) {
        	Hilo1 hilo = new Hilo1((i*10000)+1,(i+1)*10000,"202.24.34.55");
        	listahilo.add(hilo);
    	}
        List<Integer> blackListOcurrences=hblv.checkHost("200.24.34.55");
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        
    }
    
}
