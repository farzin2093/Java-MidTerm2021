package parser.json;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api
      API KEY:0764fdc845aa49c18f423b5d77fc856c

      Fetch This following CNN API, It will return some news in Json data. Store the data in the data.json file
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY
      //{"status":"error","code":"apiKeyInvalid","message":"Your API key is invalid or incorrect. Check your key, or go to https://newsapi.org to create a free API key."}

	   Read the articles array and construct Headline news as

	   source,
	   author,
	   title,
	   description,
	   url,
	   urlToImage,
	   publishedAt
	   content.

	   You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

     */

    public static void main(String[] args) throws IOException, JSONException {
        JSONObject rootObject = new JSONObject(new String(Files.readAllBytes(new File("src/json/parser/data.json").toPath())));
        JSONArray array = rootObject.getJSONArray("articles");
        List<Articles> list = new ArrayList<>();
        for (int i = 0; i < array.length(); i++) {
            JSONObject dataJson = array.getJSONObject(i);
            ObjectMapper objectMapper = new ObjectMapper();
            Articles data = null;
            try {
                data = objectMapper.readValue(dataJson.toString(), Articles.class);
            } catch (JsonMappingException e) {
                e.printStackTrace();
            }
            list.add(data);
        }

        //continue


    }

}
