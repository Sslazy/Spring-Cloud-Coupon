package top.zxy.coupon.customer.api.enums;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponStatus {
    @NotNull
    private Long userId;
    private Long shopId;
    private Integer couponStatus;

}
