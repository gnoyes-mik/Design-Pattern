package virtual;

public class SecretTextFile implements TextFile {
    private String plainText;

    public SecretTextFile(String fileName) {
        this.plainText = decodeByFileName(fileName);
    }

    private String decodeByFileName(String fileName) {
        String decodedText;
        // file decoding
        decodedText = "decoded_" + fileName;
        return decodedText;
    }

    @Override
    public String fetch() {
        return plainText;
    }
}
