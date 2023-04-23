/*
 * Copyright (c) 2023 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository https://github.com/whichlicense/js-ecosystem.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

import com.whichlicense.metadata.seeker.MetadataExclusion;
import com.whichlicense.metadata.seeker.MetadataSeeker;
import com.whichlicense.metadata.seeker.npm.NpmNodeModulesExclusion;
import com.whichlicense.metadata.seeker.npm.NpmPackageLockSeeker;
import com.whichlicense.metadata.seeker.npm.NpmPackageSeeker;

module whichlicense.seeker.npm {
    requires transitive whichlicense.seeker;
    exports com.whichlicense.metadata.seeker.npm;
    provides MetadataExclusion with NpmNodeModulesExclusion;
    provides MetadataSeeker with NpmPackageSeeker, NpmPackageLockSeeker;
}
