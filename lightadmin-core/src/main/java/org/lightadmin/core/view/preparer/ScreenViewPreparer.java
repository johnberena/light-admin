package org.lightadmin.core.view.preparer;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.context.TilesRequestContext;
import org.lightadmin.core.config.DomainTypeAdministrationConfiguration;

public class ScreenViewPreparer extends ViewContextPreparer {

	@Override
	protected void execute( final TilesRequestContext tilesContext, final AttributeContext attributeContext, final DomainTypeAdministrationConfiguration configuration ) {
		super.execute( tilesContext, attributeContext, configuration );

		addAttribute( attributeContext, "screenContext", configuration.getScreenContext(), true );
	}
}