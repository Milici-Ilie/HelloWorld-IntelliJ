public class Hello {
    //🔬🔬[OPERATOR VALUES]🔬🔬
    public static void main(String[] args) {
        System.out.println("Hello, Cristian");

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("It is an alien " + "predator!!!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greate than second top score and less than 100 ");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Eit her or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true!");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        //🔬🔬[OPERATOR VALUES]🔬🔬 Ternary OPERATORS
        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
        System.out.println("Our client is " + ageText);
    }

    String makeOfCar = "Volkswagen";
    boolean isDomestic = makeOfCar.equals("Volkswagen") ? false : true;

    if(isDomestic){
        System.out.println("This car is domestic to our country!");
    }

    String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
System.out.println(s)

}
}


