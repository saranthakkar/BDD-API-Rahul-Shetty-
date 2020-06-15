package RahulShetty.StepsDefinitionPackage;

import RahulShetty.BaseClassPackage.BaseClass;
import RahulShetty.PageClassPackage.PostData;
import RahulShetty.PageClassPackage.PutData;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class PutDataSteps extends BaseClass {
    PostData postData = new PostData();
    PutData putData = new PutData();

    @Given("^user is on baseURI of website - Rahul Shetty$")
    public void user_is_on_baseURI_of_website_Rahul_Shetty() throws Throwable {
    requestSpecification = given().baseUri(postData.Postbaseuri()).contentType(ContentType.JSON).body(putData.putPayload());
    }

    @When("^user uses PUT method with resources and query parameters$")
    public void user_uses_PUT_method_with_resources_and_query_parameters() throws Throwable {
    response = requestSpecification.when().put(putData.putResource());
    }

    @Then("^user should be able to see new updated data$")
    public void user_should_be_able_to_see_new_updated_data() throws Throwable {
    response.then().log().all().assertThat().contentType(ContentType.JSON);
    }
}
