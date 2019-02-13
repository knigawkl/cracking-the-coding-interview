package com.company;

public class Main {

    /*
    zaimplementuj algorytm okreslajacy czy lancuch zawiera tylko niepowtarzajce sie znaki
    nie mozna stosowac dodatkowych struktur danych
     */
    public static void main(String[] args) {
        System.out.println(areCharsUnique("ala"));
    }

    //zlozonosc czasowa - O(n), gdzie n to dlugosc lancucha znakow
    //zlozonosc pamieciowa to O(1)
    public static boolean areCharsUnique(String input) {
        if (input == null) {
            return true;
        }

        if (input.length() > 256) {
            return false; //w ascii mamy tylko 256 znakow, wiec jesli bedzie wiecej to cos musi sie powtarzac
        }

        boolean[] charSet = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }

    //jesli w sprawdznaym lancuchu znajduja sie tylko male litery z z przedzialu od a do z, mozna osmiokrotnie zmneijzyc zuzycie pamieci
    public static boolean areCharsUniqueConstrained(String input) {
        int checker = 0;
        for (int i = 0; i < input.length(); i++) {

        }
    }
}
