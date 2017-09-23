package by.htp.string;

import java.util.Scanner;

public class MainTask1 {

	public static void main(String[] args) {

		String[] s = { "мама", "мыла", "раму", "начисто" };
		// вывод исходного текста
		for (String i : s) {
			System.out.print(i + " ");
		}

		System.out.println("\nВведите номер буквы в слове, которою нужно изменить: ");
		Scanner sc1 = new Scanner(System.in);
		int c = (sc1.nextInt()) - 1;

		System.out.println("Введите букву для замены: ");
		Scanner sc2 = new Scanner(System.in);
		String n = sc2.nextLine();
		char ch = n.charAt(0);

		// замена значений по условию задания
		String s1 = "";
		for (int i = 0; i < s.length; i++) {
			StringBuffer sb = new StringBuffer(s[i]);
			if (c < sb.length())
			sb.setCharAt(c, ch);
			s1 += sb + " ";
		}
		System.out.println(s1);
	}
}
