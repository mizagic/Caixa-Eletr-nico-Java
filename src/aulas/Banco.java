/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulas;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author deividi-silva
 */
public class Banco {

    public static void main(String[] args) {
        String nome;
        double inicial;

        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        
        int numeroConta = 1 + numero.nextInt(9999);

        System.out.println("Cadastrando novo cliente.");
        System.out.print("Entre com seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();
        
        Conta minhaConta = new Conta(nome, numeroConta, inicial);
        minhaConta.exibeMenu();

    }

}
