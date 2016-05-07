package ua.kas.laba8;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	
	@FXML TextField tf;
	
	public void go(ActionEvent e) throws IOException{
		Threads.sendData(tf.getText());
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		new Thread(new Threads()).start();
		new Thread(new Server()).start();
	}
}
