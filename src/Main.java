import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = in.nextLine();

        System.out.print("Enter the city where you are located: ");
        String locate = in.nextLine();

        System.out.print("Enter Your age: ");
        String str;
        int age;
        while(true) {
            str = in.nextLine();
            try {
                age = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.err.print(str + " not age!!! Please enter integer: ");
            }
        }
        System.out.print("Enter Your hobby: ");
        String hobby = in.nextLine();
        //output1
        System.out.println();
        System.out.println("Name:       " + name);
        System.out.println("City:       " + locate);
        System.out.println("Age:        " + age);
        System.out.println("Hobby:      " + hobby);
        ///output2
        System.out.println();
        System.out.println("A man named " + name + " lives in the city "+ locate + ".\nThis person " + age +" years and he loves to engage in " + hobby +".");
        //output 3
        System.out.println();
        System.out.println(name + " - Name");
        System.out.println(locate + " - City");
        System.out.println(age + " - Age");
        System.out.println(hobby + " - Hobby");
    }
}
