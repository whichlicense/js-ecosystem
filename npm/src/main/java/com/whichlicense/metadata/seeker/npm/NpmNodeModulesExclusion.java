/*
 * Copyright (c) 2023 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository https://github.com/whichlicense/js-ecosystem.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package com.whichlicense.metadata.seeker.npm;

import com.whichlicense.metadata.seeker.MetadataExclusion;
import com.whichlicense.metadata.seeker.MetadataSourceType;

import java.util.Collections;
import java.util.Set;

import static com.whichlicense.metadata.seeker.MetadataSourceType.DIRECTORY;

/**
 * A concrete implementation of the MetadataExclusion interface that excludes
 * the "node_modules" directory from metadata processing.
 *
 * @author David Greven
 * @version 0
 * @since 0.0.0
 */
public record NpmNodeModulesExclusion() implements MetadataExclusion {
    /**
     * Returns a singleton set of the "node_modules" glob pattern.
     *
     * @return A singleton set of a glob pattern as a string.
     * @since 0.0.0
     */
    @Override
    public Set<String> globs() {
        return Collections.singleton("**/node_modules");
    }

    /**
     * Returns the metadata source type {@link MetadataSourceType#DIRECTORY}.
     *
     * @return The type of metadata source as a MetadataSourceType enum value.
     * @since 0.0.0
     */
    @Override
    public MetadataSourceType type() {
        return DIRECTORY;
    }
}
