package groupId.Springboot.endpoint;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class TesteJson {

    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String TEST_XML_STRING =
        "<project xmlns=\"http://maven.apache.org/POM/4.0.0\"\r\n" + 
        "	xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n" + 
        "	xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\r\n" + 
        "	<modelVersion>4.0.0</modelVersion>\r\n" + 
        "\r\n" + 
        "	<groupId>groupId</groupId>\r\n" + 
        "	<artifactId>Springboot</artifactId>\r\n" + 
        "	<version>1.0.0</version>\r\n" + 
        "	<packaging>jar</packaging>\r\n" + 
        "	\r\n" + 
        "	<parent>\r\n" + 
        "		<groupId>org.springframework.boot</groupId>\r\n" + 
        "		<artifactId>spring-boot-starter-parent</artifactId>\r\n" + 
        "		<version>1.5.3.RELEASE</version>\r\n" + 
        "\r\n" + 
        "	</parent>\r\n" + 
        "	<name>Springboot</name>\r\n" + 
        "	<url>http://maven.apache.org</url>\r\n" + 
        "\r\n" + 
        "	<properties>\r\n" + 
        "		<java.version>1.8</java.version>\r\n" + 
        "	</properties>\r\n" + 
        "	<dependencies>\r\n" + 
        "		<dependency>\r\n" + 
        "			<groupId>junit</groupId>\r\n" + 
        "			<artifactId>junit</artifactId>\r\n" + 
        "			<version>3.8.1</version>\r\n" + 
        "			<scope>test</scope>\r\n" + 
        "		</dependency>\r\n" + 
        "		<dependency>\r\n" + 
        "  <groupId>org.json</groupId>\r\n" + 
        "  <artifactId>json</artifactId>\r\n" + 
        "  <version>20180813</version>\r\n" + 
        "</dependency>\r\n" + 
        "		<dependency>\r\n" + 
        "			<groupId>org.springframework.boot</groupId>\r\n" + 
        "			<artifactId>spring-boot-starter-web</artifactId>\r\n" + 
        "		</dependency>\r\n" + 
        "		<dependency>\r\n" + 
        "			<groupId>org.springframework.boot</groupId>\r\n" + 
        "			<artifactId>spring-boot-devtools</artifactId>\r\n" + 
        "			<optional>true</optional>\r\n" + 
        "		</dependency>\r\n" + 
        "		<dependency>\r\n" + 
        "			<groupId>org.springframework.boot</groupId>\r\n" + 
        "			<artifactId>spring-boot-starter-data-jpa</artifactId>\r\n" + 
        "		</dependency>\r\n" + 
        "		<dependency>\r\n" + 
        "			<groupId>mysql</groupId>\r\n" + 
        "			<artifactId>mysql-connector-java</artifactId>\r\n" + 
        "		</dependency>\r\n" + 
        "	</dependencies>\r\n" + 
        "\r\n" + 
        "\r\n" + 
        "</project>\r\n" + 
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