package RahulShetty.StepsDefinitionPackage;

import RahulShetty.BaseClassPackage.BaseClass;
import RahulShetty.PageClassPackage.DeleteData;
import RahulShetty.PageClassPackage.PostData;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.hu.De;

import static io.restassured.RestAssured.given;

public class DeleteDataSteps extends BaseClass {
    PostData postData = new PostData();
    DeleteData deleteData = new DeleteData();

    @Given("^user is on baseURI homepage$")
    public void user_is_on_baseURI_homepage() throws Throwable {
    requestSpecification = given().baseUri(postData.Postbaseuri()).body(deleteData.deletePayload());
    }

    @When("^user uses DELETE method with resource and query parameters$")
    public void user_uses_DELETE_method_with_resource_and_query_parameters() throws Throwable {
        response = requestSpecification.when().delete(deleteData.deleteResource());
    }

    @Then("^user should be ale to see that place ID has been successfully deleted$")
    public void user_should_be_ale_to_see_that_place_ID_has_been_successfully_deleted() throws Throwable {
    response.then().log().all();
    }
}
