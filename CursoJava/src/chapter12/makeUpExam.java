package chapter12;

import java.util.HashMap;
import java.util.Map;

public class makeUpExam {
	public static void main(String args[]) {
//		quiz1();
//		quiz2();
		System.out.println(quizComparator(quiz1(), quiz2()));
		
		
	}
	
	public static Map<String, Integer >quiz1(){
		Map<String, Integer> quiz1 = new HashMap<String, Integer>();
		quiz1.put("Miguel", 75);
		quiz1.put("Ana", 55);
		quiz1.put("Vero", 83);
		quiz1.put("Daniel", 80);
		quiz1.put("David", 92);
		
		for(var entry : quiz1.entrySet()) {
			System.out.println("La calificación del primer examen de " + entry.getKey() + " fue de " + entry.getValue());
		}
		System.out.println("");
		return quiz1;
		
	}
	
	
	
	public static Map<String, Integer >quiz2(){
		Map<String, Integer> quiz2 = new HashMap<String, Integer>();
		quiz2.put("Miguel", 90);
		quiz2.put("Ana", 59);
		quiz2.put("Vero", 82);
		quiz2.put("Daniel", 90);
		quiz2.put("David", 99);
		
		for(var entry : quiz2.entrySet()) {
			System.out.println("La calificación del segundo examen de " + entry.getKey() + " fue de " + entry.getValue());
		}
		
		System.out.println("");
		return quiz2;
		
	}
	
	
	public static Map<String, Integer> quizComparator(Map<String, Integer>quiz1, Map<String,Integer>quiz2){
		Map<String, Integer> newQuizGrade = new HashMap<>(quiz1);
		quiz2.forEach((key,value) -> newQuizGrade.merge(key,value, Math::max));
		/*
		 * Aquí se utilizó Math::max porque esa función toma dos valores y regresa el más alto.
		 * Como aquí key ya tiene un valor (quiz1 inicializado en newquiz)
		 * entonces compara el nuevo valor (value) con ese para sacar el de mayor cantidad
		 */
		
		
		return newQuizGrade;
		
	}
}
