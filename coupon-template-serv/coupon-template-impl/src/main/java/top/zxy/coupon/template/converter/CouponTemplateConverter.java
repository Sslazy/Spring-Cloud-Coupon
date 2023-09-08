package top.zxy.coupon.template.converter;

import top.zxy.coupon.template.api.beans.CouponTemplateInfo;

public class CouponTemplateConverter {
    public static CouponTemplateInfo convertToTemplateInfo(top.zxy.coupon.template.dao.entity.CouponTemplate template){

        return CouponTemplateInfo.builder()
                .id(template.getId())
                .name(template.getName())
                .desc(template.getDescription())
                .type(template.getCategory().getCode())
                .shopId(template.getShopId())
                .available(template.getAvailable())
                .rule(template.getRule())
                .build();
    }
}
