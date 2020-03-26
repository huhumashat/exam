package exam;
import java.util.Scanner;
public class Exam{

public static void main(String[] args){
    String name;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What's your name?");
    name = keyboard.nextLine();
    System.out.println("Enter your answers below.\n");
    // 20 Question
    char[] answers = new char[20];
    // Answer for each question
    for(int i = 0; i < answers.length; i++){
            // get input until input is valid
            char input;
            do
                {
                    System.out.print(i + 1 + ". ");
                    // get character and make it upper case
                    input = Character.toUpperCase(keyboard.next().charAt(0));
                }
            while(input < 'A' || input >'D');
            // store answer
            answers[i] = input;
    }
    // print output here
    StudentExam grade = new StudentExam(answers) {};
    System.out.println();
    System.out.println("Hello "+ name);
    System.out.println("You "+(grade.passed()?"passed" : "did not pass") + ".\n");
    System.out.println("Correct: " + grade.totalCorrect() + "\n");
    System.out.println("Incorrect: " + grade.totalIncorrect() + "\n");

    int[] questionsMissed = grade.questionsMissed();
    if(questionsMissed.length > 0) {
        System.out.print("Questions missed: ");
        for(int i = 0; i < questionsMissed.length; i++)
                System.out.print(" " + questionsMissed[i]);
        System.out.println();
    }
    //Close Keyboard
    keyboard.close();
  }
}
