package noPattern;

public class NoPatterApp {
	public static void main(String[] args) {
		ImplementaSoma2 nros = new ImplementaSoma2();
		ImplementaSoma3 nros3 = new ImplementaSoma3();
		ImplementaMult2 mult2 = new ImplementaMult2();
		implementamult3 implementamult3 = new implementamult3();

		nros.setN1(5);
		nros.setN2(2);

		nros3.setN1(1);
		nros3.setN2(1);
		nros3.setN3(1);
		
		mult2.setN1(2);
		mult2.setN2(6);
		
		implementamult3.setN1(7);
		implementamult3.setN2(3);
		implementamult3.setN3(2);

		System.out.println("-----------------------------------------------------------------------------------\n");
		System.out.printf("a soma de 2 numeros  de %d + %d e  = %d \n", nros.getN1(), nros.getN2(), nros.somar());

		System.out.printf("a soma de 3 numeros: de %d + %d  +%d  = %d \n", nros3.getN1(), nros3.getN2(), nros3.getN3(),
				nros3.somar());
		System.out.println("-----------------------------------------------------------------------------------\n");

		System.out.println("-----------------------------------------------------------------------------------\n");
		System.out.printf("a Mult de 2 numeros  de %d * %d e  = %d \n", mult2.getN1(), mult2.getN2(), mult2.mult());

		System.out.printf("a mult de 3 numeros: de %d * %d  * %d  = %d \n", implementamult3.getN1(),
				implementamult3.getN2(), implementamult3.getN3(), implementamult3.mult());
		System.out.println("-----------------------------------------------------------------------------------\n");

	}
}
