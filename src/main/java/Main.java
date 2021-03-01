import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class Main {
    public static void main(String[] args) throws Exception {
        ResponseStepic result = new Gson().fromJson(sendGet("https://stepic.org/api/courses?is_featured=true"), ResponseStepic.class);
        System.out.println(result);
    }

    private static String sendGet(String url) throws Exception {

        HttpURLConnection httpClient = (HttpURLConnection) new URL(url).openConnection();
        httpClient.setRequestMethod("GET");
        httpClient.setRequestProperty("User-Agent", "Mozilla/5.0");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(httpClient.getInputStream()))) {
            final StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) response.append(line).append("\n");
            return response.toString();
        }

    }
}
