

import dagger.Subcomponent;

@RequestScope
@Subcomponent(modules = {CommonRequestModule.class})
public interface APIRequestComponent extends RequestComponent {

    @Subcomponent.Builder
    interface Builder {

        Builder requestModule(CommonRequestModule module);

        APIRequestComponent build();
    }
}
