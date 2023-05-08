package servicios.stepDefinitions;

import cucumber.api.java.en.Given;
import net.serenitybdd.rest.SerenityRest;

import java.util.Map;

public class ActualizarEmpleadoStepDefinitions {

    @Given("^brandon envia el siguiente informacionPUT (.*)$")
    public void brandonEnviaElSiguienteInformacionPUTHttpsDummyRestapiexampleComApiVUpdate(String url, Map<String,String> cuerpo) {
        SerenityRest.given().baseUri(url).header("Content-Type","application/json").body(cuerpo).put();
    }
}
