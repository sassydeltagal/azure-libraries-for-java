/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * ResourceNavigationLink resource.
 */
@JsonFlatten
public class ResourceNavigationLinkInner extends SubResource {
    /**
     * Resource type of the linked resource.
     */
    @JsonProperty(value = "properties.linkedResourceType")
    private String linkedResourceType;

    /**
     * Link to the external resource.
     */
    @JsonProperty(value = "properties.link")
    private String link;

    /**
     * Provisioning state of the ResourceNavigationLink resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the linkedResourceType value.
     *
     * @return the linkedResourceType value
     */
    public String linkedResourceType() {
        return this.linkedResourceType;
    }

    /**
     * Set the linkedResourceType value.
     *
     * @param linkedResourceType the linkedResourceType value to set
     * @return the ResourceNavigationLinkInner object itself.
     */
    public ResourceNavigationLinkInner withLinkedResourceType(String linkedResourceType) {
        this.linkedResourceType = linkedResourceType;
        return this;
    }

    /**
     * Get the link value.
     *
     * @return the link value
     */
    public String link() {
        return this.link;
    }

    /**
     * Set the link value.
     *
     * @param link the link value to set
     * @return the ResourceNavigationLinkInner object itself.
     */
    public ResourceNavigationLinkInner withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ResourceNavigationLinkInner object itself.
     */
    public ResourceNavigationLinkInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
