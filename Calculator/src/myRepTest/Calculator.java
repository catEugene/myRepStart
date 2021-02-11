package myRepTest;

//https://github.com/catEugene/myRepStart.git

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) {
            String str = scan.nextLine();
            String[] nstr = str.split(" ");

            Integer a = Integer.parseInt(nstr[0]);
            Integer b = Integer.parseInt(nstr[2]);

            if (nstr[1].equals("*") && (a <= 10) && (b <= 10 ))
                System.out.println(a * b);
                //System.out.println(a + " + " + b + " = " + (a + b));
            else if (nstr[1].equals("/") && (a <= 10) && (b <= 10 ))
                System.out.println(a * 1.0 / b);
                //System.out.println(a + " - " + b + " = " + (a - b));
            else if (nstr[1].equals("+") && (a <= 10) && (b <= 10 ))
                System.out.println(a + b);
                //System.out.println(a + " * " + b + " = " + (a * b));
            else if (nstr[1].equals("-") && (a <= 10) && (b <= 10 ))
                System.out.println(a - b);
                //System.out.println(a + " - " + b + " = " + (a - b));
            else {
                System.out.println("Введено неверное число (> 10)");
                System.exit(1);
            }

        }
        else if (scan.hasNext()) {

            String str = scan.nextLine();
            String[] nstr = str.split(" ");

            String [] romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

            String ar = nstr[0];
            String br = nstr[2];
            int arn = 0;
            int brn = 0;
            int rr = 2;
            int n = 3;

            for (int i = 0; i < 10; i++) {
                // while (romans[i].equals(ar) && romans[i].equals(br)) {
                if (romans[i].equals(ar))
                    arn = i + 1;
                else if (romans[i].equals(br))
                    brn = i + 1;
                else if (br.equals(romans[0]))
                    brn = 1;
                else if (br.equals(romans[9]))
                    brn = 10;

            }

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

            String[] masrom = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVIIV", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII",
                    "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII",
                    "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV",
                    "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIIIV", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII",
                    "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

            if (rr >= 0)
                System.out.println((masrom[rr - 1]));
                //System.out.println(ar + " " + nstr[1] + " " + br + " = " +(masrom[rr - 1]));
            else {
                System.out.println("Римские числа не бывают ОТРИЦАТЕЛЬНЫМИ!!!");
                System.exit(1);
            }

        }

        else {
            System.out.println("ERORR");
        }
    }
}
