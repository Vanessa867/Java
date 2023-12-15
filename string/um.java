package string;

public class um {
public static void main(String[] args) {
	/* REPLACE*/
	String str = "hello";
	String resultado = str.replace("l","w");
	System.out.println(resultado);
	
	/*SUBSTRING*/
	String novo = "hello world";
	resultado = novo.substring(6);
	System.out.println(resultado);
	
	/*SUBSTRING2*/
	String sim = "hello world";
	resultado = sim.substring(3,8);
	System.out.println(resultado);
	
	/*TOUPPERCASE*/
	String mais = "hello world";
	resultado = mais.toUpperCase();
	System.out.println(resultado);
	
	/*TOOLOWERCASE*/
	String menos = "HELLO WORLD";
	resultado = menos.toLowerCase();
	System.out.println(resultado);
	
	/*TRIM*/
	String espaco = "   hello   ";
	resultado = espaco.trim();
	System.out.println(resultado);
	
	/*CHARAT*/
	String ums = "Hellowo";
	char resultado1 = ums.charAt(1);
	System.out.println(resultado1);
	
	/*EQUAL E EQUALSIGNORECASE*/
	String ig = "helloo";
	String ig2 = "HELLOO";
	boolean b1 = ig.equals("helloo");
	boolean b2 = ig.equals(ig2);
	boolean b3 = ig.equalsIgnoreCase(ig2);
	boolean b4 = ig.equalsIgnoreCase("Azul");
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	System.out.println(b4);
	
	/*INDEXOF*/
	String html = "hello world world2";
	int resultado2 = html.indexOf("l");
	System.out.println(resultado2);
	
	/*LASTINDEXOF*/
	String css = "hello world";
	int resultado3 = css.lastIndexOf("d");
	System.out.println(resultado3);
}	
}
