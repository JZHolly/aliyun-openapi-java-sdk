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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeCustomOcrTemplateResponse;
import com.aliyuncs.green.model.v20170823.DescribeCustomOcrTemplateResponse.OcrTemplate;
import com.aliyuncs.green.model.v20170823.DescribeCustomOcrTemplateResponse.OcrTemplate.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomOcrTemplateResponseUnmarshaller {

	public static DescribeCustomOcrTemplateResponse unmarshall(DescribeCustomOcrTemplateResponse describeCustomOcrTemplateResponse, UnmarshallerContext context) {
		
		describeCustomOcrTemplateResponse.setRequestId(context.stringValue("DescribeCustomOcrTemplateResponse.RequestId"));
		describeCustomOcrTemplateResponse.setTotalCount(context.integerValue("DescribeCustomOcrTemplateResponse.TotalCount"));

		List<OcrTemplate> ocrTemplateList = new ArrayList<OcrTemplate>();
		for (int i = 0; i < context.lengthValue("DescribeCustomOcrTemplateResponse.OcrTemplateList.Length"); i++) {
			OcrTemplate ocrTemplate = new OcrTemplate();
			ocrTemplate.setId(context.longValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].Id"));
			ocrTemplate.setName(context.stringValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].Name"));
			ocrTemplate.setImgUrl(context.stringValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].ImgUrl"));
			ocrTemplate.setStatus(context.integerValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].Status"));

			List<Item> referArea = new ArrayList<Item>();
			for (int j = 0; j < context.lengthValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].ReferArea.Length"); j++) {
				Item item = new Item();
				item.setName(context.stringValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].ReferArea["+ j +"].Name"));
				item.setX(context.integerValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].ReferArea["+ j +"].X"));
				item.setY(context.integerValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].ReferArea["+ j +"].Y"));
				item.setWidth(context.integerValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].ReferArea["+ j +"].Width"));
				item.setHeight(context.integerValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].ReferArea["+ j +"].Height"));

				referArea.add(item);
			}
			ocrTemplate.setReferArea(referArea);

			List<Item> recognizeArea = new ArrayList<Item>();
			for (int j = 0; j < context.lengthValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].RecognizeArea.Length"); j++) {
				Item item = new Item();
				item.setName(context.stringValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].RecognizeArea["+ j +"].Name"));
				item.setX(context.integerValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].RecognizeArea["+ j +"].X"));
				item.setY(context.integerValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].RecognizeArea["+ j +"].Y"));
				item.setWidth(context.integerValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].RecognizeArea["+ j +"].Width"));
				item.setHeight(context.integerValue("DescribeCustomOcrTemplateResponse.OcrTemplateList["+ i +"].RecognizeArea["+ j +"].Height"));

				recognizeArea.add(item);
			}
			ocrTemplate.setRecognizeArea(recognizeArea);

			ocrTemplateList.add(ocrTemplate);
		}
		describeCustomOcrTemplateResponse.setOcrTemplateList(ocrTemplateList);
	 
	 	return describeCustomOcrTemplateResponse;
	}
}