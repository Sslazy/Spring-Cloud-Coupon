package top.zxy.coupon.template.api.beans;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.zxy.coupon.template.api.beans.rules.TemplateRule;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponTemplateInfo {
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String desc;

    @NotNull
    private String type;

    private Long shopId;

    @NotNull
    private TemplateRule rule;
    private Boolean available;
}
