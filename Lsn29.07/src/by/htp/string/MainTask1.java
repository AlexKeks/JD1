package by.htp.string;

import java.util.Scanner;

public class MainTask1 {

	public static void main(String[] args) {

		String[] s = { "����", "����", "����", "�������" };
		// ����� ��������� ������
		for (String i : s) {
			System.out.print(i + " ");
		}

		System.out.println("\n������� ����� ����� � �����, ������� ����� ��������: ");
		Scanner sc1 = new Scanner(System.in);
		int c = (sc1.nextInt()) - 1;

		System.out.println("������� ����� ��� ������: ");
		Scanner sc2 = new Scanner(System.in);
		String n = sc2.nextLine();
		char ch = n.charAt(0);

		// ������ �������� �� ������� �������
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
