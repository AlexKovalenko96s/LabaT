package ua.kas.laba3Register;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.collections.ObservableList;

public class Main {

	static JButton b1 = new JButton("First");
	static JButton b2 = new JButton("Second");
	static JButton b3 = new JButton("Third");
	static JButton b4 = new JButton("Fourth");

	static Software s = new Software();
	static CurrentVersion cv = new CurrentVersion();
	static Equipment eq = new Equipment();
	static AddReg ar = new AddReg();
	static DelReg dr = new DelReg();
	static Error er = new Error();
	static String path = "HKEY_CLASSES_ROOT\\txtfile\\shell\\open\\command";

	public static void showDialog(Component c) {
		JOptionPane.showMessageDialog(c, "Bye Bye!");
	}

	public static void start() {
		String addres = "HKEY_CURRENT_USER\\Software\\SPLab3t";
		String name = "Start";
		String value = "now";
		ar.run(addres, name, value);
	}

	public static void delStart() {
		String addres = "HKEY_CURRENT_USER\\Software\\SPLab3t";
		String name = "Start";
		dr.run(addres, name);
	}

	public static void delExit() {
		String addres = "HKEY_CURRENT_USER\\Software\\SPLab3t";
		String name = "Exit";
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
	
	public static void main(String[] args) {

		er.run();
		if (er.start == false) {
			JFrame f = new JFrame();
			f.setTitle("Laba3");
			f.setLayout(new GridLayout(2, 2));
			f.setSize(200, 200);
			f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			f.setResizable(false);
			f.setLocationRelativeTo(null);

			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);

			/*
			 * Enter program
			 */
			start();
			delExit();

			f.addWindowListener(new WindowAdapter() {

				@Override
				public void windowClosing(WindowEvent we) {
					showDialog(f);
					String addres = "HKEY_CURRENT_USER\\Software\\SPLab3t";
					String name = "Exit";
					String value = "now";
					ar.run(addres, name, value);
					delStart();
					System.exit(0);
				}
			});

			b1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					s.run();
				}
			});

			b2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					cv.run();

//					 String addres
//					 ="HKEY_LOCAL_MACHINE\\Software\\Microsoft\\Windows\\CurrentVersion\\Run";
//					 try {
//					 Equipment.readWinReg(addres);
//					 } catch (Exception e1) {e1.printStackTrace();}
				}
			});

			b3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String addres = "HKEY_LOCAL_MACHINE\\HARDWARE\\DESCRIPTION\\System\\CentralProcessor\\1";
					try {
						Equipment.run(addres);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});

			b4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					String addres = path;
					try {
						Equipment.run(addres);	
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});

			f.setVisible(true);
		} else {
			delStart();
			String addres = "HKEY_CURRENT_USER\\Software\\SPLab3t";
			String name = "Exit";
			String value = "now";
			ar.run(addres, name, value);
			JOptionPane.showMessageDialog(null, "Not correct exit last time!");
		}
	}
}