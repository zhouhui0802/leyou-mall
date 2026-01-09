package com.zh.leyou.common;


import lombok.Data;

import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/8 13:28
 */
@Data
public class PageResult<T> {

    private Long total;// 总条数
    private Long totalPage;// 总页数
    private List<T> items;// 当前页数据

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }
}
