import com.caiocollete.modules.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        String ApiKey = "<your ApiKey>";
        List<Movie> movies = new APIComunication(ApiKey).request();
        HTMLGenerator.generatePage(movies);
    }
}
