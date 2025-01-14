// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RuleCacheBehavior. */
public final class RuleCacheBehavior extends ExpandableStringEnum<RuleCacheBehavior> {
    /** Static value HonorOrigin for RuleCacheBehavior. */
    public static final RuleCacheBehavior HONOR_ORIGIN = fromString("HonorOrigin");

    /** Static value OverrideAlways for RuleCacheBehavior. */
    public static final RuleCacheBehavior OVERRIDE_ALWAYS = fromString("OverrideAlways");

    /** Static value OverrideIfOriginMissing for RuleCacheBehavior. */
    public static final RuleCacheBehavior OVERRIDE_IF_ORIGIN_MISSING = fromString("OverrideIfOriginMissing");

    /**
     * Creates or finds a RuleCacheBehavior from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RuleCacheBehavior.
     */
    @JsonCreator
    public static RuleCacheBehavior fromString(String name) {
        return fromString(name, RuleCacheBehavior.class);
    }

    /** @return known RuleCacheBehavior values. */
    public static Collection<RuleCacheBehavior> values() {
        return values(RuleCacheBehavior.class);
    }
}
