/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alice
 */

public class App {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    
    public static void run(){
        System.out.println("Вас приветствует программа-тест на знание таблицы умножения");
        System.out.println("Решите 5 примеров");
        
        int q = 1;
        int mistake = 0;
        
        while (q<6) {            
            Random random = new Random();
            int num1 = random.nextInt(9-1+1)+1;
            int num2 = random.nextInt(9-1+1)+1;
            System.out.print(q+".  "+num1+" * "+num2+" = ");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            q++;
            if(answer == num1*num2){
                System.out.println(ANSI_GREEN + "Правильно" + ANSI_RESET);
            }else{
                System.out.println(ANSI_RED + "Ошибка" + ANSI_RESET);
                mistake++;
            }
        }
        
        System.out.println("-----------------------");
        switch(mistake){
            case 0:
                System.out.println("Молодец!");
                break;
            case 1: case 2:
                System.out.println("Надо бы еще поучить...");
                break;
            default:
                System.out.println("Срочно нужно учить таблицу умножения!!!");
                break;
        }
    }
}
