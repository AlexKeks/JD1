package by.htp.Ls3classwork;

public class Main {

	//private int lessonNumber = 3;
	public Main(){
			System.out.println("Main construktor");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//new Book();
		Autor autor1 = new Autor("Kolia", "Semenov", "Petrovich", 1980);
		Autor autor2 = new Autor("Katia", "Koshkina", "Petrovna", 1992);
		
		Book b1 = new Book(345, 1999,"Book1", autor1);
		
		Book b2 = new Book(500, 2000, "Book2", autor2);
		
		
		
		System.out.println(b1+/*b1.autor1.surname +*/ " " + b1.getAutorSurname());
		System.out.println(b2);

		
		
		
/*String b1 = "Book1";	
int pag1 = 300;
int pub1 =1999;
String aut1 = "Autor1";
		

String b2 = "Book2";
int pag2 = 500;
int pub2 = 2005;
String aut2 = "Autor2";

System.out.println(b1 + " " + pag1 + " " + pub1 + " " + aut1);

System.out.println(b2 + " " + pag2 + " "  + pub2 +  " " + aut2 );*/
	}

}
