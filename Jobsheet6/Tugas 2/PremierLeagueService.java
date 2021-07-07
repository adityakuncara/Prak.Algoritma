public class PremierLeagueService {
    public PremierLeague[] leagues = new PremierLeague[20];
    public int ctx;
    
    void tambah(PremierLeague m){
        if(ctx < leagues.length){
            leagues[ctx] = m;
            ctx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampilAll(){
        for(PremierLeague m : leagues){
            System.out.println(m.team + "  " + m.play + "  " + m.goal + "  " + m.points);
        }
    }
    
    void insertionSort(boolean asc){
        if(asc == true){
            for(int i=1;i<leagues.length;i++){
                PremierLeague temp = leagues[i];
                int j = i;
                while(j>0 && leagues[j-1].points > temp.points){
                    leagues[j] = leagues[j-1];
                    j--;
                }
                leagues[j] = temp;
            }
        }else{
            tampilAll();
        }
    }
}