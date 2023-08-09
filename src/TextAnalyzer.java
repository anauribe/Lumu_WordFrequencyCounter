import java.util.*;

public class TextAnalyzer {
    public static Map<String, Integer> analyzeText(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                
            }
        }

        return wordFrequency;
    }
}
