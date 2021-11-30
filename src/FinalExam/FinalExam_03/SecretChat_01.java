package FinalExam.FinalExam_03;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder concealedMessage = new StringBuilder(scanner.nextLine());


        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] tokens = input.split(":\\|:");
            String command = tokens[0];
            if (command.equals("InsertSpace")) {
                int index = Integer.parseInt(tokens[1]);
                concealedMessage.insert(index, " ");
                System.out.println(concealedMessage);
            } else if (command.equals("Reverse")) {
                StringBuilder substring = new StringBuilder(tokens[1]);
                int index = concealedMessage.indexOf(substring.toString());
                if (index >= 0){
                    int startIndex = index;
                    int endIndex = index + substring.length();
                    concealedMessage.delete(startIndex, endIndex);
                   concealedMessage.append(substring.reverse());
                    System.out.println(concealedMessage);
                }else{
                    System.out.println("error");
                }
            }else if(command.equals("ChangeAll")){
                String substring = tokens[1];
                String replacement = tokens[2];
                int index = concealedMessage.indexOf(substring);
                while (index >= 0){
                    int start = index;
                    int end = index + substring.length();
                    concealedMessage.replace(start, end, replacement);
                    index = concealedMessage.indexOf(substring);
                }
                System.out.println(concealedMessage);
            }


            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + concealedMessage);
    }
}
