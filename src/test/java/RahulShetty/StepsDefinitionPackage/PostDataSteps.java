package RahulShetty.StepsDefinitionPackage;

import RahulShetty.BaseClassPackage.BaseClass;
import RahulShetty.PageClassPackage.PostData;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class PostDataSteps extends BaseClass {
    PostData postData = new PostData();

    @Given("^user is on baseURI$")
    public void user_is_on_baseURI() throws Throwable {
    requestSpecification = given().baseUri(postData.Postbaseuri()).contentType(ContentType.JSON).body(postData.postPayLoad());
    }

    @When("^user create new location in the server using POST method$")
    public void user_create_new_location_in_the_server_using_POST_method() throws Throwable {
        response = requestSpecification.when().post(postData.postResource());
    }

    @Then("^user should be able to see correct location and correct status code$")
    public void user_should_be_able_to_see_correct_location_and_correct_status_code() throws Throwable {
    response.then().log().all().assertThat().contentType(ContentType.JSON).and().body("scope",equalTo("APP"));
    }
}
