package Sorteio;

import java.util.*;

public class Sorteio {
	
	public int v[];
    public int size;
    public int s;
    
    Random r = new Random();
    
    Sorteio(int tam) {
        size = tam;
        v = new int[size];
        s = -1;
    }
    
    public void insert(int x){
        s++;
        v[s] = x;
    }
    
    public int remove(){
        int temp = v[s];
        s--;
        return temp;
    }
    
    public int getS(){
        return v[s];
    }

    public boolean isFull(){
        return s == getSize() - 1;
    }
    
    public boolean isEmpty(){
        return s == -1;
    }
    
    public int getValue(int pos){
        return v[pos];
    }

    public int getSize() {
        return size;
    }
    
    public void sort() {
    	for (int i = 0; i < 1; i++) {
    		int number = r.nextInt( getSize());
    		System.out.println("O numero sorteado: " + getValue(number));
    	}
    }
}
