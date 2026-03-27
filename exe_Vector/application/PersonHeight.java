package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Persons;
public class PersonHeight {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many persons will be typed? ");
        int n = sc.nextInt();
        Persons[] vect = new Persons[n];

        double sum = 0.0;

        for (int i=0; i<vect.length; i++){
            System.out.println("\nDados da "+ (i+1) + "a pessoa: ");

            sc.nextLine();
            System.out.print("NAME: ");
            String name = sc.nextLine();

            System.out.print("AGE: ");
            int age = sc.nextInt();

            System.out.print("HEIGHT: ");
            double height = sc.nextDouble();

            vect[i] = new Persons(name, age, height);

            sum += vect[i].getHeight();
        }
        double cont = 0;

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getAge() < 16){
                cont++;
            }
        }



        double percentage = cont / vect.length * 100;

        double avg = sum/ vect.length;

        System.out.printf("\nAVERAGE HEIGHT = %.2f%n", avg);
        System.out.printf("Person minor than 16yo: %.2f%%%n", percentage);
        for (int i = 0; i < vect.length; i++){
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }



        sc.close();
    }
}
