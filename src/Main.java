import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Euro to Dollar converter

        double euro = 1.00;
        double usDollar = 1.04;
        double albanianLek = 116.90;
        double roebel = 2.61;


//        while(true){
//
//            Scanner userInput = new Scanner(System.in);
//            System.out.println("What do you want to convert? For Euro to Dollar, type 1. For Dollar to Euro, type 2.");
//            int userChoice = userInput.nextInt();
//
//            Scanner currencyInput = new Scanner(System.in);
//
//            if (userChoice == 1) {
//
//                System.out.println("What is the amount of Euro to convert: ");
//                int amountEuro = currencyInput.nextInt();
//                System.out.println("This is exactly " + amountEuro * usDollar + " US Dollar");
//
//
//            } else if (userChoice == 2) {
//                System.out.println("What is the amount of Dollar to convert: ");
//                int amountDollar = currencyInput.nextInt();
//                System.out.println("This is exactly " + amountDollar * (1 / usDollar) + " US Dollar");
//            } else {
//                System.out.println("This is an incorrect entry, try again");
//            }
//
//        }

        boolean startOver = true;
        Scanner userFirstCurrency  = new Scanner(System.in);
        Scanner userSecondCurrency = new Scanner(System.in);
        Scanner userAmountInput = new Scanner(System.in);
        Scanner again = new Scanner(System.in);

        while (startOver) {

            System.out.println("What currency do you want to convert?"
                    + " Euro/"
                    + "Dollar/"
                    + "Lek/"
                    + "Roebel/"
            );

            String userChoiceOne = userFirstCurrency.next().toLowerCase();

            switch (userChoiceOne) {
                case "euro" -> {

                    System.out.println("What do you want me to convert your Euros into?"
                            + " Dollar/"
                            + "Lek/"
                            + "Roebel/");
                    String userChoiceTwo = userSecondCurrency.next().toLowerCase();

                    switch (userChoiceTwo) {
                        case "dollar" -> {

                            System.out.println("What amount do you want me to convert?");
                            int userAmount = userAmountInput.nextInt();

                            if (userAmount > 0) {
                                System.out.println("Your Euros convert to " + userAmount * usDollar + " US Dollars");


                                System.out.println("Do you need another conversion? yes or no?");
                                String finalAnswer = again.next().toLowerCase();

                                if (finalAnswer.equals("yes")) {
                                    System.out.println("Let me help you again...");
                                } else {
                                    System.out.println("Thank you for using this service!");
                                    startOver = false;
                                }
                            } else {
                                System.out.println("Please enter a valid amount");
                            }
                        }
                        case "lek" -> {

                            System.out.println("What amount do you want me to convert?");
                            int userAmount = userAmountInput.nextInt();

                            if (userAmount > 0) {
                                System.out.println("Your Euros convert to " + userAmount * albanianLek + " Lek");

                                System.out.println("Do you need another conversion? yes or no?");
                                String finalAnswer = again.next().toLowerCase();

                                if (finalAnswer.equals("yes")) {
                                    System.out.println("Let me help you again...");
                                } else {
                                    System.out.println("Thank you for using this service!");
                                    startOver = false;
                                }
                            } else {
                                System.out.println("Please enter a valid amount");
                            }
                        }
                        case "roebel" -> {

                            System.out.println("What amount do you want me to convert?");
                            int userAmount = userAmountInput.nextInt();

                            if (userAmount > 0) {
                                System.out.println("Your Euros convert to " + userAmount * roebel + " Roebel");


                                System.out.println("Do you need another conversion? yes or no?");
                                String finalAnswer = again.next().toLowerCase();

                                if (finalAnswer.equals("yes")) {
                                    System.out.println("Let me help you again...");
                                } else {
                                    System.out.println("Thank you for using this service!");
                                    startOver = false;
                                }
                            } else {
                                System.out.println("Please enter a valid amount");
                            }
                        }
//                        default -> {
//                            System.out.println("This is not a valid choice, please try again");
//                        }
                    }
                }
                case "dollar" -> {

                    System.out.println("What do you want me to convert your Euros into?"
                            + " Dollar/"
                            + "Lek/"
                            + "Roebel/");
                    String userChoiceTwo = userSecondCurrency.next().toLowerCase();

                    switch (userChoiceTwo) {

                        case "euro" -> {

                            System.out.println("What amount do you want me to convert?");
                            int userAmount = userAmountInput.nextInt();

                            if (userAmount > 0) {
                                System.out.println("Your Euros convert to " + userAmount * (euro / usDollar) + " Euros");


                                System.out.println("Do you need another conversion? yes or no?");
                                String finalAnswer = again.next().toLowerCase();

                                if (finalAnswer.equals("yes")) {
                                    System.out.println("Let me help you again...");
                                } else {
                                    System.out.println("Thank you for using this service!");
                                    startOver = false;
                                }
                            } else {
                                System.out.println("Please enter a valid amount");
                            }
                        }

                        case "lek"-> {

                            System.out.println("What amount do you want me to convert?");
                            int userAmount = userAmountInput.nextInt();

                            if (userAmount > 0) {
                                System.out.println("Your Dollars convert to " + userAmount * (usDollar / albanianLek) + " Lek");


                                System.out.println("Do you need another conversion? yes or no?");
                                String finalAnswer = again.next().toLowerCase();

                                if (finalAnswer.equals("yes")) {
                                    System.out.println("Let me help you again...");
                                } else {
                                    System.out.println("Thank you for using this service!");
                                    startOver = false;
                                }
                            } else {
                                System.out.println("Please enter a valid amount");
                            }
                        }

                        case "roebel"-> {

                            System.out.println("What amount do you want me to convert?");
                            int userAmount = userAmountInput.nextInt();

                            if (userAmount > 0) {
                                System.out.println("Your Dollars convert to " + userAmount * (usDollar / roebel) + " Roebel");

                                System.out.println("Do you need another conversion? yes or no?");
                                String finalAnswer = again.next().toLowerCase();

                                if (finalAnswer.equals("yes")) {
                                    System.out.println("Let me help you again...");
                                } else {
                                    System.out.println("Thank you for using this service!");
                                    startOver = false;
                                }
                            } else {
                                System.out.println("Please enter a valid amount");
                            }
                        }

//                        default -> {
//                            System.out.println("This is not a valid choice, please try again");
//                        }
                    }
                }
            }

        }


    }
}