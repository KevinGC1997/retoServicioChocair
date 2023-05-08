package servicios.stepDefinitions;

import cucumber.api.java.en.Given;
import net.serenitybdd.rest.SerenityRest;

public class ObtenerUnEmpleadoStepDefinitions {

    @Given("^brandon envia el siguiente informacion (.*)$")
    public void brandonEnviaElSiguienteInformacionHttpsDummyRestapiexampleComApiVEmployee(String url) {
        SerenityRest.given().baseUri(url).header("Content-Type","application/json").get();
    }
}
