package object;

public class PacMan_main {
    public static void main (String [] args){
        PacMan pm=new PacMan();
        pm.x=10;
        pm.width=20;
        pm.y=5;
        pm.height=10;
        pm.moveLeft();
        pm.moveRight();
        pm.moveDown();
        pm.moveUP();
        pm.printPosition();
        
    }
}