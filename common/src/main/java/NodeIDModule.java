import java.util.UUID;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class NodeIDModule {

	@Named("id")
	@Provides
	static public UUID providesNodeID() {
		return UUID.randomUUID();
	}
}
