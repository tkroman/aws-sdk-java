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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeRepositoryAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRepositoryAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     * <code>ListRepositories</code>.
     * </p>
     */
    private String associationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     * <code>ListRepositories</code>.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     *        <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     *        <code>ListRepositories</code>.
     */

    public void setAssociationArn(String associationArn) {
        this.associationArn = associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     * <code>ListRepositories</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     *         <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     *         <code>ListRepositories</code>.
     */

    public String getAssociationArn() {
        return this.associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     * <code>ListRepositories</code>.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     *        <code>RepositoryAssociation</code> </a> object. You can retrieve this ARN by calling
     *        <code>ListRepositories</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoryAssociationRequest withAssociationArn(String associationArn) {
        setAssociationArn(associationArn);
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
        if (getAssociationArn() != null)
            sb.append("AssociationArn: ").append(getAssociationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRepositoryAssociationRequest == false)
            return false;
        DescribeRepositoryAssociationRequest other = (DescribeRepositoryAssociationRequest) obj;
        if (other.getAssociationArn() == null ^ this.getAssociationArn() == null)
            return false;
        if (other.getAssociationArn() != null && other.getAssociationArn().equals(this.getAssociationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationArn() == null) ? 0 : getAssociationArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRepositoryAssociationRequest clone() {
        return (DescribeRepositoryAssociationRequest) super.clone();
    }

}
