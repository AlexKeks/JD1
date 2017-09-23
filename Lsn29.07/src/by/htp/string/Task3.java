package by.htp.string;

public class Task3 {

	public static void main(String[] args) {

		String[] s = { "мама", "мыла", "раму", "начисто" };
		// вывод исходного текста
		for (String i : s) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// замена буквы, после 'р', на 'о', если 'р' не последняя в слове
		for (int i = 0; i < s.length; i++) {
			int j = s[i].indexOf('р');
			// проверка, что 'р' не последняя буква в слове
			if (j >= 0 & j < s[i].length()) {
				StringBuffer sb = new StringBuffer(s[i]);
				sb.setCharAt(j + 1, 'о');
				s[i] = sb.toString();
			}

		}
		for (String i1 : s) {
			System.out.print(i1 + " ");
		}
	}

}
