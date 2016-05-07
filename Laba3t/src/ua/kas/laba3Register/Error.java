package ua.kas.laba3Register;

import com.sun.deploy.association.utility.WinRegistryWrapper;

public class Error {
	
	Boolean start=false;
	String proverka;
	
	public void run(){
		String[] keys= WinRegistryWrapper.WinRegGetValues(WinRegistryWrapper.HKEY_CURRENT_USER,"Software\\SPLab3t",100);
        for(int i=0; i < keys.length; i++){
        	proverka=keys[i];
            if(proverka.equals("Start")){
            	start=true;
            }
        }
	}
}
