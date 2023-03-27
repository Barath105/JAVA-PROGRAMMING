import java.io.*;



         public class FileStreamExample {

         public static void main(String[] args) {

         String str = "WELCOME TO SSE";

         byte[] bytes = str.getBytes();



          try {

            // Write the string to a file using FileOutputStream

            FileOutputStream fileOut = new FileOutputStream("output.txt");

            fileOut.write(bytes);

            fileOut.close();



            // Read the string from the file using FileInputStream

            FileInputStream fileIn = new FileInputStream("output.txt");

            byte[] readBytes = new byte[bytes.length];

            fileIn.read(readBytes);

            fileIn.close();



            // Convert the byte array back to a string and print it

            String readStr = new String(readBytes);

            System.out.println(readStr);

        } catch (IOException e) {

            System.out.println("An error occurred: " + e.getMessage());

        }

    }

}

