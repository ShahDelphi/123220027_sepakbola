package Menu;

public class Main {
    public static void main(String[] args) {
        identitas.Club clb = new identitas.Club();
        identitas.Pemain pmn = new identitas.Pemain();
        
        System.out.println("===================================");
        System.out.println("Squad dan Club Sepak Bola");
        System.out.println("===================================\n");
        
        //Man Utd
        System.out.println("Nama Club: " + clb.namaClub1 + "\n");
        System.out.println("Daftar Pemain : \n\n" + pmn.pemainClub1 + "\n");
        Klasemen rating1 = new Klasemen("||Win = 14|" + "|Draw = 2|" + "|Lose = 9||");
        rating1.show();
        System.out.println("===================================");
        
        //Man City
        System.out.println("Nama Club: " + clb.namaClub2);
        System.out.println("Daftar Pemain : \n\n" + pmn.pemainClub2 + "\n");
        Klasemen rating2 = new Klasemen("||Win = 17|" + "|Draw = 5|" + "|Lose = 3||");
        rating2.show();
        System.out.println("===================================");
        
        //Real Madrid
        System.out.println("Nama Club: " + clb.namaClub3);
        System.out.println("Daftar Pemain : \n\n" + pmn.pemainClub3 + "\n");
        Klasemen rating3 = new Klasemen("||Win = 19|" + "|Draw = 5|" + "|Lose = 1||");
        rating3.show();
        System.out.println("===================================");
    }
}
