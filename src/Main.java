public class Main {



    public static String reverseOrder(String input){
        return new StringBuilder(input).reverse().toString();
    }


    /**
     * Negates given string, returning in result String with 0 changed into 1 and 0 into 1
     * @param input String consisted of 0`s and 0`s
     * @return      String with 0 changed into 1 and 0 into 1.
     */
    public static String negate(String input){
/*
* 0 -> 2 -> 1
* 1 -> 3 -> 0
*
* so collision won`t occur :)
* */
        input = input.replace("0","2");
        input = input.replace("1","3");

        input = input.replace("2","1");
        input = input.replace("3","0");

        return input;

    }

    public static String foldPaper(String input){
        return input + "1" + reverseOrder(negate(input));
    }

    public static void main(String[] args) {
        int depth = 5;
        String folds = "1";

        while(depth-- >0){
            System.out.println(folds);
            folds = foldPaper(folds);
        }
        System.out.println();
    }
}
