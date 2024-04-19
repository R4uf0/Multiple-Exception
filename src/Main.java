import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter : ");
        String valid = scanner.next();
        try {
            if (valid == null){
                throw new NullPointerException("Value is null!");
            }
            int number = Integer.valueOf(valid);
            System.out.println(number);
        }catch (NullPointerException nullPointerException){
            System.err.println("Value is null!");
        }catch (NumberFormatException numberFormatException){
            System.err.println("Value is not a valid integer!");
        }catch (Exception exception){
            System.err.println("An unexpected error occurred.");
        }
    }
}