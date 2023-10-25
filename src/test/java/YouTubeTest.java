import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YouTubeTest {
    @Test
    void successfulYouTubeSearch(){
        open("https://www.youtube.com/");
        $("[name=search_query]").setValue("selenide").pressEnter();
    }
}
