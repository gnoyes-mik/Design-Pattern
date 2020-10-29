package virtual;

import java.util.ArrayList;
import java.util.List;

public class TextFileProvider {
    public static List<TextFile> getSecretTextFile(int x, int y) {
        List<TextFile> fileList = new ArrayList<>();
        for (int i = x; i < y; i++) {
            fileList.add(new SecretTextFile(String.valueOf(i)));
        }
        return fileList;
    }

    public static List<TextFile> getProxyTextFile(int x, int y) {
        List<TextFile> fileList = new ArrayList<>();
        for (int i = x; i < y; i++) {
            fileList.add(new ProxyTextFile(String.valueOf(i)));
        }
        return fileList;
    }

}
