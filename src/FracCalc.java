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
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        Scanner scan = new Scanner(input);
        scan.useDelimiter(" ");
        scan.next();
        scan.next();
        String secondFraction = (scan.next());

        //return (secondFraction);
        return("whole:"+findWhole(secondFraction)+" numerator:"+findNumerator(secondFraction)+" denominator:"+findDenomentaor(secondFraction));
        }

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String findWhole(String secondFraction){
        String whole = "0";
        if (secondFraction.contains("/")){
            if (secondFraction.contains("_")){
                Scanner scan = new Scanner(secondFraction);
                scan.useDelimiter("_");
                whole = scan.next();
            }
        }else{
            whole = secondFraction;
        }
        return(whole);
    }
    public static String findNumerator(String secondFraction){
        String numerator = "0";
        if (secondFraction.contains("/")){
            if (secondFraction.contains("_")){
                Scanner scan = new Scanner(secondFraction);
                scan.useDelimiter("/");
                Scanner secondScan = new Scanner(scan.next());
                secondScan.useDelimiter("_");
                secondScan.next();
                numerator = secondScan.next();
            }else{
                Scanner scan = new Scanner(secondFraction);
                scan.useDelimiter("/");
                numerator = scan.next();
            }
        }
        return(numerator);
    }
    public static String findDenomentaor(String secondFraction){
        String Denomenator = "1";
        if (secondFraction.contains("/")){
            Scanner scan = new Scanner(secondFraction);
            scan.useDelimiter("/");
            scan.next();
            Denomenator = scan.next();
        }
        return(Denomenator);
    }

}
