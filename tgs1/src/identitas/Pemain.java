package identitas;

public class Pemain {
    public Pemain() {
        
        pemainClub1 =   "Kiper\n" +
                        "Tom Heaton - 22\n" +
                        "Andre Onana - 24\n" +
                        "Dean Henderson - 26\n" +
                        "\n" +
                        "Belakang\n" +
                        "Victor Lindelof - 2\n" +
                        "Eric Bailly - 3\n" +
                        "Harry Maguire - 5\n" +
                        "Lisandro Martinez - 6\n" +
                        "Tyrell Malacia - 12\n" +
                        "Raphael Varane - 19\n" +
                        "Diogo Dalot - 20\n" +
                        "Luke Shaw - 23\n" +
                        "Jonny Evans - 27\n" +
                        "Aaron Wan-Bissaka - 29\n" +
                        "Brandon Williams - 33\n" +
                        "AlvaroFernandez - 42\n" +
                        "Teden Mengi - 43\n" +
                        "\n" +
                        "Tengah\n" +
                        "Mason Mount - 7\n" +
                        "Bruno Fernandes - 8\n" +
                        "Christian Eriksen - 14\n" +
                        "Amad Diallo - 16\n" +
                        "Fred - 17\n" +
                        "Casemiro - 18\n" +
                        "Facundo Pellistri - 28\n" +
                        "Donny van de Beek - 34\n" +
                        "Kobbie Mainoo - 37\n" +
                        "Scott McTominay - 39\n" +
                        "Hannibal Mejbri - 46\n" +
                        "\n" +
                        "Depan\n" +
                        "Anthony Martial - 9\n" +
                        "Marcus Rashford - 10\n" +
                        "Antony - 21\n" +
                        "Jadon Sancho - 25\n" +
                        "Shola Shoretire - 47\n" +
                        "Alejandro Garnacho - 49\n" +
                        "Rasmus Hojlund - 50";
        
        
        pemainClub2 =   "Kiper\n" +
                        "Ederson - 31\n" +
                        "Stefan Ortega - 18\n" +
                        "Zack Steffen - 13\n" +
                        "Scott Carson - 33\n" +
                        "\n" +
                        "Belakang\n" +
                        "Ruben Dias - 3\n" +
                        "Josko Gvardiol - 24\n" +
                        "Nathan Ake - 6\n" +
                        "John Stones - 5\n" +
                        "Manuel Akanji - 25\n" +
                        "Aymeric Laporte - 14\n" +
                        "Taylor Harwood-Bellis - 78\n" +
                        "Sergio Gomez - 21\n" +
                        "Joao Cancelo - 7\n" +
                        "Rico Lewis - 82\n" +
                        "Kyle Walker - 2\n" +
                        "\n" +
                        "Tengah\n" +
                        "Rodri - 16\n" +
                        "Kalvin Phillips - 4\n" +
                        "Maximo Perrone - 32\n" +
                        "Mateo Kovacic - 8\n" +
                        "James McAtee - 87\n" +
                        "Bernardo Silva - 20\n" +
                        "Kevin De Bruyne - 17\n" +
                        "Cole Palmer - 80\n" +
                        "\n" +
                        "Depan\n" +
                        "Phil Foden - 47\n" +
                        "Jack Grealish - 10\n" +
                        "Erling Haaland - 9\n" +
                        "Julian Alvarez - 19";
        
        
        pemainClub3 =   "Kiper\n" +
                        "Thibaut Courtois - 1\n" +
                        "Andriy Lunin - 13\n" +
                        "\n" +
                        "Belakang\n" +
                        "Dani Carvajal - 2\n" +
                        "Eder Militao - 3\n" +
                        "David Alaba - 4\n" +
                        "Nacho - 6\n" +
                        "Alvaro Odriozola - 16\n" +
                        "Lucas Vazquez - 17\n" +
                        "Fran Garcia - 20\n" +
                        "Antonio Rudiger - 22\n" +
                        "Ferland Mendy - 23\n" +
                        "\n" +
                        "Tengah\n" +
                        "Jude Bellingham - 5\n" +
                        "Toni Kroos - 8\n" +
                        "Luka Modric - 10\n" +
                        "Eduardo Camavinga - 12\n" +
                        "Federico Valverde - 15\n" +
                        "Aurelien Tchouameni - 18\n" +
                        "Dani Ceballos - 19\n" +
                        "Arda Guller - 24\n" +
                        "\n" +
                        "Depan\n" +
                        "Vinicius Junior - 7\n" +
                        "Rodrygo - 11\n" +
                        "Joselu - 14\n" +
                        "Brahim Diaz - 21";
    } 
    
    public String pemainClub1 = "";
    public String pemainClub2 = "";
    public String pemainClub3 = "";

    public Pemain(String pemainClub1, String pemainClub2, String pemainClub3) {
        this.pemainClub1 += pemainClub1;
        this.pemainClub2 += pemainClub2;
        this.pemainClub3 += pemainClub3;
    }
}
