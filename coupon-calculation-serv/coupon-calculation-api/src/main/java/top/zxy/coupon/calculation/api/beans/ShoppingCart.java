package top.zxy.coupon.calculation.api.beans;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.zxy.coupon.template.api.beans.CouponInfo;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {
    @NotEmpty
    private List<Product> products;
    private Long couponId;
    private Long cost;

    /*
    * 目前只支持单张优惠券，为了以后的扩展考虑，可以添加多个优惠券的计算逻辑，所有用list
    * */
    private List<CouponInfo> couponInfos;
    @NotEmpty
    private Long userId;
}
