package app.routes;

import app.controllers.PopulateController;
import io.javalin.apibuilder.EndpointGroup;

import static io.javalin.apibuilder.ApiBuilder.post;

public class PopulateRoutes {
    PopulateController populateController = new PopulateController();
    public EndpointGroup getRoutes(){
        return () -> {
            post("/", populateController::populate);
        };
    }
}
