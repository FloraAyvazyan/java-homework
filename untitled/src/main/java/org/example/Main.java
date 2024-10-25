package org.example;

public class Main{
    //10
    public static int add(int x, int y){
        return x+y;
    }
    public static int subtrac(int x, int y){
        return x*y;
    }

    public static void main(String[] args) {
        //add ფუნქციის შედეგები
        int add1 = add(2, 4);
        int add2 = add(4, 7);
        int add3 = add(7, 57);
        //subtrac ფუნქციის შედეგები
        int subtrac1= subtrac(5, 8);
        int subtrac2 = subtrac(6, 9);
        int subtrac3 = subtrac(6, 33);

        //ინტეგერების მასივები
        int [] additionResults = {add1, add2, add3};
        int[] subtractionResults = {subtrac1, subtrac2, subtrac3};

        //ელემენტების ბეჯდვა
        System.out.println("additionResults მასივის ელემენტები ცალ-ცალკე ხაზზე");
        for(int i = 0; i < additionResults.length; i++){
            System.out.println(additionResults[i]);
        }

        System.out.println("subtractionResults მასივის ელემენტები ცალ-ცალკე ხაზზე");
        for(int i = 0; i < subtractionResults.length; i++){
            System.out.println(subtractionResults[i]);
        }


        //ელემენტების ბეჭდვა და თან გარკვევა ელემენტი ლუწია თუ კენტი
        System.out.println("\n\nadditionResults მასივის ელემენტები ერთ ხაზზე (while loop)");
        int i = 0;
        while(i <additionResults.length ){
            if(additionResults[i] % 2 == 0){
                System.out.print("even: " + additionResults[i] + ", ");
            }else{
                System.out.print("odd: " + additionResults[i] + ", ");
            }
            i++;
        }



        System.out.println("\nsubtractionResults მასივის ელემენტები ერთ ხაზზე (while loop)");
        int k = 0;
        while(k < subtractionResults.length){
            if(subtractionResults[k] % 2 == 0){
                System.out.print("even: " + subtractionResults[k] + ", ");
            }else{
                System.out.print("odd: " + subtractionResults[k] + ", ");
            }
            k++;
        }

    }
}

