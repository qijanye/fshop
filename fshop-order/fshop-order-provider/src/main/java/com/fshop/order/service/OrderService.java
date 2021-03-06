/*
 * Copyright 2020 rannuo1010@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fshop.order.service;

import com.fshop.order.model.query.OrderCreateQuery;

/**
 * Description: 订单处理器
 *
 * @author rannuo1010@gmail.com
 * @date 2020/2/22
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param orderCreateQuery
     */
    void createOrder(OrderCreateQuery orderCreateQuery);

}
