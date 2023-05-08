package servicios.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = {"@GETS or @POST or @GET or @PUT or @DELETE"},
        features = "src/test/resources/servicios/ConsumoApiRest.feature",
        glue = "servicios.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class servicioE2ERunner {
}
