package ObjectsAndClasses_06.Lab.Songs_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int songsNumber = Integer.parseInt(scanner.nextLine());
        List<Songs> listSong = new ArrayList<>();
        for (int i = 0; i < songsNumber; i++) {
            String data = scanner.nextLine();
            String type= data.split("_")[0];
            String name = data.split("_")[1];
            String time = data.split("_")[2];
            Songs songs = new Songs(type, name, time);
            listSong.add(songs);
        }
        String typeList = scanner.nextLine();
        if (typeList.equals("all")){
            for (Songs songs : listSong) {
                System.out.println(songs.getName());
            }
        }else{
            for (Songs songs : listSong) {
                if (songs.getType().equals(typeList)){
                    System.out.println(songs.getName());
                }
            }
        }
    }
}
