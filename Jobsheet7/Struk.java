/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author entercomp
 */
public class Struk {
    int size;
    int top;
    Tugas2 data[];
    
    public Struk (int size){
        this.size = size;
        data = new Tugas2[size];
        top = -1;
    }
    
    public boolean IsEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull (){
        if (top == size - 1 ){
            return true;
        } else {
            return false;
        }
    }
    public void push (Tugas2 tg) {
        if (!IsFull()){
            top++;
            data[top] = tg;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    
    public void pop (){
        if (!IsEmpty()){
            Tugas2 x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.nomorTransaksi + " " + x.tglPembelian + " " + x.jmlBarang + " " + x.totalBayar);
        } else {
            System.out.println("Stack masih kosong");
        }
    }public void print (){
            System.out.println("Isi Stack : ");
            for (int i = top; i >= 0; i--){
                System.out.println(data[i].nomorTransaksi + " " + data[i].tglPembelian + " " + data[i].jmlBarang + " " + data[i].totalBayar + " ");
            }
            System.out.println("");
    }
}
