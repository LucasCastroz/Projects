package groupId.XMLToJSON.Teste;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class TesteJson {

    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    
    //xml vc coloca na variavel abaixo
    public static String TEST_XML_STRING =
        "";

    public static void main(String[] args) {
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
    }
}