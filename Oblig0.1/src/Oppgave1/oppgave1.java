package Oppgave1;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.function.*;

public class oppgave1 {

	public static void main(String[] args) {
		
		List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");
		
		Collections.sort(listen, (ein, to) -> Integer.valueOf(ein) - Integer.valueOf(to) );
		
		System.out.println(listen);
		
		System.out.println("Summen av 12 og 13 er: ");
		BiFunction<Integer, Integer, Integer> summer = (a, b) -> a + b;
		System.out.println(beregn(12, 13, summer));
		
		System.out.println("Den største av -5 og 3 er: ");
		BiFunction<Integer, Integer, Integer> størst = (a, b) -> Integer.max(a, b);
		System.out.println(beregn(-5, 3, størst));
		
		System.out.println("Avstanden mellom 54 og 45 er: ");
		BiFunction<Integer, Integer, Integer> avstand = (a, b) -> Math.abs(a - b);
		System.out.println(beregn(54, 45, avstand));
		

	}
	private static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> function) {
		
		return function.apply(a, b);
	}
	
//sum, greatest, difference
}

