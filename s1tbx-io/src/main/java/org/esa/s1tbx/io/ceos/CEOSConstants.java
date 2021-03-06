/*
 * Copyright (C) 2015 by Array Systems Computing Inc. http://www.array.ca
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option)
 * any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, see http://www.gnu.org/licenses/
 */
package org.esa.s1tbx.io.ceos;

import java.io.File;

/**
 * Several constants used for reading CEOS products.
 */
public interface CEOSConstants {

    Class[] VALID_INPUT_TYPES = {File.class, String.class};

    String[] getVolumeFilePrefix();

    String[] getLeaderFilePrefix();

    String[] getImageFilePrefix();

    String[] getTrailerFilePrefix();

    int getMinimumNumFiles();

    String getPluginDescription();

    String[] getFormatNames();

    String[] getForamtFileExtensions();

    String getMission();
}
