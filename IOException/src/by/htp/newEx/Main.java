package by.htp.newEx;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

public class Main {

	public static void main(String[] args) {

	/*	try {
			InputStream is = new FileInputStream("D:\\simple_file.txt");
			int a;
			
			try {
				while((a = is.read()) != -1){
					System.out.print((char)a);
				}*/
			
			try {
				InputStream is = new FileInputStream("D:\\simple_file.txt");
				BufferedInputStream br = new BufferedInputStream(is);
			
				
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} /*catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * try { File file = new File("D:\\simple_file2.txt"); file.createNewFile();
	 * //Reader r = new FileReader("C:\\D\\simple_file.txt"); Reader r = new
	 * FileReader(file);
	 * 
	 * Reader r2 = new FileReader("D:\\simple_file.txt"); BufferedReader br =new
	 * BufferedReader(r2); /* int data = r2.read(); char c = (char)data;
	 * 
	 * int data2 = r2.read(); char c2 = (char)data2;
	 * 
	 * //System.err.println(data + " " + c); System.out.println(data + " " + c);
	 * 
	 * System.err.println(data2 + " " + c2); System.out.println(data2 + " " +
	 * c2); int a; while(( a= r2.read()) != -1){ System.out.println((char)a); }
	 * 
	 * String line = null; while((line = br.readLine()) !=null){
	 * System.out.println(line); }
	 * 
	 * } catch (FileNotFoundException e) {
	 * System.out.println("In: FileNotFoundException catch block");
	 * e.printStackTrace(); } catch (IOException e){
	 * System.out.println("In: IOException"); e.printStackTrace(); } Writer w;
	 * 
	 * 
	 * }
	 

}
*/