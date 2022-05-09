import java.util.Scanner;

public class ChatBot{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        greeting();
        repeatName();
        guessAge();
        countNum();
        testQ();
    }
    public static void greeting (){
        Scanner scan = new Scanner(System.in);

        System.out.println("I'm Yo Mama the chatbot. Tell Yo Mama yo name.");
        String name = scan.nextLine();
    }
    public static void repeatName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls repeat yo name for Yo Mama.");
        String repeatName= scan.nextLine();
        System.out.println("Nice to meet you " + repeatName + "!");
    }
    public static void guessAge(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Now let Yo Mama guess yo age.");
        System.out.println("Enter a whole, positive number from 1 - 10 pls.");

        int num = Integer.valueOf(scan.nextLine());
         int number = ((num * 2) + 5)* 50;
         System.out.println(number);

         System.out.println("Did the day Yo Mama brought you onto this planet pass already?");
         String birthdayPass=scan.nextLine();

         if( birthdayPass.equals("yes")){
             int age = number + 1772;
             System.out.println(age);
             System.out.println("What year were you born?");
             int birthYear= Integer.valueOf(scan.nextLine());
             int correctAge= Integer.valueOf((age-birthYear)% 100);
             System.out.println("You are " + correctAge);
         }else{
             int age = number + 1771;
             System.out.println(age);
             System.out.println("What year were you born?");
             int birthYear= Integer.valueOf(scan.nextLine());
             int correctAge= Integer.valueOf((age-birthYear)% 100);
             System.out.println("You are " + correctAge + ".");
         }
         
         System.out.println("Am I correct?");
         String guessingAge = scan.nextLine();

         if(guessingAge.equals("yes")|| guessingAge.equals("yeah")||guessingAge.equals("y")||guessingAge.equals("yelp")){
            System.out.println("Nice! I got it right!");
         }else{
             System.out.println("Oh darn!");
         }

        }
        public static void countNum(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Now, enter a whole, positive number so Yo Mama can count up to it for you.");
            int countNum = Integer.valueOf(scan.nextLine());

            for (int i = 1; i< countNum+1; i++ )
            System.out.println(i);
        }
        public static void testQ(){
            Scanner scan = new Scanner(System.in);
           
             System.out.println("Which of these data types best describes Yo Mama's name?");
             System.out.println("A: string");
             System.out.println("B: byte");
             System.out.println("C: integer");
             System.out.println("D: boolean");

             while (true)
             {
                 String answer = scan.nextLine();
                 if ( answer.equals("A")|| answer.equals("a")){
                     break;
                 }
                 else System.out.println("Try again for Yo Mama.");
             }
             System.out.println("Yo Mama is pleased. Nice.");
        }
    
    }