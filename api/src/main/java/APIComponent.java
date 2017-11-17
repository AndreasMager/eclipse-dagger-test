


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NodeIDModule.class, APIServerModule.class})
public interface APIComponent extends CommonComponent {

    APIRequestComponent.Builder APIRequestBuilder();
}
