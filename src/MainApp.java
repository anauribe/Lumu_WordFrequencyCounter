import java.io.IOException;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        String filePath = "src/archivo.txt";
        try {
            String content = CustomFileReader.readFile(filePath);
            int numWords = content.split("\\s+").length;
            int numCharacters = content.length();

            Map<String, Integer> wordFrequency = TextAnalyzer.analyzeText(content);
            List<Map.Entry<String, Integer>> sortedFrequency = new ArrayList<>(wordFrequency.entrySet());
            sortedFrequency.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            System.out.println("Número de palabras: " + numWords);
            System.out.println("Número de caracteres: " + numCharacters);
            System.out.println("Frecuencia de palabras:");

            for (Map.Entry<String, Integer> entry : sortedFrequency) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
