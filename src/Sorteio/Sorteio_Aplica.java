package Sorteio;

import java.util.*;
import javax.swing.*;

public class Sorteio_Aplica {
	
	//Construtor GUI
	
	Sorteio_Aplica(){
		JFrame f;
		
		f = new JFrame ();
		int num, num1;
		String saida = "";
		
		JOptionPane.showMessageDialog(f, "Bem vindo ao sorteio !");
		num = Integer.parseInt(JOptionPane.showInputDialog(f, "Digite o tamanho da lista: "));
		
		Sorteio v = new Sorteio(num);
		
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog(f, "1- INSERE\n"
					+ " 2- REMOVE\n"
					+ " 3- EXIBIR LISTA\n"
					+ " 4- SORTEAR\n"
					+ " 5- FIM\n"));
			if(num1 == 1 && !v.isFull()) {
				int temp = Integer.parseInt(JOptionPane.showInputDialog(f, "Digite o número"));
				v.insert(temp);
			} else if (num1 == 2 && !v.isEmpty()) {
				v.remove();
				JOptionPane.showMessageDialog(f, "Removido");
			} else if(num1 == 3) {
				for(int i = 0; i <= v.getS(); i++){
					saida += v.getValue(i);
                }
				JOptionPane.showMessageDialog(null, saida, "Números\n", JOptionPane.INFORMATION_MESSAGE);
			} else if (num1 == 4) {
				JOptionPane.showMessageDialog(f, "O número sorteado é: ");
				v.sort();
			}
	    }while(num1 != 5);		
	}
	
	public static void main (String args []) {
		
		new Sorteio_Aplica();
	     
	    }
		
	}
