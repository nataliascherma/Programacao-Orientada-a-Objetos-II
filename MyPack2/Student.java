package MyPack2;

import MyPack1.Person;

public class Student extends Person {
    private int graduationYear = 2018;

        public void Details() {
            System.out.println("Name: " + fname + " " + lname);
            System.out.println("Email: " + email);
            System.out.println("Age: " + age);
            System.out.println("Graduation Year: " + graduationYear);
        }
    }

