package HW1;

public class FooBar {
        public static void main (String [] args){
            for (int i=1; i<=15;i++){

                if (i % 3 == 0)
                    System.out.println("foo");
                if (("" + i).contains("3"))
                    System.out.println("foo");

                if (i % 5 == 0)
                    System.out.println("bar");
                if (("" + i).contains("5"))
                    System.out.println("bar");

                if (i % 7 == 0)
                    System.out.println("qix");
                if (("" + i).contains("7"))
                    System.out.println("qix");

                else System.out.println(i);



            }
        }
    }

