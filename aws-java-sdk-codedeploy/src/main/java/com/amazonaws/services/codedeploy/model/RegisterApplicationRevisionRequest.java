/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#registerApplicationRevision(RegisterApplicationRevisionRequest) RegisterApplicationRevision operation}.
 * <p>
 * Registers with AWS CodeDeploy a revision for the specified
 * application.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#registerApplicationRevision(RegisterApplicationRevisionRequest)
 */
public class RegisterApplicationRevisionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * A comment about the revision.
     */
    private String description;

    /**
     * Information about the application revision to register, including the
     * revision's type and its location.
     */
    private RevisionLocation revision;

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterApplicationRevisionRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * A comment about the revision.
     *
     * @return A comment about the revision.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A comment about the revision.
     *
     * @param description A comment about the revision.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A comment about the revision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A comment about the revision.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterApplicationRevisionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Information about the application revision to register, including the
     * revision's type and its location.
     *
     * @return Information about the application revision to register, including the
     *         revision's type and its location.
     */
    public RevisionLocation getRevision() {
        return revision;
    }
    
    /**
     * Information about the application revision to register, including the
     * revision's type and its location.
     *
     * @param revision Information about the application revision to register, including the
     *         revision's type and its location.
     */
    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }
    
    /**
     * Information about the application revision to register, including the
     * revision's type and its location.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param revision Information about the application revision to register, including the
     *         revision's type and its location.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterApplicationRevisionRequest withRevision(RevisionLocation revision) {
        this.revision = revision;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getRevision() != null) sb.append("Revision: " + getRevision() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterApplicationRevisionRequest == false) return false;
        RegisterApplicationRevisionRequest other = (RegisterApplicationRevisionRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getRevision() == null ^ this.getRevision() == null) return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false) return false; 
        return true;
    }
    
}
    