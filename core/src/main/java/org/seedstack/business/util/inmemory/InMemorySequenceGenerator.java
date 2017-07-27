/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.seedstack.business.util.inmemory;

import org.seedstack.business.domain.Entity;
import org.seedstack.business.domain.SequenceGenerator;
import org.seedstack.seed.ClassConfiguration;

import javax.inject.Named;
import java.util.concurrent.atomic.AtomicLong;


/**
 * Sequence generator that uses an every-incrementing {@link AtomicLong}.
 */
@Named("inMemorySequence")
public class InMemorySequenceGenerator implements SequenceGenerator<Long> {
    private static final AtomicLong sequence = new AtomicLong(1L);

    @Override
    public <E extends Entity<Long>> Long generate(Class<E> entityClass, ClassConfiguration<E> entityConfiguration) {
        return sequence.incrementAndGet();
    }
}