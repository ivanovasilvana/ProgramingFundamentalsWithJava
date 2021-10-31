package Methods_04.Exc;

import java.util.*;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String command = input.split("\\s+")[0];
            if (command.equals("exchange")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                if (index < 0 || index >= numbers.length) {
                    System.out.println("Invalid index");

                } else {
                    numbers = exchange(numbers, index);
                }
            } else if (command.equals("max")) {
                String evenOrOdd = input.split("\\s+")[1];
                if (evenOrOdd.equals("even")) {
                    maxEven(numbers);
                } else if (evenOrOdd.equals("odd")) {
                    maxOdd(numbers);
                }
            } else if (command.equals("min")) {
                String evenOrOdd = input.split("\\s+")[1];
                if (evenOrOdd.equals("even")) {
                    minEven(numbers);
                } else if (evenOrOdd.equals("odd")) {
                    minOdd(numbers);
                }
            } else if (command.equals("first")) {
                int count = Integer.parseInt(input.split("\\s+")[1]);
                if (count < 0 || count > numbers.length) {
                    System.out.println("Invalid count");
                } else {

                    String evenOrOdd = input.split("\\s+")[2];
                    if (evenOrOdd.equals("even")) {
                        firstEven(numbers, count);
                    } else if (evenOrOdd.equals("odd")) {
                        firstOdd(numbers, count);
                    }
                }
            } else if (command.equals("last")) {
                int count = Integer.parseInt(input.split("\\s+")[1]);
                if (count < 0 || count > numbers.length) {
                    System.out.println("Invalid count");

                } else {
                    String evenOrOdd = input.split("\\s+")[2];
                    if (evenOrOdd.equals("even")) {
                        lastEven(numbers, count);
                    } else if (evenOrOdd.equals("odd")) {
                        lastOdd(numbers, count);
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] exchange(int[] numbers, int index) {
        int[] firstArray = new int[index + 1];
        int[] secondArray = new int[numbers.length - index - 1];
        int[] result = new int[numbers.length];

        for (int i = 0; i <= index; i++) {
            firstArray[i] = numbers[i];
        }

        for (int i = 0; i < numbers.length - index - 1; i++) {
            secondArray[i] = numbers[i + index + 1];
        }

        for (int i = 0; i < secondArray.length; i++) {

            result[i] = secondArray[i];
        }
        for (int i = result.length - index - 1, j = 0; i < result.length; i++, j++) {
            result[i] = firstArray[j];
        }
        return result;
    }

    public static void maxEven(int[] numbers) {
        int maxEvenNumber = 0;
        int maxEvenIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                int currentMaxNumber = numbers[i];
                if (currentMaxNumber >= maxEvenNumber) {
                    maxEvenNumber = currentMaxNumber;
                    maxEvenIndex = i;
                }
            }
        }
        if (maxEvenIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(maxEvenIndex);

        }
    }

    public static void maxOdd(int[] numbers) {
        int maxOddNumber = 0;
        int maxOddIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                int currentMaxNumber = numbers[i];
                if (currentMaxNumber >= maxOddNumber) {
                    maxOddNumber = currentMaxNumber;
                    maxOddIndex = i;
                }
            }
        }
        if (maxOddIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(maxOddIndex);
        }
    }

    public static void minEven(int[] numbers) {
        int minEvenNumber = Integer.MAX_VALUE;
        int minEvenIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                int currentMinNumber = numbers[i];
                if (currentMinNumber <= minEvenNumber) {
                    minEvenNumber = currentMinNumber;
                    minEvenIndex = i;
                }
            }
        }
        if (minEvenIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(minEvenIndex);
        }
    }

    public static void minOdd(int[] numbers) {
        int minOddNumber = Integer.MAX_VALUE;
        int minOddIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                int currentMinNumber = numbers[i];
                if (currentMinNumber <= minOddNumber) {
                    minOddNumber = currentMinNumber;
                    minOddIndex = i;
                }
            }
        }
        if (minOddIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(minOddIndex);
        }
    }

    public static void firstEven(int[] numbers, int count) {
        int index = 0;
        int[] firstEvenCountElement = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                firstEvenCountElement[index] = numbers[i];
                index++;
                if (index >= count) {
                    break;
                }
            }
        }
        if (index == 0) {
            System.out.println("[]");
        } else {
            String output = "[";
            for (int i = 0; i < index; i++) {
                if (i < index - 1) {
                    output += firstEvenCountElement[i] + ", ";
                } else{
                    output += firstEvenCountElement[i] + "]";
                }
            }
            System.out.println(output);
        }

    }

    public static void firstOdd(int[] numbers, int count) {

        int[] firstOddCountElement = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0) {
                firstOddCountElement[index] = numbers[i];
                index++;
                if (index >= count) {
                    break;
                }
            }
        }
        if (index == 0) {
            System.out.println("[]");
        } else {
            String output = "[";
            for (int i = 0; i < index; i++) {
                if (i < index - 1) {
                    output += firstOddCountElement[i] + ", ";
                } else {
                    output += firstOddCountElement[i] + "]";
                }
            }
            System.out.println(output);
        }
    }

    public static void lastEven(int[] numbers, int count) {
        int index = 0;
        int[] lastEvenCountElement = new int[count];

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0) {
                lastEvenCountElement[index] = numbers[i];
                index++;
                if (index >= count) {
                    break;
                }
            }
        }
        if (index == 0) {
            System.out.println("[]");
        } else {
            String output = "[";
            for (int i = index - 1; i >= 0; i--) {
                if (i > 0) {
                    output += lastEvenCountElement[i] + ", ";
                } else {
                    output += lastEvenCountElement[i] + "]";
                }
            }
            System.out.println(output);
        }
    }

    public static void lastOdd(int[] numbers, int count) {
        int index = 0;
        int[] lastOddCountElement = new int[count];

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0) {
                lastOddCountElement[index] = numbers[i];
                index++;
                if (index >= count) {
                    break;
                }
            }
        }
        if (index == 0) {
            System.out.println("[]");
        } else {
            String output = "[";
            for (int i = index - 1; i >= 0; i--) {
                if (i > 0) {
                    output += lastOddCountElement[i] + ", ";
                } else {
                    output += lastOddCountElement[i] + "]";
                }
            }
            System.out.println(output);
        }
    }
}