package org.example;

public class Main {
    public static void main(String[] args) {
        int opc;
        Float n1, n2;
        Float r;
        opc = EntradaSalida.entradaInt("1 --> Hacer suma\n2 --> Hacer resta\n3 --> Hacer multiplicación\n4 --> Hacer división\n" +
                "5 --> Hacer raiz");

            if (opc>0 && opc<5) {
                n1 = EntradaSalida.entradaFloat("Teclee el primer número de la operación");
                n2 = EntradaSalida.entradaFloat("Teclee el segundo número de la operación");
                if(n1 == null || n2==null){
                    EntradaSalida.salida("Error: Sólo se aceptan números, no letras", EntradaSalida.SALIDA_CONSOLA);
                }

                r = Calculadora.calcular(opc, n1, n2);

                    if (Float.isNaN(r)) {
                    EntradaSalida.salida("ERROR: Resultado nulo", EntradaSalida.SALIDA_CONSOLA);
                    } else {
                    EntradaSalida.salida(("El resultado es: " + r), EntradaSalida.SALIDA_WINDOW);
                    }
            } else{
                if(opc==5){
                    do{
                        n1 = EntradaSalida.entradaFloat("Teclee el radicando (debe ser positivo):");
                        n2 = EntradaSalida.entradaFloat("Teclee el índice (debe ser positivo):");
                        if(n1 == null || n2==null){
                            EntradaSalida.salida("Error: Sólo se aceptan números, no letras", EntradaSalida.SALIDA_CONSOLA);
                        }
                    }while(n1<0 || n2<0);
                    r = Calculadora.calcular(opc, n1, n2);
                    EntradaSalida.salida(("El resultado es: " + r), EntradaSalida.SALIDA_WINDOW);
                }
                else{
                EntradaSalida.salida("Orden no encontrada",EntradaSalida.SALIDA_CONSOLA);}
            }
        }
    }