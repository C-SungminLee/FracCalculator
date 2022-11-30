import java.util.Scanner;
public class FracCalc {

    public static void main(String[] args)
    {
        // TODO: Read the input from the user and call produceAnswer with an equation

    }

    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) {
        // TODO: Implement this function to produce the solution to the input
        Scanner scan = new Scanner(input);
        scan.useDelimiter(" ");
        String firstFraction = (scan.next());
        String operator = (scan.next());
        String secondFraction = (scan.next());

        //return (secondFraction);
        //return("whole:"+findWhole(secondFraction)+" numerator:"+findNumerator(secondFraction)+" denominator:"+findDenomenator(secondFraction));



        int firstFractionWhole = Integer.parseInt(findWhole(firstFraction));
        int firstFractionNumerator = Integer.parseInt(findNumerator(firstFraction));
        int firstFractionDenomenator = Integer.parseInt(findDenomenator(firstFraction));
        int secondFractionWhole = Integer.parseInt(findWhole(secondFraction));
        int secondFractionNumerator = Integer.parseInt(findNumerator(secondFraction));
        int secondFractionDenomenator = Integer.parseInt(findDenomenator(secondFraction));
        String finalnumber = "";
/*
        //checkpoint 3
        if (operator.equals("+")) {
            //addition
            finalnumber = (((secondFractionDenomenator * firstFractionNumerator)+( firstFractionDenomenator * secondFractionNumerator)+(firstFractionWhole+secondFractionWhole)*(firstFractionDenomenator*secondFractionDenomenator))+"/"+(firstFractionDenomenator*secondFractionDenomenator));
        } else if (operator.equals("-")) {
            //subtraction
            finalnumber =(((secondFractionDenomenator * firstFractionNumerator)-( firstFractionDenomenator * secondFractionNumerator)+(firstFractionWhole-secondFractionWhole)*(firstFractionDenomenator*secondFractionDenomenator))+"/"+(firstFractionDenomenator*secondFractionDenomenator));
        } else if (operator.equals("*")) {
            finalnumber = ((((firstFractionWhole * firstFractionDenomenator) + (firstFractionNumerator)) * ((secondFractionWhole * secondFractionDenomenator) + (secondFractionNumerator))) + "/" + (firstFractionDenomenator * secondFractionDenomenator));
        } else if (operator.equals("/")) {
            //division
            finalnumber = (((firstFractionWhole * firstFractionDenomenator) + (firstFractionNumerator)) * (secondFractionDenomenator) + "/" + (firstFractionDenomenator) * ((secondFractionWhole * secondFractionDenomenator) + secondFractionNumerator));
        }

        return finalnumber;
    }
*/

        ///*
        // Final
        if (operator.equals("+")) {
            //addition
            int numerator = ((secondFractionDenomenator * firstFractionNumerator)+( firstFractionDenomenator * secondFractionNumerator)+(firstFractionWhole+secondFractionWhole)*(firstFractionDenomenator*secondFractionDenomenator));
            int denomenator = (firstFractionDenomenator*secondFractionDenomenator);
            int whole = 0;
            if (!("" +numerator).equals("0")){
                finalnumber = (numerator+"/"+denomenator);
            }
            if (denomenator == 1){
                finalnumber =(""+ (numerator));
            }
            else{
                finalnumber = "0";
            }
            if (finalnumber.charAt(0) == 0 && finalnumber.charAt(1)==0){
                finalnumber = finalnumber.substring(2,finalnumber.length());
            }
            if ((numerator)%(denomenator)>0){
                whole = numerator/denomenator;

            }
            if (whole > 0){
                finalnumber = whole +"_"+ finalnumber;
            }
        } else if (operator.equals("-")) {
            //subtraction
            int numerator = ((secondFractionDenomenator * firstFractionNumerator) - (firstFractionDenomenator * secondFractionNumerator) + (firstFractionWhole - secondFractionWhole) * (firstFractionDenomenator * secondFractionDenomenator));
            int denomenator = (firstFractionDenomenator*secondFractionDenomenator);


            if (denomenator == 1) {
                finalnumber = ("" + numerator);
            }else if(denomenator == -1){
                finalnumber = ("-"+numerator);
            }else if (numerator == 0){
                finalnumber = (""+0);
            }else if (Math.abs(numerator % denomenator) > 0 && Math.abs(numerator/denomenator) >1){
                for (int k = 0; k < 10; k++) {
                    for (int i = 2; i < 11; i++) {
                        if ((numerator % i == 0) && (denomenator % i == 0)) {
                            numerator = numerator / i;
                            denomenator = denomenator / i;
                        }
                    }
                }
                int whole = numerator/denomenator;
                finalnumber = (whole+"_"+numerator%denomenator+"/"+denomenator);
            }
            else {
                for (int k = 0; k < 10; k++) {
                    for (int i = 2; i < 11; i++) {
                        if ((numerator % i == 0) && (denomenator % i == 0)) {
                            numerator = numerator / i;
                            denomenator = denomenator / i;
                        }
                    }
                }
                finalnumber = (numerator + "/" + denomenator);
            }


        } else if (operator.equals("*")) {
            //multiplication
            if ((((firstFractionWhole*firstFractionDenomenator)+(firstFractionNumerator))*((secondFractionWhole*secondFractionDenomenator)+(secondFractionNumerator))) == 0){
                finalnumber = "0";
            }else if ((firstFractionDenomenator*secondFractionDenomenator) == 1){
                finalnumber = (""+(((firstFractionWhole*firstFractionDenomenator)+(firstFractionNumerator))*((secondFractionWhole*secondFractionDenomenator)+(secondFractionNumerator))));
            }else{
                if ((((firstFractionWhole*firstFractionDenomenator)+(firstFractionNumerator))*((secondFractionWhole*secondFractionDenomenator)+(secondFractionNumerator))) % (firstFractionDenomenator*secondFractionDenomenator) == 0){
                    finalnumber = ("" + (((firstFractionWhole*firstFractionDenomenator)+(firstFractionNumerator))*((secondFractionWhole*secondFractionDenomenator)+(secondFractionNumerator)))/(firstFractionDenomenator*secondFractionDenomenator));
                }else {
                    finalnumber = ((((firstFractionWhole * firstFractionDenomenator) + (firstFractionNumerator)) * ((secondFractionWhole * secondFractionDenomenator) + (secondFractionNumerator))) + "/" + (firstFractionDenomenator * secondFractionDenomenator));
                }
            }
        } else if (operator.equals("/")) {
            //division
            if (((firstFractionWhole*firstFractionDenomenator)+(firstFractionNumerator))*(secondFractionDenomenator) == 0){
                finalnumber = "0";
            }else if(((firstFractionWhole*firstFractionDenomenator)+(firstFractionNumerator))*(secondFractionDenomenator) == ((firstFractionDenomenator) * ((secondFractionWhole * secondFractionDenomenator) + secondFractionNumerator))){
                finalnumber = "1";
            }else {
                finalnumber = (((firstFractionWhole * firstFractionDenomenator) + (firstFractionNumerator)) * (secondFractionDenomenator) + "/" + (firstFractionDenomenator) * ((secondFractionWhole * secondFractionDenomenator) + secondFractionNumerator));
            }
            }
        return finalnumber;
    }
    //*/



    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String findWhole(String fraction){
        String whole = "0";
        if (fraction.contains("/")){
            if (fraction.contains("_")){
                Scanner scan = new Scanner(fraction);
                scan.useDelimiter("_");
                whole = scan.next();
            }
        }else{
            whole = fraction;
        }
        return(whole);
    }
    public static String findNumerator(String fraction){
        String numerator = "0";
        if (fraction.contains("/")){
            if (fraction.contains("_")){
                Scanner scan = new Scanner(fraction);
                scan.useDelimiter("/");
                Scanner secondScan = new Scanner(scan.next());
                secondScan.useDelimiter("_");
                if ((secondScan.next()).charAt(0) == '-'){
                    numerator="-";
                }
                numerator += secondScan.next();

            }else{
                Scanner scan = new Scanner(fraction);
                scan.useDelimiter("/");
                numerator = scan.next();
            }
        }
        return(numerator);
    }
    public static String findDenomenator(String fraction){
        String denomenator = "1";
        if (fraction.contains("/")){
            Scanner scan = new Scanner(fraction);
            scan.useDelimiter("/");
            scan.next();
            denomenator = scan.next();

        }
        return(denomenator);
    }

}