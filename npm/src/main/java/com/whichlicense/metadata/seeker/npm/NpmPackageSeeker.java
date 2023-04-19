/*
 * Copyright (c) 2023 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository https://github.com/whichlicense/js-ecosystem.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package com.whichlicense.metadata.seeker.npm;

import com.whichlicense.metadata.seeker.MetadataSeeker;
import com.whichlicense.metadata.seeker.MetadataSourceType;

import java.util.Collections;
import java.util.Set;

import static com.whichlicense.metadata.seeker.MetadataSourceType.FILE;

/**
 * A concrete implementation of the MetadataSeeker interface that seeks for package.json files.
 *
 * @author David Greven
 * @version 0
 * @since 0.0.0
 */
public record NpmPackageSeeker() implements MetadataSeeker {
    /**
     * Returns a singleton set of the package.json glob pattern.
     *
     * @return A singleton set of a glob pattern as a string.
     * @since 0.0.0
     */
    @Override
    public Set<String> globs() {
        return Collections.singleton("**/package.json");
    }

    /**
     * Returns the metadata source type {@link MetadataSourceType#FILE}.
     *
     * @return The type of metadata source as a MetadataSourceType enum value.
     * @since 0.0.0
     */
    @Override
    public MetadataSourceType type() {
        return FILE;
    }
}
