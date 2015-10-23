/**
 * Copyright (c) 2013-2015, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.business.test.event;

/**
 * The {@code EventProvider} class provides a method which fire the event to test.
 */
public interface EventProvider {

    /**
     * Actually fires the event.
     *
     * @return itself
     */
    EventServiceProvider whenFired();
}