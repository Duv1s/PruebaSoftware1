/**
 * @autor Duvis Alejando G�mez Neira
 * @autor Nelson Andr�s Ni�o Verdugo
 * @autor �ngel Guti�rrez Guerrero
 */
package run;

import logic.Substract;

public class Run {
	public static void main(String[] args) {
		Substract subject = new Substract();
		System.out.println(subject.subtract(8, 5));
		
		System.out.println("");
		System.out.println("Method Add create by A2G");
		System.out.println("The add is: "+subject.addNumber(7, 3));
	}
}
