package by.htp.string;

public class Task2 {

	public static void main(String[] args) {

		String[] s = { "мама", "мыла", "раму", "начисто" };
		// вывод исходного текста
		for (String i : s) {
			System.out.print(i + " ");
		}

		//вывод букв текста с двойным пробелом
		System.out.println("");
		char ch = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				ch = s[i].charAt(j);
				System.out.print(ch + "  ");
			}
		}

		//получение порядкового номера буквы в алфавите и запись этого номеры в массив
		String[] s2 = new String[4];
		for (int i = 0; i < s2.length; i++) {
			s2[i] = "";
		}
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				ch = s[i].charAt(j);

				switch (ch) {

				case 'а':
					s2[i] += "01" + " ";
					break;
				case 'ы':
					s2[i] += 29 + " ";
					break;
				case 'м':
					s2[i] += 14 + " ";
					break;
				case 'л':
					s2[i] += 13 + " ";
					break;
				case 'р':
					s2[i] += 18 + " ";
					break;
				case 'у':
					s2[i] += 21 + " ";
					break;
				case 'н':
					s2[i] += 15 + " ";
					break;
				case 'ч':
					s2[i] += 25 + " ";
					break;
				case 'и':
					s2[i] += 11 + " ";
					break;
				case 'с':
					s2[i] += 19 + " ";
					break;
				case 'т':
					s2[i] += 20 + " ";
					break;
				case 'о':
					s2[i] += 16 + " ";
					break;
				}

			}

		}
		//вывод массива с порядковыми номерами
		System.out.println("");
		for (String i : s2) {
			System.out.print(i);
		}
	}

}
