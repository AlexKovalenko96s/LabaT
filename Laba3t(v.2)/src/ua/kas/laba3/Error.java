package ua.kas.laba3;

import com.sun.deploy.association.utility.WinRegistryWrapper;

public class Error {
	
	Boolean full=false;
	Boolean trial=false;
	String proverka;
	
	public void run(){
		String[] keys= WinRegistryWrapper.WinRegGetValues(WinRegistryWrapper.HKEY_CURRENT_USER,"Software\\SPLab3t",100);
        for(int i=0; i < keys.length; i++){
        	proverka=keys[i];
            if(proverka.equals("FULL_key:111")){
            	full=true;
            }
            if(proverka.equals("TRIAL_key:000")){
            	trial=true;
            }
        }
	}
}
