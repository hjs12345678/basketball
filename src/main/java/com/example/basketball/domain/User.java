package com.example.basketball.domain;

import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class User {
    @ApiModelProperty("用户的微信名")
    private String userName;
    @ApiModelProperty("用户的主键唯一标识")
    private String openId;
    @ApiModelProperty("性别 1：男 2；女")
    private int gender;
    @ApiModelProperty("地区")
    private String area;

}
