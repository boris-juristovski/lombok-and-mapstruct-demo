package examples.lombok.v9;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class App9 {

    public static void main(String[] args) {
        try {
            exceptionalMethod();
        } catch (Exception e) {

        }

        exceptionalMethodV2();
    }

    private static void exceptionalMethod() throws IOException {
        Path path = Path.of("path/to/file.txt");
        String content = Files.readString(path);

        log.info("### Content {}", content);
    }

    @SneakyThrows
    private static void exceptionalMethodV2() {
        Path path = Path.of("path/to/file.txt");
        String content = Files.readString(path);

        log.info("### Content {}", content);
    }
}
