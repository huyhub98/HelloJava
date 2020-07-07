package com.trungtamjava.javafile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainFile {
	public static void main(String[] args) {
		writeFile();
		readFile();
	}

	public static void readFile() {
		try {
			File file = new File("test.txt");
			if (file.exists()) {
				FileInputStream fileInputStream = new FileInputStream(file);

				// doc ky tu lan luot
				int keycode = fileInputStream.read();
				while (keycode != -1) {
					System.out.println((char) keycode);
					/// gan lai, doc tiep ky tu tiep theo
					keycode = fileInputStream.read();
				}
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void writeFile() {
		try {
			File file = new File("test.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			String s = "Hello Java";

			FileOutputStream fileOutputStream = new FileOutputStream(file);

			// ghi file
			byte[] arrs = s.getBytes();
			fileOutputStream.write(arrs);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}
}
