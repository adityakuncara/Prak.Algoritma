package object;

public class PacMan {
    int x; // koordinat x mendatar
    int y; // koordinat y vertikal
    int width;
    int height;
    
    void moveLeft(){
        if (x<=0){
            
        }else {
            x=x-1;
             System.out.println(x+" Bergerak ke kiri 1 kali");
        } 
    }
    void moveRight(){
        if(x>=width){
            
        }else {
            x=x+1;
            System.out.println(x+" Bergerak ke kanan 1 kali");
        } 
    }
    void moveUP(){
        if (y<=0){
            
        }else {
            y=y-1;
            System.out.println(y+ " Bergerak ke Atas 1 kali");
        } 
    }
    void moveDown(){
        if(y>=height){
            
        }else {
            y=y+1;
            System.out.println(y+" Bergerak ke Bawah 1 kali");
        } 
    }
    void printPosition(){
        System.out.println("X = " + x);
        System.out.println("Y = " + y);

    }
}