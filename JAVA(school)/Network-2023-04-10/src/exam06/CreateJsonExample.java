package exam06;

import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreateJsonExample {
    public static void main(String[] args) throws IOException{
        JSONObject root = new JSONObject();

        root.put("id", "winter");
        root.put("name", "한겨울");
        root.put("age", 25);
        root.put("student", true);

        JSONObject tel = new JSONObject();
        tel.put("home", "02-123-1234");
        tel.put("moblie", "010-123-1234");
        root.put("tel", tel);

        JSONArray skill = new JSONArray();
        skill.put("java");
        skill.put("C");
        skill.put("C++");
        root.put("skill", skill);

        String json = root.toString();

        System.out.println(json);

        Writer writer = new FileWriter("/Users/csp/member.json", Charset.forName("UTF-8"));
        writer.write(json);
        writer.flush();
        writer.close();
    }
}
