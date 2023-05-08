package servicios.stepDefinitions;

import cucumber.api.java.en.Given;
import net.serenitybdd.rest.SerenityRest;

public class EliminarEmpleadoStepDefinitions {

    @Given("^Brandon envia la siguiente informacion (.*)$")
    public void brandonEnviaLaSiguienteInformacionHttpsDummyRestapiexampleComApiVDelete(String url) {
        SerenityRest.given().baseUri(url).header("Content-Type","application/json").delete();
    }

}
