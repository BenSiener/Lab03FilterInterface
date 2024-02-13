import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser textChooser = new JFileChooser();
        int result = textChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                String filename = textChooser.getSelectedFile().getAbsolutePath();
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                String lineReader;
                StringBuilder text = new StringBuilder();
                while ((lineReader = reader.readLine()) != null) {
                    text.append(lineReader).append("\n");
                }
                reader.close();
                String[] words = text.toString().split("\\s+");
                Filter filter = new ShortWordFilter();
                List<Object> shortWords = Main.collectAll(words, filter);
                for (Object word : shortWords) {
                    System.out.println(word);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
