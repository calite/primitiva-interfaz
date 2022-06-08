/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitiva_interfaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author daniel
 */
public class Primitiva {

  //metodo para generar un numeroGanador
  public ArrayList numeroGanador() {
    ArrayList<Integer> numeroGanador = new ArrayList<>(8);
    /*generamos un numero ganador aleatorio*/
    for (int i = 0; i < 8; i++) {
      int n2 = generaReintegro();
      int n1 = generaNumero();
      /*dependiendo de i, se almacena un numero o un reintegro*/
      if (i >= 7) {
        /*si existe el numero en el array, restamos uno a i*/
        if (numeroGanador.contains(n2)) {
          i--;
          continue;
        } else {
          /*sino existe se guarda*/
          numeroGanador.add(n2);
        }
      } else {
        if (numeroGanador.contains(n1)) {
          i--;
          continue;
        } else {
          numeroGanador.add(n1);
          /*ordenamos el array, el reintegro mantiene posicion.*/
          Collections.sort(numeroGanador);
        }

      }
    }
    return numeroGanador;
  }
  
  public static int generaNumero() {
    Random generadorAleatorios = new Random();
    int aleatorio = generadorAleatorios.nextInt(49) + 1;
    //int aleatorio = (int) (Math.random() * (49 - 1) + 1);
    return aleatorio;
  }

  public static int generaReintegro() {
    Random generadorAleatorios = new Random();
    int aleatorio = generadorAleatorios.nextInt(10);
    //int aleatorio = (int) (Math.random() * 9);
    return aleatorio;
  }

}
