package by.htp.string;

public class Task14 {

	public static void main(String[] args) {
		String[] s = { "мама", "помыла", "раму", "начисто" };
		// вывод исходного текста
		System.out.print("Исходный текст: ");
		for (String i : s) {
			System.out.print(i + " ");
		}

		// поиск слов минимальной и максимальной длинны
		int min = s[0].length();
		int max = s[0].length();
		for (int i = 0; i < s.length; i++) {
			if (min > s[i].length()) {
				min = s[i].length();
			} else if (max < s[i].length()) {
				max = s[i].length();
			}
		}

		// сохранение всех слов макс и мин длинны
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
		// вывод результата на экран
		System.out.println("\nСлова максимальной длинны: ");
		for (String y : maxInd) {
			if (y != null)
				System.out.println(y);

		}
		System.out.println("Слова минимальной длинны: ");
		for (String y : minInd) {
			if (y != null)
				System.out.println(y);

		}

	}
}
