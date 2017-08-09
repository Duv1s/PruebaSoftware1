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
	}
}
