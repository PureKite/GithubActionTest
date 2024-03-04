import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class GithubActionFailTest {
    @Test
    @Tag("integrationTest")
    void testFail(){
        assert(false);
    }
}
