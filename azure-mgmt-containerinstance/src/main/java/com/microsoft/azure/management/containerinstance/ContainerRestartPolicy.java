/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ContainerRestartPolicy.
 */
public final class ContainerRestartPolicy {
    /** Static value always for ContainerRestartPolicy. */
    public static final ContainerRestartPolicy ALWAYS = new ContainerRestartPolicy("always");

    private String value;

    /**
     * Creates a custom value for ContainerRestartPolicy.
     * @param value the custom value
     */
    public ContainerRestartPolicy(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ContainerRestartPolicy)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ContainerRestartPolicy rhs = (ContainerRestartPolicy) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
