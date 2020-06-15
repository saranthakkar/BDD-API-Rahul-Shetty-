package RahulShetty.PageClassPackage;

public class PutData {
    public String putPayload(){
        String payload = "{\n" +
                "\"place_id\":\"0bbe3183eceffb2414645be4fe9874bf\",\n" +
                "\"address\":\"9 st. Wembley, HA0 2QB\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}\n";
        return payload;
    }

    public String putResource(){
        String resource = "/maps/api/place/update/json?key=qaclick123";
        return resource;
    }
}
