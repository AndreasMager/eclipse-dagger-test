
import java.util.*;

import javax.inject.Named;

import dagger.*;

@Module
public class CommonRequestModule {

    private final UUID userId;

    public CommonRequestModule(UUID user) {
        this.userId = user;
    }

    @Provides
    @RequestScope
    @Named("UserId")
    public UUID provideUserId() {
        return userId;
    }
    
    @Provides
    @RequestScope
    public static String provideFeaturePack(@Named("UserId") UUID userId) {
        return "Test";
    }
}
