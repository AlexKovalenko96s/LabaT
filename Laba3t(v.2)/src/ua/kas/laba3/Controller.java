package ua.kas.laba3;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller{

	@FXML TextField tf;
	static String key;
	static Software s = new Software();
	static CurrentVersion cv = new CurrentVersion();
	static Equipment eq = new Equipment();
	static AddReg ar = new AddReg();
	static DelReg dr = new DelReg();
	static Error er = new Error();
	static String path = "HKEY_CLASSES_ROOT\\txtfile\\shell\\open\\command";
	
	public static void Full() {
		String addres = "HKEY_CURRENT_USER\\Software\\SPLab3t";
		String name = "FULL_key:111";
		String value = "now";
		ar.run(addres, name, value);
	}

	public static void delFull() {
		String addres = "HKEY_CURRENT_USER\\Software\\SPLab3t";
		String name = "FULL_key:111";
		dr.run(addres, name);
	}

	public static void Trial() {
		String addres = "HKEY_CURRENT_USER\\Software\\SPLab3t";
		String name = "TRIAL_key:000";
		String value = "now";
		ar.run(addres, name, value);
	}
	
	public static void delTrial() {
		String addres = "HKEY_CURRENT_USER\\Software\\SPLab3t";
		String name = "TRIAL_key:000";
		dr.run(addres, name);
	}

	public void path(){
		String address = "HKEY_CLASSES_ROOT\\.txt";
		try {
			Equipment.run(path);
			if(address.contains("txtfile.txt")){
				path = address.substring((5));
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void enter(ActionEvent e) throws IOException{
		key = tf.getText();
		
		if(key.equals("000")){
			Trial();
			Scene trial = new Scene(FXMLLoader.load(getClass().getResource("Main2.fxml")));
			trial.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage trial_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			trial_stage.setScene(trial);
			trial_stage.show();	
			//delTrial();
		}
		if(key.equals("111")){
			Full();
			Scene full = new Scene(FXMLLoader.load(getClass().getResource("Main.fxml")));
			full.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage full_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			full_stage.setScene(full);
			full_stage.show();			
		}
		else if(key.equals("000")!=true){
			JOptionPane.showMessageDialog(null, "Not correct key. Take me money, and then can use my program!");
		}
	}
	
	public void first_btn(ActionEvent e){
		s.run();
	}
	
	public void second_btn(ActionEvent e){
		cv.run();
	}
	
	public void third_btn(ActionEvent e){
		String addres = "HKEY_LOCAL_MACHINE\\HARDWARE\\DESCRIPTION\\System\\CentralProcessor\\1";
		try {
			Equipment.run(addres);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void fourth_btn(ActionEvent e){
		String addres = path;
		try {
			Equipment.run(addres);	
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
