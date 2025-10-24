package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

public static void insertSort(int[] vetor){
    int indiceOrdenado = 0;
    for(int indice =1; indice < vetor.lenght; indice ++){
        int indiceDesordenado = indice;
        
        int indiceOrdAux = indiceOrdenado;
        while (indiceDesordenado > 0){
            if (vetor[indiceDesordenado] < vetor[indiceOrdAux])
                int desordenado = vetor [indiceDesordenado];

                vetor[indiceDesordenado] = vetor [indiceOrdAux];
                vetor[indiceOrdAux] = desordenado;
        }
        indiceDesordenado--;
        indiceOrdAux--;
    }
    indiceOrdenado++;
    System.out.println(Arrays.toString(vetor));

}