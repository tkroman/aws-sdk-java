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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteTransitGatewayPeeringAttachmentRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTransitGatewayPeeringAttachmentRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteTransitGatewayPeeringAttachmentRequest> {

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the transit gateway peering attachment.
     */

    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     * 
     * @return The ID of the transit gateway peering attachment.
     */

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTransitGatewayPeeringAttachmentRequest withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteTransitGatewayPeeringAttachmentRequest> getDryRunRequest() {
        Request<DeleteTransitGatewayPeeringAttachmentRequest> request = new DeleteTransitGatewayPeeringAttachmentRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: ").append(getTransitGatewayAttachmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTransitGatewayPeeringAttachmentRequest == false)
            return false;
        DeleteTransitGatewayPeeringAttachmentRequest other = (DeleteTransitGatewayPeeringAttachmentRequest) obj;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTransitGatewayPeeringAttachmentRequest clone() {
        return (DeleteTransitGatewayPeeringAttachmentRequest) super.clone();
    }
}
