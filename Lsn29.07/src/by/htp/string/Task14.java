package by.htp.string;

public class Task14 {

	public static void main(String[] args) {
		String[] s = { "����", "������", "����", "�������" };
		// ����� ��������� ������
		System.out.print("�������� �����: ");
		for (String i : s) {
			System.out.print(i + " ");
		}

		// ����� ���� ����������� � ������������ ������
		int min = s[0].length();
		int max = s[0].length();
		for (int i = 0; i < s.length; i++) {
			if (min > s[i].length()) {
				min = s[i].length();
			} else if (max < s[i].length()) {
				max = s[i].length();
			}
		}

		// ���������� ���� ���� ���� � ��� ������
		String[] maxInd = new String[5];
		String[] minInd = new String[5];
		int j = 0, k = 0;
		for (int i = 0; i < s.length; i++) {
			if (min == s[i].length()) {
				minInd[j] = s[i];
				j++;
			} else if (max == s[i].length()) {
				maxInd[k] = s[i];
				k++;
			}

		}
		// ����� ���������� �� �����
		System.out.println("\n����� ������������ ������: ");
		for (String y : maxInd) {
			if (y != null)
				System.out.println(y);

		}
		System.out.println("����� ����������� ������: ");
		for (String y : minInd) {
			if (y != null)
				System.out.println(y);

		}

	}
}
