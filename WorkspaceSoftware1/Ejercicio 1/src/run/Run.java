/**
 * @autor Duvis Alejando Gómez Neira
 * @autor Nelson Andrés Niño Verdugo
 * @autor Ángel Gutiérrez Guerrero
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
