package com.cershy.linyuserver.vo.friend;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UnCareForFriendVo {

    @NotNull(message = "好友不能为空")
    private String friendId;
}
