package org.tec.ce1103.proyecto2.codigo;

public class Calculadora {
	String operador;
	int v1;
	int v2;
	
	public void Calcular(String operador, int v1, int v2) {
		if (operador.equals("sumar")) {
			sumar(v1, v2);
			
		}else if(operador.equals("restar")) {
			restar(v1, v2);
		} else if (operador.equals("multiplcacion")) {
			multi(v1, v2);
		} else if (operador.equals("division")) {
			division(v1, v2);
		}
	}
	
	public int sumar(int var1, int var2) {
		int counter = 0;
		while(counter < var1) {
			counter++;
			var2++;
		}
		return var2;
	}
	
	public int restar(int var1, int var2) {
		int counter = var1;
		while(counter > 0) {
			counter--;
			var2--;
		}
		return var2;
	}
	
	public int multi(int var1, int var2) {
		int result = 0;
		for (int i = 0; i <= var1; i++) {
			 result += var2;
		}
		return result;
	}
	public int division(int var1, int var2) {
		int c = 0;
		int result = 0; 
		while(var1 >= var2) {
			var1 = var1 - var2;
			c++;
		}
		return result += c;
		
	}
}
