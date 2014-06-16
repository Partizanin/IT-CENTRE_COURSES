package OOP.week5.classwork;

import OOP.week2.classwork.Man;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex2 {

	public static void main(String[] args) {
		Man man = new Man(23, "Bogdan");
		
		int[] mas = new int[1];
		try{
			mas[1] = 23;
		} catch(IndexOutOfBoundsException e){
			System.out.println("Ura!");
		}
		
		saveMan(man, "e:/test_ile.txt");
	}
	
	public static void saveMan(Man man, String path){
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		try {
			
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(man);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	} 

}
