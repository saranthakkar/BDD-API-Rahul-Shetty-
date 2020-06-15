package RahulShetty.PageClassPackage;

public class PostData {
    public String Postbaseuri(){
        String baseUri = "https://rahulshettyacademy.com";
        return baseUri;
    }

    public String postPayLoad(){
        String payload = "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Frontline house\",\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}\n";
        return payload;
    }

    public String postResource(){
        String resource = "maps/api/place/add/json?key=qaclick123";
        return resource;
    }
}
