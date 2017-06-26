/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.business.pagination.builder;

import org.seedstack.business.domain.AggregateRoot;

public interface PaginatorPaginationPicker<A extends AggregateRoot<ID>, ID>{

    PageSizeOptionPicker<A, ID> page(int page);

    ChunkLimitOptionPicker<A, ID> offset(int offset);

    ChunkAfterKeyOptionPicker<A, ID> key(String key);
}
