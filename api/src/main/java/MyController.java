

import java.util.UUID;
import javax.inject.*;

@Singleton
public class MyController {

    private final APIComponent applicationComponent;

    @Inject
    public MyController(APIComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    public APIRequestComponent handleRequest(UUID userId) {
        return applicationComponent.APIRequestBuilder().requestModule(new CommonRequestModule(userId)).build();
    }

    public APIComponent getApplicationComponent() {
        return applicationComponent;
    }
}
