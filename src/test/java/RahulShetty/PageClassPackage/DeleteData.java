package RahulShetty.PageClassPackage;

public class DeleteData {
    public String deletePayload(){
        String payload = "{\n" +
                "    \"place_id\":\"0d5a4bb9c6b945162f4bc147c0bd1af6\"\n" +
                "}\n";
        return payload;
    }
    public String deleteResource(){
        String resource = "/maps/api/place/delete/json?key=qaclick123";
        return resource;
    }
}
