package loops;

public class for4 {
public static void main(String[] args) {
	int soma = 0; 
	for(int x = 1; x<=50; x++) {
		if (x%2==0) {
			soma = x/2;
			System.out.println(x +" "+soma);
		}else {
			soma = 3*x+1;
			System.out.println(x + " "+soma);
		}
	}
	
}
}
