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
    private long cost;
    private List<CouponInfo> couponInfos;
    @NotEmpty
    private Long userId;
}
