// Diagonal Difference
//Ejercicio: https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.util.List;

public static int diagonalDifference(List<List<Integer>> arr) {
    int diaDerecha = 0;
    int diaIzquierda = 0;
    int size = arr.size()-1;
    for(int i = 0; i < arr.size(); i ++){
        diaDerecha+= arr.get(i).get(i);
        diaIzquierda += arr.get(i).get(size-i);
    }
    
    return Math.abs(diaDerecha - diaIzquierda);

}