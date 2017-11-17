
import javax.inject.*;
import dagger.Component;

@Singleton
@Component(modules = {ServerModule.class})
public interface CommonComponent {

    RequestComponent.Builder requestBuilder();

}
