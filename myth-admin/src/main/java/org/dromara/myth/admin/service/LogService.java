/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.myth.admin.service;

import org.dromara.myth.admin.page.CommonPager;
import org.dromara.myth.admin.query.ConditionQuery;
import org.dromara.myth.admin.vo.LogVO;

import java.util.List;

/**
 * LogService.
 *
 * @author xiaoyu(Myth)
 */
public interface LogService {

    /**
     * acquired {@linkplain LogVO} by page.
     *
     * @param query {@linkplain ConditionQuery}
     * @return CommonPager LogVO
     */
    CommonPager<LogVO> listByPage(ConditionQuery query);

    /**
     * batch remove transaction log by ids.
     *
     * @param ids     ids
     * @param appName appName
     * @return true
     */
    Boolean batchRemove(List<String> ids, String appName);

    /**
     * modify retry count.
     *
     * @param id      transId
     * @param retry   retry
     * @param appName appName
     * @return true
     */
    Boolean updateRetry(String id, Integer retry, String appName);
}
