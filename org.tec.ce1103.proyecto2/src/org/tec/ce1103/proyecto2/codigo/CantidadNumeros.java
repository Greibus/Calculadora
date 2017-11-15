package org.tec.ce1103.proyecto2.codigo;

public class CantidadNumeros {
	int sumaNumeros;
	int cantidad;
	
	public int cantidad(int numero) {
		this.cantidad = 0;
		if (numero > 0) {
			while(numero != 0) {
				this.sumaNumeros = this.sumaNumeros + numero % 10;
				numero = numero/10;
				cantidad++;
			}
			return cantidad + sumaNumeros;
		} else {
			this.sumaNumeros = 0;
			return 0;
		}
	}
}



