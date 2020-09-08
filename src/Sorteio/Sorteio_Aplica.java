package Sorteio;

import java.util.*;

public class Sorteio_Aplica {
	
	public static void main (String args []) {
		
		Scanner read = new Scanner (System.in);
		
		int opt, size, value;
		
		System.out.println("Bem vindo ao sorteio !");
		System.out.print("Digite o tamanho da lista: ");
	    size = read.nextInt();
	    
	    Sorteio v = new Sorteio(size);
	    
	    do {
	        System.out.println("1-INSERE");
	        System.out.println("2-REMOVE");
	        System.out.println("3-EXIBIR LISTA");
	        System.out.println("4-SORTEAR");
	        System.out.println("5-FIM");
	        System.out.print("Digite o número: ");
	        opt = read.nextInt();
	        switch(opt){
	            case 1:
	                if(!v.isFull()){
	                System.out.print("Insira o valor: ");
	                value = read.nextInt();
	                v.insert(value);
	                    System.out.println("Inserido com sucesso !");
	                } else {
	                    System.out.println("Lista cheia !");
	                }
	                break;
	            case 2:
	                if(!v.isEmpty()) {
	                    v.remove();
	                    System.out.println("Item removido !");
	                } else {
	                    System.out.println("Lista vazia !");
	                }
	                break;
	            case 3:
	                if(v.isEmpty()){
	                    System.out.println("Lista vazia !");
	                }else {
	                    for(int i = 0; i <= v.getS(); i++){
	                        System.out.println(v.getValue(i));
	                    }
	                }
	                break;
	            case 4:
	            	if (v.isEmpty()) {
	            		System.out.println("Lista Vazia !");
	            	} else if (!v.isFull()) {
	            		System.out.println("Preencha a lista !");
	            	} else
	            		v.sort();
	            case 5:
	                break;
	            default:
	                System.out.println("Opção inválida !");
	        }
	    }while(opt != 5);
	    
	    }
		
	}
