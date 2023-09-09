package top.zxy.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.zxy.coupon.calculation.api.beans.ShoppingCart;
import top.zxy.coupon.calculation.template.AbstractRuleTemplate;
import top.zxy.coupon.calculation.template.RuleTemplate;

@Slf4j
@Component
public class DummyTemplate extends AbstractRuleTemplate implements RuleTemplate {
    @Override
    public ShoppingCart calculate(ShoppingCart order){
        // 获取订单总价
        long orderTotalAmount = getTotalPrice(order.getProducts());
        order.setCost(orderTotalAmount);
        return order;
    }

    @Override
    protected Long calculateNewPrice(Long orderTotalAmount,Long shopTotalAmount,Long quota){
        return orderTotalAmount;
    }
}
