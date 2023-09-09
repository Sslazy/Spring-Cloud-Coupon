package top.zxy.coupon.calculation.template;

import top.zxy.coupon.calculation.api.beans.ShoppingCart;

public interface RuleTemplate {

    ShoppingCart calculate(ShoppingCart settlement);
}
