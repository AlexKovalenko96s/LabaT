package ua.kas.laba3;

import com.sun.deploy.association.utility.WinRegistryWrapper;

public class Software {

	public void run(){
		String[] keys= WinRegistryWrapper.WinRegGetSubKeys(WinRegistryWrapper.HKEY_LOCAL_MACHINE,"Software",100);
        System.out.println("����� ��������� � Software: "+keys.length);
        for(int i=0; i < keys.length; i++)
            System.out.println(keys[i]);
	}
}
