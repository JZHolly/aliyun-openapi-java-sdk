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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cspro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetSnapshotInfoRequest extends RpcAcsRequest<GetSnapshotInfoResponse> {
	   

	private String snapshotKey;
	public GetSnapshotInfoRequest() {
		super("cspro", "2018-03-15", "GetSnapshotInfo");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSnapshotKey() {
		return this.snapshotKey;
	}

	public void setSnapshotKey(String snapshotKey) {
		this.snapshotKey = snapshotKey;
		if(snapshotKey != null){
			putQueryParameter("SnapshotKey", snapshotKey);
		}
	}

	@Override
	public Class<GetSnapshotInfoResponse> getResponseClass() {
		return GetSnapshotInfoResponse.class;
	}

}
