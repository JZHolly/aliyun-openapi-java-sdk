/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitImageSearchJobRequest extends RpcAcsRequest<SubmitImageSearchJobResponse> {
	   

	private Long resourceOwnerId;

	private String fpDBId;

	private String userData;

	private String inputVideo;

	private String inputImage;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String pipelineId;

	private String config;
	public SubmitImageSearchJobRequest() {
		super("Mts", "2014-06-18", "SubmitImageSearchJob", "mts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getFpDBId() {
		return this.fpDBId;
	}

	public void setFpDBId(String fpDBId) {
		this.fpDBId = fpDBId;
		if(fpDBId != null){
			putQueryParameter("FpDBId", fpDBId);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getInputVideo() {
		return this.inputVideo;
	}

	public void setInputVideo(String inputVideo) {
		this.inputVideo = inputVideo;
		if(inputVideo != null){
			putQueryParameter("InputVideo", inputVideo);
		}
	}

	public String getInputImage() {
		return this.inputImage;
	}

	public void setInputImage(String inputImage) {
		this.inputImage = inputImage;
		if(inputImage != null){
			putQueryParameter("InputImage", inputImage);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putQueryParameter("PipelineId", pipelineId);
		}
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putQueryParameter("Config", config);
		}
	}

	@Override
	public Class<SubmitImageSearchJobResponse> getResponseClass() {
		return SubmitImageSearchJobResponse.class;
	}

}
