package filesDemos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import creature.PrintHelper;

public class DemoReadFiles {

	public static void main(String[] args){
		File file = new File("c:\\Java\\ReadMe.txt");
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bf = new BufferedReader(fr);
		
		try {
			while(bf.ready()) {
				System.out.println(bf.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fr = new FileReader(file);
			bf = new BufferedReader(fr);
			System.out.println(bf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
