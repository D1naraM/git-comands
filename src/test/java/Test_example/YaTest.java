package Test_example;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class YaTest {
    @Test
    void yaTest() {
        Selenide.open("https://ya.ru");
    }
}
