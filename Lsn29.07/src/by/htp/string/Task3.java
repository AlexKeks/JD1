package by.htp.string;

public class Task3 {

	public static void main(String[] args) {

		String[] s = { "����", "����", "����", "�������" };
		// ����� ��������� ������
		for (String i : s) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// ������ �����, ����� '�', �� '�', ���� '�' �� ��������� � �����
		for (int i = 0; i < s.length; i++) {
			int j = s[i].indexOf('�');
			// ��������, ��� '�' �� ��������� ����� � �����
			if (j >= 0 & j < s[i].length()) {
				StringBuffer sb = new StringBuffer(s[i]);
				sb.setCharAt(j + 1, '�');
				s[i] = sb.toString();
			}

		}
		for (String i1 : s) {
			System.out.print(i1 + " ");
		}
	}

}
