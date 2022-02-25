package compare_json_test;

import compare_json.MyCompareJSON;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JSON_TEST {


    JSONObject actualJson;
    JSONObject expectedJson;

    @BeforeEach
    public void JSONINIT() {
        actualJson = new JSONObject();
        expectedJson = new JSONObject();
    }

    @Test
    public void testCaseA() {

        actualJson.put("Nombre", "MELO");
        actualJson.put("Edad", 22);

        expectedJson.put("Nombre", "MELO");
        expectedJson.put("Edad", 22);

        boolean expectedResult = true;
        boolean actualResult = MyCompareJSON.compareJson(actualJson.toString(), expectedJson.toString());
        Assertions.assertEquals(expectedResult,actualResult,"ERROR");
    }

    @Test
    public void testCaseB() {
        actualJson.put("Nombre", "MELO");
        actualJson.put("Edad", 22);

        expectedJson.put("Nombre", "Cristian");
        expectedJson.put("Edad", 22);

        boolean expectedResult = false;
        boolean actualResult = MyCompareJSON.compareJson(actualJson.toString(), expectedJson.toString());
        Assertions.assertEquals(expectedResult,actualResult,"ERROR");
    }

    @Test
    public void testCaseC() {
        actualJson.put("Nombre", "MELO");
        actualJson.put("Edad", 22);

        expectedJson.put("Nombre", "MELO");
        expectedJson.put("Edad", "NEXT");

        boolean expectedResult = true;
        boolean actualResult = MyCompareJSON.compareJson(actualJson.toString(), expectedJson.toString());
        Assertions.assertEquals(expectedResult,actualResult,"ERROR");
    }


}
