/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The infrastructure used when building EC2 AMIs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/InfrastructureConfigurationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InfrastructureConfigurationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     */
    private String dateCreated;
    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     */
    private String dateUpdated;
    /**
     * <p>
     * The tags attached to the image created by Image Builder.
     * </p>
     */
    private java.util.Map<String, String> resourceTags;
    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the infrastructure configuration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfigurationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * 
     * @param name
     *        The name of the infrastructure configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * 
     * @return The name of the infrastructure configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * 
     * @param name
     *        The name of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfigurationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * 
     * @param description
     *        The description of the infrastructure configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * 
     * @return The description of the infrastructure configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * 
     * @param description
     *        The description of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfigurationSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which the infrastructure configuration was created.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     * 
     * @return The date on which the infrastructure configuration was created.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which the infrastructure configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfigurationSummary withDateCreated(String dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     * 
     * @param dateUpdated
     *        The date on which the infrastructure configuration was last updated.
     */

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     * 
     * @return The date on which the infrastructure configuration was last updated.
     */

    public String getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     * 
     * @param dateUpdated
     *        The date on which the infrastructure configuration was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfigurationSummary withDateUpdated(String dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    /**
     * <p>
     * The tags attached to the image created by Image Builder.
     * </p>
     * 
     * @return The tags attached to the image created by Image Builder.
     */

    public java.util.Map<String, String> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * The tags attached to the image created by Image Builder.
     * </p>
     * 
     * @param resourceTags
     *        The tags attached to the image created by Image Builder.
     */

    public void setResourceTags(java.util.Map<String, String> resourceTags) {
        this.resourceTags = resourceTags;
    }

    /**
     * <p>
     * The tags attached to the image created by Image Builder.
     * </p>
     * 
     * @param resourceTags
     *        The tags attached to the image created by Image Builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfigurationSummary withResourceTags(java.util.Map<String, String> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * Add a single ResourceTags entry
     *
     * @see InfrastructureConfigurationSummary#withResourceTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfigurationSummary addResourceTagsEntry(String key, String value) {
        if (null == this.resourceTags) {
            this.resourceTags = new java.util.HashMap<String, String>();
        }
        if (this.resourceTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.resourceTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResourceTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfigurationSummary clearResourceTagsEntries() {
        this.resourceTags = null;
        return this;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     * 
     * @return The tags of the infrastructure configuration.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     * 
     * @param tags
     *        The tags of the infrastructure configuration.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     * 
     * @param tags
     *        The tags of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfigurationSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see InfrastructureConfigurationSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfigurationSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfigurationSummary clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: ").append(getDateUpdated()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InfrastructureConfigurationSummary == false)
            return false;
        InfrastructureConfigurationSummary other = (InfrastructureConfigurationSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public InfrastructureConfigurationSummary clone() {
        try {
            return (InfrastructureConfigurationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.InfrastructureConfigurationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
