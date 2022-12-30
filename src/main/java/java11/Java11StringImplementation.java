package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Java11StringImplementation {
    public static void main(String[] args) throws IOException {
        //String features
        String str = "\n welcome \u2005 \n to \n java11 \n features";
        System.out.println("str.isBlank: " + str.isBlank());
        System.out.println("str.repeat: " + str.repeat(2));
        System.out.println("str.strip: " + str.strip());
        System.out.println("str.trim: " + str.trim());
        System.out.println("str.lines: " + str.lines());

        //readString and writeString
        Path tempUrl = Files.createTempFile(Path.of("C:\\Users\\jraphel\\JOHNPAUL RAPHEL"), "test_file", ".txt");
        Path path = Files.writeString(tempUrl, "sample test file for java 11 features");
        Files.readString(path);

        // Collection to an Array
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);
        System.out.println("sample array: " + sampleArray);

        // var declaration for local and params
        var value = 10;
        var str1 = "sample message";
        System.out.println(value);
        System.out.println(str1);

        List<Integer> list = Arrays.asList(5, 3, 2, 8, 58, 45, 78, 3, 34);
        IntSummaryStatistics statistics = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("statistics.getMax(): " + statistics.getMax());
        System.out.println("statistics.getMin(): " +statistics.getMin());
        System.out.println("statistics.getAverage(): " +statistics.getAverage());
        System.out.println("statistics.getSum(): " +statistics.getSum());
    }
}
