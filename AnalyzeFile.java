import java.io.*;
import java.util.Scanner;

public class AnalyzeFile {
    public static void main(String[] args) throws IOException {
        Scanner infile = new Scanner(new File("src\\12042232.txt"));
        infile.nextLine();
        BufferedWriter printfile = new BufferedWriter(new FileWriter("src\\file\\text.txt"));
        while(infile.hasNextLine()) {
            String s = infile.nextLine();

            if(s.trim().isEmpty())
                continue;

            if(s.equals("\n"))
                printfile.newLine();

            else
                printfile.write(s.toUpperCase());

            printfile.newLine();
        }
        printfile.close();


//        Scanner in;
//        try{
//            in = new Scanner(new File("src\\12042232.txt"));
//            int countLine = 0;
//            int countWords = 0;
//            int countUppercase = 0;
//            int countLowercase = 0;
//            int countDigits = 0;
//            while (in.hasNext()){
//                countLine++;
//                String s = in.nextLine();
//                String[] words = s.split("\\s+");
//                countWords += words.length;
//
//                for(int i = 0 ; i < s.length(); i++){
//                    if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
//                        countUppercase++;
//                    }
//                }
//
//                for(int i = 0 ; i < s.length(); i++){
//                    if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
//                        countLowercase++;
//                    }
//                }
//
//                for(int i = 0 ; i < s.length(); i++){
//                    if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
//                        countDigits++;
//                    }
//                }
//            }
//
//            System.out.println("Number of Lines in txt file: " + countLine);
//            System.out.println("Number of words in txt file: " + countWords);
//            System.out.println("Number of Uppercase letters in txt file: " + countUppercase);
//            System.out.println("Number of Lowercase letters in txt file: " + countLowercase);
//            System.out.println("Number of Digits in txt file: " + countDigits);
//
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
