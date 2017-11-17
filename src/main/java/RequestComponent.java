

import java.util.UUID;
import javax.inject.Named;
import dagger.Subcomponent;

@RequestScope
@Subcomponent(modules = {CommonRequestModule.class})
public interface RequestComponent {

    @Named("UserId")
    UUID getUserId();

    @Subcomponent.Builder
    interface Builder {

        Builder requestModule(CommonRequestModule module);

        RequestComponent build();
    }
}
