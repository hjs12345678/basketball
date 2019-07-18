package com.example.basketball.domain;

import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class UserStory {
    @ApiModelProperty("用户故事的唯一标识")
    private String id;
    @ApiModelProperty("关联用户表的openId")
    private String openId;
    @ApiModelProperty("故事的标题")
    private String title;
    @ApiModelProperty("故事的内容")
    private String content;
    @ApiModelProperty("故事的创建时间")
    private Date createTime;
}
