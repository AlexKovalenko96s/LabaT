package ua.kas.laba3Register;

import com.sun.deploy.association.utility.WinRegistryWrapper;

public class CurrentVersion {
	
	public void run(){
		String[] keys= WinRegistryWrapper.WinRegGetValues(WinRegistryWrapper.HKEY_LOCAL_MACHINE,"Software\\Microsoft\\Windows\\CurrentVersion\\Run",100);
        System.out.println("Всего подключей в CurrentVersion\\Run: "+keys.length);
        for(int i=0; i < keys.length; i++)
            System.out.println(keys[i]);
	}
}
