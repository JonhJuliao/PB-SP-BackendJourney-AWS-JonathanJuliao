import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int right = 0;
        int wrong = 0;
        String [] questions = new String[10];
        int[] answers = new int[10];
        questions[0] = "121 Divided by 11 is:";
        answers[0] = 11;
        questions[1] = "60 Times of 8 Equals to:";
        answers[1] = 480;
        questions[2] = "What is the Next Prime Number after 7?";
        answers[2] = 11;
        questions[3] = "The Product of 131 × 0 × 300 × 4 is:";
        answers[3] = 0;
        questions[4] = "Solve 3 + 6 × ( 5 + 4) ÷ 3 - 7:";
        answers[4] = 14;
        questions[5] = "Solve 23 + 3 ÷ 3:";
        answers[5] = 24;
        questions[6] = "How Many Years are there in a Decade?";
        answers[6] = 10;
        questions[7] = "How Many Months Make a Century?";
        answers[7] = 1200;
        questions[8] = "How Many Sides are there in a Decagon?";
        answers[8] = 10;
        questions[9] = "What is the product of 121 x 0 x 20 x 2.5?";
        answers[9] = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Math Quiz!");
        System.out.println("You will answer 10 basic math questions! Your answer must be a number, don't write any word");
        System.out.println("First say your name:");
        String name = sc.nextLine();
        for(int i = 0; i < 10; i++){
            System.out.println("Question " + i + 1);
            System.out.println(questions[i]);
            int answer = sc.nextInt();
            sc.nextLine();
            if(answer == answers[i]){
                System.out.println("Great, you're right!");
                right++;
            }else{
                System.out.println("Sorry, you're wrong!");
                wrong++;
            }
        }
        System.out.println("User: " + name);
        System.out.println("Right: " + right);
        System.out.println("Wrong: " + wrong);
    }
}