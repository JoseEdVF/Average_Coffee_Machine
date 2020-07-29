import java.util.Scanner;

public class Coffee_Machine {
    public static Scanner scanner = new Scanner(System.in);
    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cups = 9;
    public static int money = 550;

    public static void menuCoffe(){
        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String str = scanner.nextLine();
            switch (str) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String n = scanner.nextLine();
                    switch (n) {
                        case "1":
                            if ((Coffee_Machine.water >= 250 && Coffee_Machine.beans >= 16) && Coffee_Machine.cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                Coffee_Machine.water -= 250;
                                Coffee_Machine.beans -= 16;
                                Coffee_Machine.cups -= 1;
                                Coffee_Machine.money += 4;
                                break;
                            }else if(Coffee_Machine.water<250){
                                System.out.println("Sorry, not enough water!");
                                break;
                            }else if(Coffee_Machine.beans < 16){
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            }else if(Coffee_Machine.cups < 1){
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }
                            break;
                        case "2":
                            if ((Coffee_Machine.water >= 350 && Coffee_Machine.milk >= 75) && (Coffee_Machine.beans >= 20 && Coffee_Machine.cups >= 1)) {
                                System.out.println("I have enough resources, making you a coffee!");
                                Coffee_Machine.water -= 350;
                                Coffee_Machine.milk -= 75;
                                Coffee_Machine.beans -= 20;
                                Coffee_Machine.cups -= 1;
                                Coffee_Machine.money += 7;
                            }else if(Coffee_Machine.water<350){
                                System.out.println("Sorry, not enough water!");
                            }else if(Coffee_Machine.beans < 20){
                                System.out.println("Sorry, not enough coffee beans!");
                            }else if(Coffee_Machine.cups < 1){
                                System.out.println("Sorry, not enough disposable cups!");
                            }else if(Coffee_Machine.milk < 75){
                                System.out.println("Sorry, not enough milk!");
                            }
                            break;
                        case "3":
                            if ((Coffee_Machine.water >= 200 && Coffee_Machine.milk >= 100) && (Coffee_Machine.beans >= 12 && Coffee_Machine.cups >= 1)) {
                                System.out.println("I have enough resources, making you a coffee!");
                                Coffee_Machine.water -= 200;
                                Coffee_Machine.milk -= 100;
                                Coffee_Machine.beans -= 12;
                                Coffee_Machine.cups -= 1;
                                Coffee_Machine.money += 6;
                            }else if(Coffee_Machine.water<200){
                                System.out.println("Sorry, not enough water!");
                            }else if(Coffee_Machine.beans < 12){
                                System.out.println("Sorry, not enough coffee beans!");
                            }else if(Coffee_Machine.cups < 1){
                                System.out.println("Sorry, not enough disposable cups!");
                            }else if(Coffee_Machine.milk < 100){
                                System.out.println("Sorry, not enough milk!");
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int num1 = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int num2 = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int num3 = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int num4 = scanner.nextInt();
                    Coffee_Machine.water += num1;
                    Coffee_Machine.milk += num2;
                    Coffee_Machine.beans += num3;
                    Coffee_Machine.cups += num4;
                    break;
                case "take":
                    System.out.println("I gave you " + Coffee_Machine.money);
                    Coffee_Machine.money = 0;

                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println("$"+ money + " of money");
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }


    public static void main(String[] args) {
        menuCoffe();
    }
}
