package com.zh.item.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zh.item.mapper.BrandMapper;
import com.zh.item.pojo.Brand;
import com.zh.leyou.common.PageResult;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/8 13:31
 */
@Service
public interface BrandService {
    /**
     * 分页查询
     * @param brandQueryByPageParameter
     * @return
     */
    PageResult<Brand> queryBrandByPage(BrandQueryByPageParameter brandQueryByPageParameter);

    /**
     * 新增brand,并且维护中间表
     * @param brand
     * @param cids
     */
    void saveBrand(Brand brand, List<Long> cids);

    /**
     * 修改brand，并且维护中间表
     * @param brand
     * @param cids
     */
    void updateBrand(Brand brand, List<Long> cids);

    /**
     * 删除brand，并且维护中间表
     * @param id
     */
    void deleteBrand(Long id);


    /**
     * 根据brand Id 删除中间表中的数据
     * @param bid
     */
    void deleteByBrandIdInCategoryBrand(Long bid);

    /**
     * 根据category id查询brand
     * @param cid
     * @return
     */
    List<Brand> queryBrandByCategoryId(Long cid);

    /**
     * 根据品牌id集合查询品牌信息
     * @param ids
     * @return
     */
    List<Brand> queryBrandByBrandIds(List<Long> ids);
}
