/**
 * Copyright (c) 2013-2015, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.business.fixtures.domain.discount;

import org.seedstack.business.api.domain.GenericFactory;

import javax.validation.constraints.NotNull;

/**
 *
 * 
 * @author epo.jemba@ext.mpsa.com
 *
 */
public interface DiscountFactory extends GenericFactory<Discount> {
	
	public Discount createNewActivation(@NotNull String id , String description);

}
