/*
Name: Evan Yango
Date: 10/2/25
Description: shuffles a playlist in a random order
*/

import java.util.Scanner;

public class ShufflePlaylist {
    public static Scanner scanner = new Scanner(System.in);

    public static void shuffle(String[] playlist) {
        for (int i = 0; i < playlist.length - 1; i++) {
            int j = (int)(Math.random() * playlist.length);

            // swap i and j
            String temp = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = temp;
        }
    } 

    public static void main(String[] args) {
        String[] playlist = {
            "Shake It Off - Taylor Swift",
            "I Love You - Barney",
            "Baby Shark - Pinkfong",
            "Never Gonna Give You Up - Rick Astley",
            "Axel F (Crazy Frog) - Crazy Frog",
            "Gangnam Style - PSY",
            "What Does the Fox Say? - Ylvis"
        };

        shuffle(playlist);
        for (int i = 0; i < playlist.length; i++) {
            System.out.println(i + 1 + ". " + playlist[i]);
        }
    }
}