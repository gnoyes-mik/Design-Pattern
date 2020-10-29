package virtual;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TextFile> files = new ArrayList<>();
        files.addAll(TextFileProvider.getSecretTextFile(0,3));
        files.addAll(TextFileProvider.getProxyTextFile(3,20));

        for (TextFile file : files) {
            String plainText = file.fetch();
            System.out.println(plainText);
        }
    }
}
