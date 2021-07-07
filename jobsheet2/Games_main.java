package object;

import java.util.Scanner;

public class Games_main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Games gm=new Games();
        gm.harga=50000;
        gm.data();
        gm.output(); 
    }
}