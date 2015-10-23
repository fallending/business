/**
 * Copyright (c) 2013-2015, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.business.fixtures.domain.customer;

import org.seedstack.business.api.domain.BaseValueObject;
 
public class CustomerId extends BaseValueObject{
	
	
	private String customerId;
    
	CustomerId ()  
    {
    }
	
	public CustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerId() {
		return customerId;
	}
    
	private static final long serialVersionUID = -1001839378447878324L;
	
}
