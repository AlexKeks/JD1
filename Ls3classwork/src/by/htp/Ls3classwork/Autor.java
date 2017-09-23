package by.htp.Ls3classwork;

public class Autor {


private String name;
public String surname;
public String otchestvo;
public int data;

public Autor (String name, String surname,String otchestvo, int data ){
	this.name = name;
	this.surname = surname;
	this.otchestvo = otchestvo;
	this.data = data;
}

public String getName (){
	return name;
}

public void setName(String name){
	this.name = name;
}
}



