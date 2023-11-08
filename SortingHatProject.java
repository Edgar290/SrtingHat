import java.util.Scanner;

public class SortingHatProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Hogwarts! Let the Sorting Hat choose your house.");
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Answer the following questions with the a 'yes' or a 'no'. \nYou can only answer 'yes' to ONE of the questions:");
        //Bravery and Courage (Gryffindor):
        System.out.println("Do you value bravery and chivalry?");
        String q1 = scan.nextLine().toLowerCase();
        //Loyalty and Hard Work (Hufflepuff):
        System.out.println("Do you value hard work, dedication, and loyalty?");
        String q2 = scan.nextLine().toLowerCase();
        //Intelligence and Wisdom (Ravenclaw):
        System.out.println("Do you value intelligence, creativity, and learning?");
        String q3 = scan.nextLine().toLowerCase();
        //Ambition and Cunning (Slytherin):
        System.out.println("Do you value victory, with ambition?");
        String q4 = scan.nextLine().toLowerCase();

        if(q1.equals("yes") && q2.equals("no") && q3.equals("no") && q4.equals("no")){
            System.out.println("You, " + name + ", are a Gryffindor!");
        } else if (q1.equals("no") && q2.equals("yes") && q3.equals("no") && q4.equals("no")) {
            System.out.println("You, " + name + ", are a Hufflepuff!");
        } else if (q1.equals("no") && q2.equals("no") && q3.equals("yes") && q4.equals("no")) {
            System.out.println("You, " + name + ", are a ravenclaw!");
        } else if (q1.equals("no") && q2.equals("no") && q3.equals("no") && q4.equals("yes")){
            System.out.println("You, " + name + ", are a Slytherin!");
        } else {
            System.out.println("ERORR: YOU DIDNT FOLLOW INSTRUCTIONS!!!");
        }
    }
}


}




