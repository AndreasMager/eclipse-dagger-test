
import javax.inject.*;
import dagger.Component;

@Singleton
@Component(modules = {NodeIDModule.class, ServerModule.class})
public interface CommonComponent {

    RequestComponent.Builder requestBuilder();

}
