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
package com.fshop.order.service.impl;

import com.fshop.order.entity.OrderSub;
import com.fshop.order.mapper.OrderSubMapper;
import com.fshop.order.service.IOrderSubService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description: 子订单表服务接口实现类
 *
 * @author rannuo1010@gmail.com
 * @date 2020/2/22
 */
@Service
public class OrderSubServiceImpl extends ServiceImpl<OrderSubMapper, OrderSub> implements IOrderSubService {

    @Resource
    private OrderSubMapper orderSubMapper;

}