package MidExam.MidExam_02;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployQuestionCount = Integer.parseInt(scanner.nextLine());
        int secondEmployQuestionCount = Integer.parseInt(scanner.nextLine());
        int thirdEmployQuestionCount = Integer.parseInt(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int hour = 0;
        while(countOfStudents > 0){
            hour ++;
            int studentsForHour = firstEmployQuestionCount + secondEmployQuestionCount + thirdEmployQuestionCount;
            if(hour % 4 == 0){

            }else{
                countOfStudents-=studentsForHour;
            }
        }
        System.out.printf("Time needed: %dh.", hour);
    }
}
