package exercicio2;

import java.util.Scanner;

public class aInterface {

//métodos
    public int pegueCoordenadaX(int tipoPonto){
        System.out.print("Digite valor de X" + tipoPonto + " (APENAS NUMERO): ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        return x;
    }
    public  int pegueCoordenadaY(int tipoPonto){
        System.out.print("Digite valor de Y" + tipoPonto + " (APENAS NUMERO): ");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        return y;
    }
    public void mostreDistancia(double distancia){
        System.out.println("O resultado da distancia entre 2 pontos é: " + distancia);
    }

    public aInterface() {
        System.out.println(" == BEM VINDO A MELHOR CALCULADORA ==  ");
    }


    
}

