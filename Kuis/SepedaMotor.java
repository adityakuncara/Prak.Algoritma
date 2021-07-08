public class SepedaMotor {
    public String merk;
    public int kecepatanMotor;
    public boolean kontakMotor = false;
    
    SepedaMotor(){
        
    }
    
    SepedaMotor
(String merk){
        this.merk = merk;
    }
    
    void nyalakanMotor(boolean kontak){
        kontakMotor = kontak;
    }
    
    void matikanMotor(boolean kontak){
        kontakMotor = kontak;
    }
    
    void tambahKecepatanMotor(int kec){
        this.kecepatanMotor += kec;
    }
    
    void kurangiKecepatanMotor(int kec){
        
            this.kecepatanMotor -= kec;
    }
    
    void info(){
        
        System.out.println("KECEPATAN : " + kecepatanMotor);
    }
}