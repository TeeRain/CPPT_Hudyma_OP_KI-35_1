import java.io.*;
import java.util.*;
/**
 * Клас Lab2 реалізує приклад програми до лабораторної роботи №2
 *
 * @author Oleh Hudyma
 * @version 1.0
 * @since version 1.0
 *
 */
public class lab2
{
    /**
     * Статичний метод main є точкою входу в програму
     * <p>
     *
     *
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("MyFile.txt");
        System.out.print("Enter the matrix size: ");
        int size = scanner.nextInt();
        System.out.print("Enter the placeholder character: ");
        char character = getPlaceholderCharacter().charAt(0);
        int half = size / 2;
        char[][] arr = new char[size][half];


        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < half) arr[i][j] = character;
                if (i < half && j < half || i >= half && j >= half)
                    builder.append(String.format("%c\t", character));
                else
                    builder.append(" \t");
            }
            builder.append("\n");
        }

        writer.write(builder.toString());
        System.out.println(builder);

        writer.flush();
        writer.close();
        scanner.close();
    }

    private static String getPlaceholderCharacter() {
        Scanner scanner = new Scanner(System.in);
        String character = scanner.nextLine();
        if (character.length() != 1) {
            throw new IllegalArgumentException("Only one character must be entered");
        }
        return character;
    }
}
