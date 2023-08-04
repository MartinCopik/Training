package training.ticTacToe;

import java.util.Scanner;

public class GamePiskvorky {
    public static int size = 3;
    public static String[][] ticTacToe = new String[size][size];
    public static int pocetMiest = size*size;
    public static String hrac1;
    public static String znakHracaX = "x";
    public static String hrac2;
    public static String znakHracaO = "O";
    static Scanner scan = new Scanner(System.in);
    public static String currentPlayer;
    public static String mapaHry = "ABCDEFGHI";
    public static String moveOfThePlayer;

    public static void  main(String[] args) {
        System.out.println("Hello players, welcome to the game tic-tac-toe");

//vlozenie zakladnej hodnoty
        ticTacToe[0][0] = "A";
        ticTacToe[0][1] = "B";
        ticTacToe[0][2] = "C";
        ticTacToe[1][0] = "D";
        ticTacToe[1][1] = "E";
        ticTacToe[1][2] = "F";
        ticTacToe[2][0] = "G";
        ticTacToe[2][1] = "H";
        ticTacToe[2][2] = "I";

//vypis matice
    vypisHry();
//volba znakov pre hracov
        System.out.println();
        vyberZnaku();
        System.out.println();
//vypis
        vypisHry();

        currentPlayer = hrac1;

        //herny cyklus
                while (pocetMiest> 0) {
                    inputUsera();
                    if (kontrolaVyhry(ticTacToe)){
                        break;
                    }
                    vypisHry();
                    if (currentPlayer.equals(hrac1)){
                        currentPlayer = hrac2;
                    }else {
                        currentPlayer = hrac1;
                    }
                }//end of the cyklus

        System.out.println("End of the Gameeeee");
    }
    static void vyberZnaku(){
        while (hrac2 == null){
            System.out.println("Hello player choose one only of the signs: " + znakHracaX + " or "+ znakHracaO);
            hrac1 = scan.next();
            if (hrac1.toUpperCase().equals(znakHracaO)){
                hrac2 = znakHracaX;
                System.out.println("Your sign is: " + hrac1+ " second player is: " +hrac2);
            }
            else if (hrac1.toLowerCase().equals(znakHracaX)){
                hrac2 = znakHracaO;
                System.out.println("Your sign is: " + hrac1 + " second player is: " +hrac2 );
            }
            else {
                System.out.println("Wrong choose, try again");
            }
        }
    }
    static void inputUsera() {
        //ivo: budeme porovnavat indexy s mapa s inputom od usera, pojde to do metody
        //String mapa = "ABCDEFGHI";
        //String moveOfThePlayer;
        do {
            kontrolaInputuHraca();
        }while (vkladHodnoty());
    }
    static boolean vkladHodnoty(){
        for (int x =0; x<size;x++){
            for (int u = 0; u<size;u++){
                if (moveOfThePlayer.toUpperCase().equals(ticTacToe[x][u])){
                    ticTacToe[x][u] = currentPlayer;
                    pocetMiest--;
                    return false;
                }
            }
        }
        return true;
    }
    static void kontrolaInputuHraca (){
            do {
                System.out.println("player : "+ currentPlayer + " choose your move");
                moveOfThePlayer = scan.next();
                System.out.println("move of the player is: "+ moveOfThePlayer);
                System.out.println();
            }while (kontrolaMapy());
    }
    static boolean kontrolaMapy(){
        for (int i = mapaHry.length()-1; i >= 0;i--){
            //String str  = mapaHry.substring(i); //od konkretneho indexu az po koniec stringu
            char znak = mapaHry.charAt(i);       //vytiahne iba konkretny index
            String pole = String.valueOf(znak);
            if (moveOfThePlayer.toUpperCase().equals(pole)){
                return false;
            }
        }
        return true;
    }
//do{
// System.out.println("player : "+ currentPlayer + " choose your move");
// moveOfThePlayer = scan.next();
// System.out.println("move of the player is: "+ moveOfThePlayer);
// System.out.println();}
//while(kontrolaMapy())

//vkladHodnoty()
    static boolean kontrolaVyhry (String[][] ticTacToe){
        if (riadky(ticTacToe, currentPlayer) || stlpce(ticTacToe,currentPlayer) || krizom(ticTacToe,currentPlayer)){
            return true;
        }
        return false;
    }
    static boolean krizom (String[][] ticTacToe, String player){
        if (krizLeftToRight(ticTacToe,player,0) || krizRightToLeft(ticTacToe,player,size-1)){
            return true;
        }
        return false;
    }

    static boolean krizLeftToRight (String[][] ticTacToe,String player, int u ){
        for (int x =0; x<size; x++){
            if (!ticTacToe[x][u].equals(player)){
                return false;
            }
            u++;
        }
        return true;
    }

    static boolean krizRightToLeft (String[][] ticTacToe,String player, int x ){
        for (int u = 0; u<size; u++){
            if (!ticTacToe[x][u].equals(player)){
                return false;
            }
            x--;
        }
        return true;
    }

    static boolean stlpce(String [][] ticTacToe, String player){
        //for(i;i< size;i++){stlpec();}
        //(true == true) == (true) || (true) == (true)
        //if(true || false)
        for (int u = 0; u<size;u++){
            if (stlpec(ticTacToe,player,u)){
                return true;
            }
        }
        return false;
    }

    static boolean stlpec (String[][] ticTacToe,String player,int u){
        for (int x = 0;x<size;x++){
            //String tmp = ticTacToe[x][u];
            if (!ticTacToe[x][u].equals(player)){
                return false;
            }
        }
        return true;
    }
    static boolean riadky(String[][] ticTacToe, String player){
        for (int x =0;x<size;x++){
            if (riadok(ticTacToe,player,x)){
                return true;
            }
        }
        return false;
    }

     static boolean riadok(String[][] ticTacToe,String player,int x){
        for (int u = 0; u<size; u++){
            if (!ticTacToe[x][u].equals(player)){
                return false;
            }
        }
        return true;
    }
     static void vypisHry(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ticTacToe[i][j]);
            }
            System.out.println();
        }
    }


}

