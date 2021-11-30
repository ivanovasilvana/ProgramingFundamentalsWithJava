package FinalExam.FinalExam_02;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        StringBuilder planedStops = new StringBuilder(stops);
        String tokens = scanner.nextLine();

        while (!tokens.equals("Travel")){
            String command = tokens.split(":")[0];
            switch (command){
                case "Add Stop":
                    int index = Integer.parseInt(tokens.split(":+")[1]);
                    String textToAdd = tokens.split(":+")[2];
                    String firstHalf = stops.substring(0, index);
                    String secondHalf = stops.substring(index);
                    stops = firstHalf + textToAdd + secondHalf;
                    planedStops = new StringBuilder(stops);
                    System.out.println(planedStops);
                    break;

                case "Remove Stop":
                    int startIndex = Integer.parseInt(tokens.split(":+")[1]);
                    int endIndex = Integer.parseInt(tokens.split(":+")[2]);
                    if (startIndex >= 0 && endIndex < planedStops.length() && startIndex <= endIndex){
                        planedStops.delete(startIndex, endIndex + 1);
                    }
                    System.out.println(planedStops);
                    break;

                case "Switch":
                    String oldText = tokens.split(":+")[1];
                    String newText = tokens.split(":+")[2];
                    int oldTextStart = planedStops.indexOf(oldText);
                    int oldTextStop = planedStops.indexOf(oldText) + oldText.length() ;

                    if (oldTextStart > -1){
                        planedStops.delete(oldTextStart, oldTextStop);
                        planedStops.insert(oldTextStart, newText);
                    }
                    System.out.println(planedStops);
                    break;
            }

            tokens = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + planedStops);
    }
}
