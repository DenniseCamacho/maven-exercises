import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something: ");
        String input = scan.nextLine();
        System.out.printf("You entered %s%n", input);

        if(StringUtils.isNumeric(input)){
            System.out.println("%d is the boolean because I am a number");
        }else{
            System.out.println(input + " is not the boolean because I am not a number");
        }

    }
}
