public class Main {

    public static void main(String[] args)
    {
        int resultOne = add(1, 2);
        System.out.println(resultOne);

        String resultTwo = Greeting("human");
        System.out.println(resultTwo);

        int resultThree = add(1, 2, 3, 4);
        System.out.println(resultThree);

        String resultFour = printMe("Hello");
        System.out.println(resultFour);

    }

        public static int add(int numOne, int numTwo) {
            return numOne + numTwo;
        }


        public static String Greeting(String name) {
            String Greeting = "Bonjour, " + name + "!";
            return Greeting;

        }



        public static int add(int numOne, int numTwo, int numThree, int numFour) {

                int sumofnumOneTwo = add(numOne,numTwo);
                int sumofnumOneTwoThree = add(sumofnumOneTwo,numThree);
                int sumofnumOneTwoThreeFour = add(sumofnumOneTwoThree,numFour);
                return sumofnumOneTwoThreeFour;
            }

    public static String printMe(String tobePrinted) {
        String printMe = tobePrinted;
        return printMe;
        }





    }


