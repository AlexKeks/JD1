package by.htp.string;

public class Task16 {

	public static void main(String[] args) {

		String[] s = { "�����, � �� ���� ������ �� ����,", "����� ������, � �� �� ��� ������ ����.",
				"������� �������� ���, ��� ����� ������", "��� ���� ���������� �������.",
				"���� �������� � ������, ��� ��������,", "����� ������ ���� ���� ��� ���.", "W.Shekspir" };
		// ����� ��������� ������
		for (String i : s) {
			System.out.println(i);
		}

		char ch = 0;
		int[] s2 = new int[33];

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				ch = s[i].charAt(j);

				switch (ch) {

				case '�':
					s2[0] += 1;
					break;
				case '�':
					s2[1] += 1;
					break;
				case '�':
					s2[2] += 1;
					break;
				case '�':
					s2[3] += 1;
					break;
				case '�':
					s2[4] += 1;
					break;
				case '�':
					s2[5] += 1;
					break;
				case '�':
					s2[6] += 1;
					break;
				case '�':
					s2[7] += 1;
					break;
				case '�':
					s2[8] += 1;
					break;
				case '�':
					s2[9] += 1;
					break;
				case '�':
					s2[10] += 1;
					break;
				case '�':
					s2[11] += 1;
					break;
				case '�':
					s2[12] += 1;
					break;
				case '�':
					s2[13] += 1;
					break;
				case '�':
					s2[14] += 1;
					break;
				case '�':
					s2[15] += 1;
					break;
				case '�':
					s2[16] += 1;
					break;
				case '�':
					s2[17] += 1;
					break;
				case '�':
					s2[18] += 1;
					break;
				case '�':
					s2[19] += 1;
					break;
				case '�':
					s2[20] += 1;
					break;
				case '�':
					s2[21] += 1;
					break;
				case '�':
					s2[22] += 1;
					break;
				case '�':
					s2[23] += 1;
					break;
				case '�':
					s2[24] += 1;
					break;
				case '�':
					s2[25] += 1;
					break;
				case '�':
					s2[26] += 1;
					break;
				case '�':
					s2[27] += 1;
					break;
				case '�':
					s2[28] += 1;
					break;
				case '�':
					s2[29] += 1;
					break;
				case '�':
					s2[30] += 1;
					break;
				case '�':
					s2[31] += 1;
					break;
				case '�':
					s2[32] += 1;
					break;

				}

			}

		}
		for (int i = 0; i < s2.length; i++) {
			if (s2[i] != 0) {
				System.out.println("����� ����� � ��������: " + (i + 1) + ", ���������� ���� � �����: " + s2[i]);
			}
		}

	}

}
