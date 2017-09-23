package by.htp.string;

public class Task16 {

	public static void main(String[] args) {

		String[] s = { "Люблю, – но реже говорю об этом,", "Люблю нежней, – но не для многих глаз.",
				"Торгует чувством тот, что перед светом", "Всю душу выставляет напоказ.",
				"Тебя встречал я песней, как приветом,", "Когда любовь нова была для нас.", "W.Shekspir" };
		// вывод исходного текста
		for (String i : s) {
			System.out.println(i);
		}

		char ch = 0;
		int[] s2 = new int[33];

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				ch = s[i].charAt(j);

				switch (ch) {

				case 'а':
					s2[0] += 1;
					break;
				case 'б':
					s2[1] += 1;
					break;
				case 'в':
					s2[2] += 1;
					break;
				case 'г':
					s2[3] += 1;
					break;
				case 'д':
					s2[4] += 1;
					break;
				case 'е':
					s2[5] += 1;
					break;
				case 'ё':
					s2[6] += 1;
					break;
				case 'ж':
					s2[7] += 1;
					break;
				case 'з':
					s2[8] += 1;
					break;
				case 'и':
					s2[9] += 1;
					break;
				case 'й':
					s2[10] += 1;
					break;
				case 'к':
					s2[11] += 1;
					break;
				case 'л':
					s2[12] += 1;
					break;
				case 'м':
					s2[13] += 1;
					break;
				case 'н':
					s2[14] += 1;
					break;
				case 'о':
					s2[15] += 1;
					break;
				case 'п':
					s2[16] += 1;
					break;
				case 'р':
					s2[17] += 1;
					break;
				case 'с':
					s2[18] += 1;
					break;
				case 'т':
					s2[19] += 1;
					break;
				case 'у':
					s2[20] += 1;
					break;
				case 'ф':
					s2[21] += 1;
					break;
				case 'х':
					s2[22] += 1;
					break;
				case 'ц':
					s2[23] += 1;
					break;
				case 'ч':
					s2[24] += 1;
					break;
				case 'ш':
					s2[25] += 1;
					break;
				case 'щ':
					s2[26] += 1;
					break;
				case 'ъ':
					s2[27] += 1;
					break;
				case 'ы':
					s2[28] += 1;
					break;
				case 'ь':
					s2[29] += 1;
					break;
				case 'э':
					s2[30] += 1;
					break;
				case 'ю':
					s2[31] += 1;
					break;
				case 'я':
					s2[32] += 1;
					break;

				}

			}

		}
		for (int i = 0; i < s2.length; i++) {
			if (s2[i] != 0) {
				System.out.println("номер буквы в алфавите: " + (i + 1) + ", количество букв в тксте: " + s2[i]);
			}
		}

	}

}
