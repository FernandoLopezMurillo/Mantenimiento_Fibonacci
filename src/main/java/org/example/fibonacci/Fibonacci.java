package org.example.fibonacci;

/**
 * Class providing a method which function is to compute the number
 * inside the Fibonacci sequence of a given position.
 *
 * Clase que proporciona un método cuya función es calcular el número
 * de la serie de fibonacci de una posición dada.
 */


public class Fibonacci {
    public int compute(int value) {
        if (value < 0){
            throw new RuntimeException("Fibonacci of a negative number " + value);
        }

        int resultZero = 0;
        int resultOne = 1;
        int result = 0;
        if(value == 0){
            result = 0;
        } else if (value == 1){
            result = 1;
        } else {
            for(int i=2; i<=value; i++){
                result = resultZero + resultOne;
                resultZero = resultOne;
                resultOne = result;
            }
        }
        return result;
    }
}
