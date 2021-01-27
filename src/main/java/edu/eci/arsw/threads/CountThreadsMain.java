package edu.eci.arsw.threads;

import edu.eci.arsw.threads.CountThread;

public class CountThreadsMain {
<<<<<<< HEAD
	
	public static void main(String args[]){
=======
    
    public static void main(String a[]){
>>>>>>> bf24ba0d305328f09bcab8fe57b6f8a86ded44a7
    	CountThread hilo1=new CountThread(0,99);
    	CountThread hilo2=new CountThread(99,199);
    	CountThread hilo3=new CountThread(200,299);
    	hilo1.start();
<<<<<<< HEAD
    	hilo2.start();
    	hilo3.start();
        
=======
    	hilo2.run();
    	//hilo3.start();
>>>>>>> bf24ba0d305328f09bcab8fe57b6f8a86ded44a7
    }

}
