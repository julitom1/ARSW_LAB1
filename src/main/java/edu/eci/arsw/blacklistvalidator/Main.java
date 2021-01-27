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
    public static void main(String a[]) throws InterruptedException{
        HostBlackListsValidator hblv=new HostBlackListsValidator();
<<<<<<< HEAD
        List<Integer> blackListOcurrences=hblv.checkHost("202.24.34.55");
=======
        List<Integer> blackListOcurrences=hblv.checkHost("202.24.34.54");
>>>>>>> bf24ba0d305328f09bcab8fe57b6f8a86ded44a7
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
       
    }
    
}
