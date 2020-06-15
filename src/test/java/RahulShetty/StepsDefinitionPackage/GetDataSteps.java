package RahulShetty.StepsDefinitionPackage;

import RahulShetty.BaseClassPackage.BaseClass;
import RahulShetty.PageClassPackage.GetData;
import RahulShetty.PageClassPackage.PostData;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class GetDataSteps extends BaseClass {
    PostData postData = new PostData();
    GetData getData = new GetData();

    @Given("^user is on baseURI of Rahul Shetty$")
    public void user_is_on_baseURI_of_Rahul_Shetty() throws Throwable {
        requestSpecification = given().baseUri(postData.Postbaseuri()).contentType(ContentType.JSON);
    }

    @When("^user uses GET method and selects resources and query parameters$")
    public void user_uses_GET_method_and_selects_resources_and_query_parameters() throws Throwable {
        response = requestSpecification.when().get(getData.getResource());
    }

    @Then("^user should be able to see correct response, correct status code with JSON Content type$")
    public void user_should_be_able_to_see_correct_response_correct_status_code_with_JSON_Content_type() throws Throwable {
    response.then().log().all().assertThat().contentType(ContentType.JSON).and().body("name",equalTo("Frontline house"));
    }
}
