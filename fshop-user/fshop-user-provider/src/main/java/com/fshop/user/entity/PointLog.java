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
package com.fshop.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Description: 积分日志表实体类
 *
 * @author rannuo1010@gmail.com
 * @date 2020/2/22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("su_point_log")
public class PointLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 积分日志ID
     */
    @TableId(value = "point_id", type = IdType.AUTO)
    private Long pointId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 积分来源：0订单，1登陆，2活动
     */
    private Integer source;

    /**
     * 积分来源相关编号
     */
    private Integer referNumber;

    /**
     * 变更积分数
     */
    private Integer changePoint;

    /**
     * 积分日志生成时间
     */
    private LocalDateTime createTime;


}