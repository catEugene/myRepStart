package myRepTest;

//https://github.com/catEugene/myRepStart.git

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) {
            String str = scan.nextLine();
            System.out.println(arabcalc(str));
        } else if (scan.hasNext()) {
            String str = scan.nextLine();
            System.out.println(romcalc(str));
        }
    }

    public static String romanDigit(int n, String one, String five, String ten){

        if(n >= 1)
        {
            if(n == 1)
            {
                return one;
            }
            else if (n == 2)
            {
                return one + one;
            }
            else if (n == 3)
            {
                return one + one + one;
            }
            else if (n==4)
            {
                return one + five;
            }
            else if (n == 5)
            {
                return five;
            }
            else if (n == 6)
            {
                return five + one;
            }
            else if (n == 7)
            {
                return five + one + one;
            }
            else if (n == 8)
            {
                return five + one + one + one;
            }
            else if (n == 9)
            {
                return one + ten;
            }

        }
        return "";
    }

    public static String convert(int number){

        String romanOnes = romanDigit( number%10, "I", "V", "X");
        number /=10;
        String romanTens = romanDigit( number%10, "X", "L", "C");
        number /=10;
        String romanHundreds = romanDigit(number%10, "C", "D", "M");
        number /=10;
        String romanThousands = romanDigit(number%10, "M", "", "");

        String result = romanThousands + romanHundreds + romanTens + romanOnes;
        return result;

    }

    public static String romcalc(String str) {
        String[] nstr = str.split(" ");

        String[] romans;
        romans = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] romans1 = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        String ar = nstr[0];
        String br = nstr[2];
        String rrstr;
        int arn = 0;
        int brn = 0;
        int rr = 1;
        int n = 3;

        for (int i = 0; i < 10; i++) {
            // while (romans[i].equals(ar) && romans[i].equals(br)) {
            if (romans[i].equals(ar))
                arn = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            if (romans1[i].equals(br))
                brn = i + 1;
        }


//        System.out.println(arn);
//        System.out.println(brn);

        if (nstr[1].equals("+")) {
            rr = arn + brn;
            // System.out.println(arn + brn);
        } else if (nstr[1].equals("-")) {
            rr = arn - brn;
            // System.out.println(arn - brn);
        } else if (nstr[1].equals("/")) {
            rr = arn / brn;
            // System.out.println(arn / brn);
        } else if (nstr[1].equals("*")) {
            rr = arn * brn;
            // System.out.println(arn * brn);
        }

        if (rr > 0) {
            rrstr = convert(rr );
            return (rrstr);
           // System.out.println(convert(rr + 1));
        }
        //System.out.println((masrom[rr - 1]));
        //System.out.println(ar + " " + nstr[1] + " " + br + " = " +(masrom[rr - 1]));
        else {
            System.out.println("Римские числа не бывают ОТРИЦАТЕЛЬНЫМИ!!!");
            System.exit(1);
        }
        return ar;
    }
//            else {
//                System.out.println("ERORR");
//            }


    public static int arabcalc(String str){
        
        String[] nstr = str.split(" ");

        Integer a = Integer.parseInt(nstr[0]);
        Integer b = Integer.parseInt(nstr[2]);
        int res = 0;

        if (nstr[1].equals("*") && (a <= 10) && (b <= 10))
            res = a * b;
            //System.out.println(a * b);
            //System.out.println(a + " + " + b + " = " + (a + b));
        else if (nstr[1].equals("/") && (a <= 10) && (b <= 10))
            res = a / b;
            //System.out.println(a * 1.0 / b);
            //System.out.println(a + " - " + b + " = " + (a - b));
        else if (nstr[1].equals("+") && (a <= 10) && (b <= 10))
            res = a + b;
            //System.out.println(a + b);
            //System.out.println(a + " * " + b + " = " + (a * b));
        else if (nstr[1].equals("-") && (a <= 10) && (b <= 10))
            res = a - b;
            //System.out.println(a - b);
            //System.out.println(a + " - " + b + " = " + (a - b));
        else {
            System.out.println("Введено неверное число (> 10)");
            System.exit(1);
        }
        return res;
    }
}
