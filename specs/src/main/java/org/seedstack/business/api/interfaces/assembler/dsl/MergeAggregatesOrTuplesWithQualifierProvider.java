/**
 * Copyright (c) 2013-2015, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.business.api.interfaces.assembler.dsl;

/**
 * @author pierre.thirouin@ext.mpsa.com (Pierre Thirouin)
 */
public interface MergeAggregatesOrTuplesWithQualifierProvider<D> extends MergeAggregatesOrTuplesProvider<D>, QualifierProvider<MergeAggregatesOrTuplesProvider<D>> {
}
