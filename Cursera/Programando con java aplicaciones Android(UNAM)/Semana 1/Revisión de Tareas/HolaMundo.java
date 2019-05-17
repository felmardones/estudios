package com.bicolor.HolaMundo;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0; 									//Inicializo variable.
		int [][] miMatriz = new int[4][4];			//Declaro mi matrz de 4x4
			for(int j=3; j>=0;j--) {				//Inicio por la 4ta Fila
			System.out.println();					//Salto de linea cuando se completa una fila.
				for(int i=0; i<=3; i++){			//Llenado de datos.
					a = a+2;						//2, 4, 6, 8, 10....
					miMatriz[i][j] = a;				//Asigno valor de "a" al elemento de la matriz correspondiente.
					System.out.print(miMatriz[i][j]+" "); 	//imprimo el valor del ultimo elemento 
					if(j==3)						//en la 1era fila (j=3) se necesita 2 espacios para que quede ordenada la matriz. 
					System.out.print(" ");			//por eso se agrega un espacio extra para los elementos de la 1era fila.
				}
			}
		
		
	}

}
