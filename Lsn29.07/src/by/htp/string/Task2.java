package by.htp.string;

public class Task2 {

	public static void main(String[] args) {

		String[] s = { "����", "����", "����", "�������" };
		// ����� ��������� ������
		for (String i : s) {
			System.out.print(i + " ");
		}

		//����� ���� ������ � ������� ��������
		System.out.println("");
		char ch = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				ch = s[i].charAt(j);
				System.out.print(ch + "  ");
			}
		}

		//��������� ����������� ������ ����� � �������� � ������ ����� ������ � ������
		String[] s2 = new String[4];
		for (int i = 0; i < s2.length; i++) {
			s2[i] = "";
		}
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				ch = s[i].charAt(j);

				switch (ch) {

				case '�':
					s2[i] += "01" + " ";
					break;
				case '�':
					s2[i] += 29 + " ";
					break;
				case '�':
					s2[i] += 14 + " ";
					break;
				case '�':
					s2[i] += 13 + " ";
					break;
				case '�':
					s2[i] += 18 + " ";
					break;
				case '�':
					s2[i] += 21 + " ";
					break;
				case '�':
					s2[i] += 15 + " ";
					break;
				case '�':
					s2[i] += 25 + " ";
					break;
				case '�':
					s2[i] += 11 + " ";
					break;
				case '�':
					s2[i] += 19 + " ";
					break;
				case '�':
					s2[i] += 20 + " ";
					break;
				case '�':
					s2[i] += 16 + " ";
					break;
				}

			}

		}
		//����� ������� � ����������� ��������
		System.out.println("");
		for (String i : s2) {
			System.out.print(i);
		}
	}

}
