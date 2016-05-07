package ua.kas.laba7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static int think;
	static String enter;
	static int[][] mA = new int[100][100];
	static int[][] mB = new int[100][100];
	static int[][] res = new int[100][100];
	static Random random = new Random();
	static String posl = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,";

	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("All threads, ENTER 1" + "\n" +
							"All threads(join), ENTER 2" + "\n" + 
							"One thread, ENTER 3" + "\n" + 
							"Turn off some thread, ENTER 4" + "\n" + 
							"ADMIN, ENTER 5");
		enter = s.next();
		
		if(enter.equals("1")){
			Threads.start();
		}
		
		if(enter.equals("2")){
			Threads.start_join();
		}
		
		if(enter.equals("3")){
			Threads.start_oneThread();
		}
		
		if(enter.equals("4")){
			String time1 = find_time();
			time1 = time1.substring(9);
			int think1 = Integer.parseInt(time1);
			
			System.out.println("Enter thread: ");
			enter = s.next();
			posl = posl.replaceAll(enter+",", "");
			System.out.println(posl);
			
			if(posl.contains("1")){
				Thread t1 = new Thread(new Thread_constr("1", "First", "Second", "Result1"));
				t1.start();
			}
			if(posl.contains("2")){
				Thread t2 = new Thread(new Thread_constr("2", "First", "Second", "Result2"));
				t2.start();
			}
			if(posl.contains("3")){
				Thread t3 = new Thread(new Thread_constr("3", "First", "Second", "Result3"));
				t3.start();
			}
			if(posl.contains("4")){
				Thread t4 = new Thread(new Thread_constr("4", "First", "Second", "Result4"));
				t4.start();
			}
			if(posl.contains("5")){
				Thread t5 = new Thread(new Thread_constr("5", "First", "Second", "Result5"));
				t5.start();
			}
			
			if(posl.contains("6")){
				Thread t6 = new Thread(new Thread_constr("6", "First", "Second", "Result6"));
				t6.start();
			}
			if(posl.contains("7")){
				Thread t7 = new Thread(new Thread_constr("7", "First", "Second", "Result7"));
				t7.start();
			}
			if(posl.contains("8")){
				Thread t8 = new Thread(new Thread_constr("8", "First", "Second", "Result8"));
				t8.start();
			}
			if(posl.contains("9")){
				Thread t9 = new Thread(new Thread_constr("9", "First", "Second", "Result9"));
				t9.start();
			}
			if(posl.contains("10")){
				Thread t10 = new Thread(new Thread_constr("10", "First", "Second", "Result10"));
				t10.start();
			}
			if(posl.contains("11")){
				Thread t11 = new Thread(new Thread_constr("11", "First", "Second", "Result11"));
				t11.start();
			}
			if(posl.contains("12")){
				Thread t12 = new Thread(new Thread_constr("12", "First", "Second", "Result12"));
				t12.start();
			}
			if(posl.contains("13")){
				Thread t13 = new Thread(new Thread_constr("13", "First", "Second", "Result13"));
				t13.start();
			}
			if(posl.contains("14")){
				Thread t14 = new Thread(new Thread_constr("14", "First", "Second", "Result14"));
				t14.start();
			}
			if(posl.contains("15")){
				Thread t15 = new Thread(new Thread_constr("15", "First", "Second", "Result15"));
				t15.start();
			}
			if(posl.contains("16")){
				Thread t16 = new Thread(new Thread_constr("16", "First", "Second", "Result16"));
				t16.start();
			}
			if(posl.contains("17")){
				Thread t17 = new Thread(new Thread_constr("17", "First", "Second", "Result17"));
				t17.start();
			}
			
			String time2 = find_time();
			time2 = time2.substring(9);
			int think2 = Integer.parseInt(time2);

			if (think1 > think2) {
				int abs = Math.abs(think2 - think1);
				think = 999 - abs;
			} else {
				int abs = Math.abs(think2 - think1);
				think = abs;
			}

			System.out.println(think + " milisec.");
		}
		
		if(enter.equals("5")){
			for(int i=0; i<100; i++){
				for(int j=0; j<100; j++){
					mA[i][j] = random.nextInt(100);
					mB[i][j] = random.nextInt(100);
				}
			}
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("First"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						String result = String.valueOf(mA[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException e) {}	
			
			try {
				fw = new FileWriter(new File("Second"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						String result = String.valueOf(mB[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException e) {}	
			
			System.out.println("Compleat!");
		}
	}
	
	public static String find_time() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:SS");
		String t1 = sdf.format(cal.getTime());
		return t1;
	}
}
