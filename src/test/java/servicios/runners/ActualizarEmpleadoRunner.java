package servicios.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = {"@PUT"},
        features = "src/test/resources/servicios/ConsumoApiRest.feature",
        glue = "servicios.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ActualizarEmpleadoRunner {

}
