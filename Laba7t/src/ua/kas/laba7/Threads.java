package ua.kas.laba7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Threads {

	static int think;
	static int[][] mA = new int[100][100];
	static int[][] mB = new int[100][100];
	static int[][] res = new int[100][100];
	static String result = "";
	
	public static String find_time() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:SS");
		String t1 = sdf.format(cal.getTime());
		return t1;
	}

	public static void start() {

		String time1 = find_time();
		time1 = time1.substring(9);
		int think1 = Integer.parseInt(time1);

		Thread t1 = new Thread(new Thread_constr("1", "First", "Second", "Result1"));
		t1.start();

		Thread t2 = new Thread(new Thread_constr("2", "First", "Second", "Result2"));
		t2.start();

		Thread t3 = new Thread(new Thread_constr("3", "First", "Second", "Result3"));
		t3.start();

		Thread t4 = new Thread(new Thread_constr("4", "First", "Second", "Result4"));
		t4.start();

		Thread t5 = new Thread(new Thread_constr("5", "First", "Second", "Result5"));
		t5.start();

		Thread t6 = new Thread(new Thread_constr("6", "First", "Second", "Result6"));
		t6.start();

		Thread t7 = new Thread(new Thread_constr("7", "First", "Second", "Result7"));
		t7.start();

		Thread t8 = new Thread(new Thread_constr("8", "First", "Second", "Result8"));
		t8.start();

		Thread t9 = new Thread(new Thread_constr("9", "First", "Second", "Result9"));
		t9.start();

		Thread t10 = new Thread(new Thread_constr("10", "First", "Second", "Result10"));
		t10.start();

		Thread t11 = new Thread(new Thread_constr("11", "First", "Second", "Result11"));
		t11.start();

		Thread t12 = new Thread(new Thread_constr("12", "First", "Second", "Result12"));
		t12.start();

		Thread t13 = new Thread(new Thread_constr("13", "First", "Second", "Result13"));
		t13.start();

		Thread t14 = new Thread(new Thread_constr("14", "First", "Second", "Result14"));
		t14.start();

		Thread t15 = new Thread(new Thread_constr("15", "First", "Second", "Result15"));
		t15.start();

		Thread t16 = new Thread(new Thread_constr("16", "First", "Second", "Result16"));
		t16.start();

		Thread t17 = new Thread(new Thread_constr("17", "First", "Second", "Result17"));
		t17.start();

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

	public static void start_join() throws InterruptedException {

		String time1 = find_time();
		time1 = time1.substring(9);
		int think1 = Integer.parseInt(time1);

		Thread t1 = new Thread(new Thread_matrix("First", "Second"));
		t1.start();
		t1.join();
		Thread t1_1 = new Thread(new Thread_multiplication("1", Thread_matrix.mA, Thread_matrix.mB, "Result1"));
		t1_1.start();

		Thread t2 = new Thread(new Thread_matrix("First", "Second"));
		t2.start();
		t2.join();
		Thread t2_2 = new Thread(new Thread_multiplication("2", Thread_matrix.mA, Thread_matrix.mB, "Result2"));
		t2_2.start();

		Thread t3 = new Thread(new Thread_matrix("First", "Second"));
		t3.start();
		t3.join();
		Thread t3_3 = new Thread(new Thread_multiplication("3", Thread_matrix.mA, Thread_matrix.mB, "Result3"));
		t3_3.start();

		Thread t4 = new Thread(new Thread_matrix("First", "Second"));
		t4.start();
		t4.join();
		Thread t4_4 = new Thread(new Thread_multiplication("4", Thread_matrix.mA, Thread_matrix.mB, "Result4"));
		t4_4.start();

		Thread t5 = new Thread(new Thread_matrix("First", "Second"));
		t5.start();
		t5.join();
		Thread t5_5 = new Thread(new Thread_multiplication("5", Thread_matrix.mA, Thread_matrix.mB, "Result5"));
		t5_5.start();

		Thread t6 = new Thread(new Thread_matrix("First", "Second"));
		t6.start();
		t6.join();
		Thread t6_6 = new Thread(new Thread_multiplication("6", Thread_matrix.mA, Thread_matrix.mB, "Result6"));
		t6_6.start();

		Thread t7 = new Thread(new Thread_matrix("First", "Second"));
		t7.start();
		t7.join();
		Thread t7_7 = new Thread(new Thread_multiplication("7", Thread_matrix.mA, Thread_matrix.mB, "Result7"));
		t7_7.start();

		Thread t8 = new Thread(new Thread_matrix("First", "Second"));
		t8.start();
		t8.join();
		Thread t8_8 = new Thread(new Thread_multiplication("8", Thread_matrix.mA, Thread_matrix.mB, "Result8"));
		t8_8.start();

		Thread t9 = new Thread(new Thread_matrix("First", "Second"));
		t9.start();
		t9.join();
		Thread t9_9 = new Thread(new Thread_multiplication("9", Thread_matrix.mA, Thread_matrix.mB, "Result9"));
		t9_9.start();

		Thread t10 = new Thread(new Thread_matrix("First", "Second"));
		t10.start();
		t10.join();
		Thread t10_10 = new Thread(new Thread_multiplication("10", Thread_matrix.mA, Thread_matrix.mB, "Result10"));
		t10_10.start();

		Thread t11 = new Thread(new Thread_matrix("First", "Second"));
		t11.start();
		t11.join();
		Thread t11_11 = new Thread(new Thread_multiplication("11", Thread_matrix.mA, Thread_matrix.mB, "Result11"));
		t11_11.start();

		Thread t12 = new Thread(new Thread_matrix("First", "Second"));
		t12.start();
		t12.join();
		Thread t12_12 = new Thread(new Thread_multiplication("12", Thread_matrix.mA, Thread_matrix.mB, "Result12"));
		t12_12.start();

		Thread t13 = new Thread(new Thread_matrix("First", "Second"));
		t13.start();
		t13.join();
		Thread t13_13 = new Thread(new Thread_multiplication("13", Thread_matrix.mA, Thread_matrix.mB, "Result13"));
		t13_13.start();

		Thread t14 = new Thread(new Thread_matrix("First", "Second"));
		t14.start();
		t14.join();
		Thread t14_14 = new Thread(new Thread_multiplication("14", Thread_matrix.mA, Thread_matrix.mB, "Result14"));
		t14_14.start();

		Thread t15 = new Thread(new Thread_matrix("First", "Second"));
		t15.start();
		t15.join();
		Thread t15_15 = new Thread(new Thread_multiplication("15", Thread_matrix.mA, Thread_matrix.mB, "Result15"));
		t15_15.start();

		Thread t16 = new Thread(new Thread_matrix("First", "Second"));
		t16.start();
		t16.join();
		Thread t16_16 = new Thread(new Thread_multiplication("16", Thread_matrix.mA, Thread_matrix.mB, "Result16"));
		t16_16.start();

		Thread t17 = new Thread(new Thread_matrix("First", "Second"));
		t17.start();
		t17.join();
		Thread t17_17 = new Thread(new Thread_multiplication("17", Thread_matrix.mA, Thread_matrix.mB, "Result17"));
		t17_17.start();
		
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

	public static void start_oneThread() throws FileNotFoundException {

		String time1 = find_time();
		time1 = time1.substring(9);
		String time1_1 = find_time();
		time1_1 = time1_1.substring(6, 8);
		int think1 = Integer.parseInt(time1);
		int think1_1 = Integer.parseInt(time1_1);

		// считывает матрицы с файлов

		Scanner sc1 = new Scanner(new File("First"));
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				mA[i][j] = sc1.nextInt();
			}
		}
		sc1.close();

		Scanner sc2 = new Scanner(new File("Second"));
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				mB[i][j] = sc2.nextInt();
			}
		}
		sc2.close();

		int m = mA.length;
		int n = mB[0].length;
		int o = mB.length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < o; k++) {
					res[i][j] += mA[i][k] * mB[k][j];
				}
			}
		}
		

		// создание и запись файла

		FileWriter fw;
		try {
			fw = new FileWriter(new File("Result1"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "1" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result2"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "2" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result3"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "3" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result4"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "4" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result5"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "5" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result6"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "6" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result7"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "7" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result8"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "8" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result9"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "9" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result10"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "10" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result11"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "11" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result12"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "12" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result13"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "13" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result14"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "14" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result15"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "15" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result16"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "16" + " finish!");
		} catch (IOException ex) {
		}
		
		try {
			fw = new FileWriter(new File("Result17"));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n");
			}
			fw.flush();
			fw.close();
			System.out.println("Thread " + "17" + " finish!");
		} catch (IOException ex) {
		}
		
		String time2 = find_time();
		time2 = time2.substring(9);
		String time2_2 = find_time();
		time2_2 = time2_2.substring(6,8);
		int think2 = Integer.parseInt(time2);
		int think2_2 = Integer.parseInt(time2_2);
		
		if(think2_2 > think1_1){
			int abs2 = Math.abs(think2_2 - think1_1);
			
			if(think1 > think2){
				int abs = Math.abs(think2 - think1);
				think = 999 - abs;
			}
			else{
				int abs = Math.abs(think2 - think1);
				 think = abs;
			}
			
			System.out.println(abs2 +" sec. and "+ think +" milisec.");
		}
		
		if(think2_2 == think1_1){
			if(think1 > think2){
				int abs = Math.abs(think2 - think1);
				think = 999 - abs;
			}
			else{
				int abs = Math.abs(think2 - think1);
				 think = abs;
			}
			
			System.out.println(think +" milisec.");
		}
	}
}
