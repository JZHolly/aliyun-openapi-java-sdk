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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveClusterNodeRequest extends RpcAcsRequest<RemoveClusterNodeResponse> {
	   

	private List<String> ecsInstanceIdLists;

	private String clusterInstanceId;
	public RemoveClusterNodeRequest() {
		super("retailcloud", "2018-03-13", "RemoveClusterNode");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getEcsInstanceIdLists() {
		return this.ecsInstanceIdLists;
	}

	public void setEcsInstanceIdLists(List<String> ecsInstanceIdLists) {
		this.ecsInstanceIdLists = ecsInstanceIdLists;	
		if (ecsInstanceIdLists != null) {
			for (int i = 0; i < ecsInstanceIdLists.size(); i++) {
				putQueryParameter("EcsInstanceIdList." + (i + 1) , ecsInstanceIdLists.get(i));
			}
		}	
	}

	public String getClusterInstanceId() {
		return this.clusterInstanceId;
	}

	public void setClusterInstanceId(String clusterInstanceId) {
		this.clusterInstanceId = clusterInstanceId;
		if(clusterInstanceId != null){
			putQueryParameter("ClusterInstanceId", clusterInstanceId);
		}
	}

	@Override
	public Class<RemoveClusterNodeResponse> getResponseClass() {
		return RemoveClusterNodeResponse.class;
	}

}
