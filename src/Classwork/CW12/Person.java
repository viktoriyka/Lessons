package Classwork.CW12;


    public class Person {
        private String name = "name";

        private String surname = "default surname";

        private int age = 16;

        public Person(String n, int a) {

            name = n;
            age = a;
        }

        private void printData(String name, String surname, int age) {
            System.out.println(name + " " + surname + " " + age);
        }


    }

