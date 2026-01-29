package org.evavdb1.smoothies.shop;
import java.util.Scanner;

public class LoveShack {

    private SmoothieRecipe[] orders;
    private double amount;

    public LoveShack(SmoothieRecipe[] orders) {
        this.orders = orders;
    }

    public void order() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome at the Love Shack...");
        System.out.println("... a little old place where we can get together.");
        System.out.println();
        System.out.println("you want 4 smoothies, go ahead and pick the first. ");

        int orderCount = 0;
        double grandTotal = 0;

        while (orderCount < 4) {
            System.out.println();
            System.out.println("Here's our menu, type the corresponding number:");
            System.out.println("1. CITRUS" + "\n2. STRAWBERRYDREAM" + "\n3. BANANASLIDE" + "\n4. VEGIESLURRY" + "\n5. CUSTOM SMOOTHIE");
            int choice = input.nextInt();
            System.out.println();

            System.out.println("Let's mix the ingredients for your drink!");
            switch (choice) {
                case 1:
                    SmoothieRecipe drink01 = SmoothieRecipe.CITRUS;
                    System.out.println(drink01);
                    drink01.mixIngredients();
                    System.out.println("Total price for this smoothie is: $" + drink01.getTotalPrice() + ".");
                    grandTotal += drink01.getTotalPrice();
                    break;
                case 2:
                    SmoothieRecipe drink02 = SmoothieRecipe.STRAWBERRYDREAM;
                    System.out.println(drink02);
                    drink02.mixIngredients();
                    System.out.println("Total price for this smoothie is: $" + drink02.getTotalPrice() + ".");
                    grandTotal += drink02.getTotalPrice();
                    break;
                case 3:
                    SmoothieRecipe drink03 = SmoothieRecipe.BANANASLIDE;
                    System.out.println(drink03);
                    drink03.mixIngredients();
                    System.out.println("Total price for this smoothie is: $" + drink03.getTotalPrice() + ".");
                    grandTotal += drink03.getTotalPrice();
                    break;
                case 4:
                    SmoothieRecipe drink04 = SmoothieRecipe.VEGIESLURRY;
                    System.out.println(drink04);
                    drink04.mixIngredients();
                    System.out.println("Total price for this smoothie is: $" + drink04.getTotalPrice() + ".");
                    grandTotal += drink04.getTotalPrice();
                    break;
                case 5:
                    SmoothieRecipe drink05 = SmoothieRecipe.CUSTOMSMOOTHIE;
                    customOrder();
                    grandTotal += amount;
                    break;
            }
            orderCount++;
        }
        System.out.println();
        System.out.println("The grand total of your order is: $"+grandTotal);
    }


    public void customOrder() {
        int count = 0;
        String[] selection = new String[4];
        Scanner input = new Scanner(System.in);

        System.out.println("Choose 2 to 4 ingredients on the menu: ");
        System.out.println();
        System.out.println("orange - lemon - banana - strawberry - apple - spinach - celery");

        while (count < 4) {
            System.out.println("pick 1 ingredient and press enter. 'done' to finish.");
            String ingredients = input.nextLine().trim();

            if (ingredients.equalsIgnoreCase("done")) {
                if (count >= 2) {
                    break;
                } else {
                    System.out.println("there's a minimum  of 2 ingredients");
                    continue;
                }
            }
            switch (ingredients.toLowerCase()) {
                case "orange":
                    selection[count] = "orange \uD83C\uDF4A";
                    amount += 1.00;
                    count++;
                    break;
                case "lemon":
                    selection[count] = "lemon \uD83C\uDF4B";
                    amount += 0.75;
                    count++;
                    break;
                case "banana":
                    selection[count] = "banana \uD83C\uDF4C";
                    amount += 1.25;
                    count++;
                    break;
                case "strawberry":
                    selection[count] = "strawberry \uD83C\uDF53";
                    amount += 2.00;
                    count++;
                    break;
                case "apple":
                    selection[count] = "apple \uD83C\uDF4E";
                    amount += 0.50;
                    count++;
                    break;
                case "celery":
                    selection[count] = "celery \uD83C\uDF3F";
                    amount += 1.00;
                    count++;
                    break;
                case "spinach":
                    selection[count] = "spinach \uD83E\uDD6C";
                    amount += 1.25;
                    count++;
                    break;
                default:
                    System.out.println("not an ingredient. \uD83C\uDF5F");
            }
        }
        System.out.println("You chose: ");
        for (int i = 0; i < count; i++) {
            System.out.print(selection[i] + " ");

        }
        System.out.println();
        System.out.println("Total price for this smoothie is: $" + amount + ".");
    }

}
