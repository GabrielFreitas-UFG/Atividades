/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.util.Scanner;
import javax.swing.text.html.HTML;

/**
 *
 * @author Gabriel Freitas
 */
public class Programa {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        Horario hora1 = null;
        Horario hora2 = null;

        System.out.println("DIGITE O PRIMEIRO HARARIO: HH MM SS");
        hora1 = new Horario(imput.nextInt(), imput.nextInt(), imput.nextInt());

        System.out.println("DIGITE O SEGUNDO HARARIO: HH MM SS");
        hora2 = new Horario(imput.nextInt(), imput.nextInt(), imput.nextInt());

        if (Horario.Hora(hora1.getH()) && Horario.Min(hora1.getM()) && Horario.Seg(hora1.getS()) == true) {
            System.out.println("PRIMEIRO HORARIO VALIDO");
        } else {
            System.out.println("PRIMEIRO HORARIO INVALIDO");
        }
        if (Horario.Hora(hora2.getH()) && Horario.Min(hora2.getM()) && Horario.Seg(hora2.getS()) == true) {
            System.out.println("SEGUNDO HORARIO VALIDO");
        } else {
            System.out.println("SEGUNDO HORARIO INVALIDO");
        }

        System.out.println("Horario 1: " + hora1.toString());
        System.out.println("Horario 2: " + hora2.toString());
        System.out.println("DIFERENCA: " + Horario.Diferenca(hora1, hora2) + "min");

    }

}
