/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instancia un objeto Scanner
        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        try {
            // Introduce el número del dia de la semana
            System.out.print("Número del día de la semana: ");
            int numDia = scn.nextInt();
            scn.nextLine();

            // Analiza el dia introducido
            String nomDia;
            switch (numDia) {
                case 1:
                    nomDia = "lunes";
                    break;
                case 2:
                    nomDia = "martes";
                    break;
                case 3:
                    nomDia = "miércoles";
                    break;
                case 4:
                    nomDia = "jueves";
                    break;
                case 5:
                    nomDia = "viernes";
                    break;
                case 6:
                    nomDia = "sábado";
                    break;
                case 7:
                    nomDia = "domingo";
                    break;
                default:
                    nomDia = "indefinido";
            }

            // Muestra el nombre del dia de la semana
            System.out.printf("Nombre del dia de la semana: %s\n", nomDia);
        } catch (Exception e) {
            System.out.println(">>> Error de entrada");
        }
    }
}
