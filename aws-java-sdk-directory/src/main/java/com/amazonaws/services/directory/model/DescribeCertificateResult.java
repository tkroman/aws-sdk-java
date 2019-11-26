/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the certificate, including registered date time, certificate state, the reason for the state,
     * expiration date time, and certificate common name.
     * </p>
     */
    private Certificate certificate;

    /**
     * <p>
     * Information about the certificate, including registered date time, certificate state, the reason for the state,
     * expiration date time, and certificate common name.
     * </p>
     * 
     * @param certificate
     *        Information about the certificate, including registered date time, certificate state, the reason for the
     *        state, expiration date time, and certificate common name.
     */

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * Information about the certificate, including registered date time, certificate state, the reason for the state,
     * expiration date time, and certificate common name.
     * </p>
     * 
     * @return Information about the certificate, including registered date time, certificate state, the reason for the
     *         state, expiration date time, and certificate common name.
     */

    public Certificate getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * Information about the certificate, including registered date time, certificate state, the reason for the state,
     * expiration date time, and certificate common name.
     * </p>
     * 
     * @param certificate
     *        Information about the certificate, including registered date time, certificate state, the reason for the
     *        state, expiration date time, and certificate common name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateResult withCertificate(Certificate certificate) {
        setCertificate(certificate);
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
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCertificateResult == false)
            return false;
        DescribeCertificateResult other = (DescribeCertificateResult) obj;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCertificateResult clone() {
        try {
            return (DescribeCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
