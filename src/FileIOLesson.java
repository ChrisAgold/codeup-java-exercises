import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLesson {
    // IO inout & output
    // reading and writing files

    // Mini Exercise
    //
    // 1. Create a class named FileIOLesson
    // 2. Do your work inside of a main method
    // 3. Write Java code to create a file named languages.txt. Specify languages.txt as a relative path (Paths.get("languages.txt")).
    //    Where is this file created after you run your code?
    // 4. Run your code that creates the languages.txt file again. What happens when you try to create a file that already exists?
    // 5. Update your code to check for the presence of languages.txt before creating it.
//    public static void main(String[] args) throws IOException {
//        Path filePath = new Paths.get("languages.txt");
//        if(! Files.exists(filePath)) {
//            Files.createFile(filePath);
//
//        }
    //}

    //    1. Create a variable named languages that is a list of strings. Each string should be one programming language that you know.
//            1. Write the code to add the programming languages you know, each on a seperate line, to languages.txt.
//1. Run your code and open the languages.txt file. What do you notice?
//            1. Re-run your code that adds the languages. Open the languages.txt file again. What do you notice?
//            1. Modify your languages variable and remove one of the languages. Re-run your code and inspect the languages.txt file. What do you notice?
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("languages.txt");
        List<String> languages = Arrays.asList(
                "HTML",
                "CSS"
        );
        System.out.println("ArrayList : " + languages.toString());
        Files.write(filePath, languages);

    }
}

