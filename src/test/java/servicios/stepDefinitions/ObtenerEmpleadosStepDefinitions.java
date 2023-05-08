package servicios.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

public class ObtenerEmpleadosStepDefinitions {

    @Given("^brandon envia el siguiente endpoint (.*)$")
    public void brandonEnviaElSiguienteEndpointHttpsDummyRestapiexampleComApiVEmployees(String url) {
        SerenityRest.given().baseUri(url).header("Content-Type","application/json").get();
    }

    @When("^valida que el contenido de la llave \"([^\"]*)\" sea \"([^\"]*)\"$")
    public void validaQueElContenidoDeLaLlaveSea(String llave, String resultado) {
        SerenityRest.lastResponse().then().body(llave, Matchers.equalTo(resultado));
    }

    @Then("^Brandon valida que el codigo de status sea (\\d+)$")
    public void brandonValidaQueElCodigoDeStatusSea(int status) {
        SerenityRest.lastResponse().then().statusCode(status);
    }
}
