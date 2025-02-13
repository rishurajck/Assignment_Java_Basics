package org.example;


//Q3: Employee with Multiple Roles
//Create an interface Developer with:
//Method writeCode()
//Create another interface Tester with:
//Method testSoftware()
//Create a class SoftwareEngineer that:
//Implements both Developer and Tester.
//Overrides both methods.
//Demonstrate multiple inheritance by creating an instance.

    interface softwareDeveloper{
        void writeCode();
    }
    interface tester{
        void testSoftware();
    }

    class softwareEngineer implements softwareDeveloper, tester{
        @Override
        public void testSoftware() {
            System.out.println("The code is in testing phase!");
        }

        @Override
        public void writeCode() {
            System.out.println("The code is in Developing Phase!");
        }
    }
public class empRole {
    public static void main(String[] args) {
    softwareEngineer se = new softwareEngineer();
    se.testSoftware();
    se.writeCode();
    }
}
