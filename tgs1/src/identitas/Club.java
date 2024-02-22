package identitas;

public class Club {
    public Club() {
        namaClub1 = "Manchester United";
        namaClub2 = "Manchester City";
        namaClub3 = "Real Madrid";
    } 
    
    public String namaClub1 = "";
    public String namaClub2 = "";
    public String namaClub3 = "";

    public Club(String namaClub1,String namaClub2, String namaClub3) {
        this.namaClub1 += namaClub1;
        this.namaClub2 += namaClub2;
        this.namaClub3 += namaClub3;
    }
}
