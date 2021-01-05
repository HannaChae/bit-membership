package hello;

import java.util.Arrays;
import static java.util.stream.Collectors.toList;
import java.util.stream.Collectors;

public class HelloWorld {
    public String main() {
        return Arrays.asList(new String[] { "Hello, ", "World ", "!!!!" }).stream().map(i -> String.valueOf(i))
                .collect(Collectors.joining());
    }
}
