package org.example;

public class Calculadora {
    private static Float RESULTADO = null;
    static final int SUMA = 1;
    static final int RESTA = 2;
    static final int MULTIPLICACION = 3;
    static final int DIVISION = 4;

    /**
     * @param device --> operando deseado (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN)
     * @param n1 --> primer número de la operación
     * @param n2 --> segundo número de la operación (divisor de ser division)
     * @return resultado
     */
    public static Float calcular(int device, float n1, float n2){

        switch (device){
            case SUMA:
                try{
                    RESULTADO = n1 + n2;
                }catch (Exception e){
                    System.out.println("ERROR");
                }
                break;
            case RESTA:
                try{
                    RESULTADO = n1 - n2;
                }catch (Exception e){
                    System.out.println("ERROR");
                }
                break;
            case MULTIPLICACION:
                try{
                    RESULTADO = n1*n2;
                }catch (Exception e){
                    System.out.println("ERROR");
                }
                break;
            case DIVISION:
                try{
                    RESULTADO = n1/n2;
                }catch (Exception e){
                    System.out.println("ERROR");
                }
                break;
        }
        return RESULTADO;
    }
}
