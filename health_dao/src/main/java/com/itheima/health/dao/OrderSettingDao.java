package com.itheima.health.dao;

import com.itheima.health.pojo.OrderSetting;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2021/1/9
 */
public interface OrderSettingDao {
    /**
     * 通过日期查询预约设置信息,日期唯一
     * @param orderDate
     * @return
     */
    OrderSetting findByOrderDate(Date orderDate);

    /**
     * 添加预约设置信息
     * @param os
     */
    void add(OrderSetting os);

    /**
     * 通过日期更新最大预约数
     * @param os
     */
    void updateNumber(OrderSetting os);

    /**
     * 按月查询预约设置信息
     * @param month
     * @return
     */
    List<Map<String, Integer>> getOrderSettingByMonth(String month);
}
