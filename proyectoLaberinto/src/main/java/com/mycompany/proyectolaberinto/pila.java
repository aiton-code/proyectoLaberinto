package com.mycompany.proyectolaberinto;

public class pila {
    private Nodo cima;
    private int tamanio;

    public pila() {
        this.cima = null;
        this.tamanio = 0;
    }

    public void push(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.conectar(cima);
        cima = nuevoNodo;
        tamanio++;
    }

    public Object pop() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        Object dato = cima.extraer();
        cima = cima.obtenerReferencia();
        tamanio--;
        return dato;
    }

    public Object peek() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return cima.extraer();
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public int size() {
        return tamanio;
    }   
}
