/*
 * Copyright (c) 2023 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository https://github.com/whichlicense/js-ecosystem.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

import com.whichlicense.metadata.seeker.MetadataSeeker;
import com.whichlicense.metadata.seeker.yarn.YarnLockSeeker;

module whichlicense.seeker.yarn {
    requires whichlicense.seeker;
    exports com.whichlicense.metadata.seeker.yarn;
    provides MetadataSeeker with YarnLockSeeker;
}
