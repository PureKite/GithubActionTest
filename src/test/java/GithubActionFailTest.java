import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class GithubActionFailTest {
    @Test
    @Tag("IntegrationTest")
    void testFail(){
        assert(false);
    }
}
