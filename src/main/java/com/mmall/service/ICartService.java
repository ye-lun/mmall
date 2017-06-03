package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVo;

/**
 * Created by Yelun on 2017/6/2.
 */
public interface ICartService {

    public ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);
    public ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);
    public ServerResponse<CartVo>  deleteProduct(Integer userId,String productIds);
    public ServerResponse<CartVo> list (Integer userId);
    public ServerResponse<CartVo> selectOrUnSelect (Integer userId,Integer productId,Integer checked);
    public ServerResponse<Integer> getCartProductCount(Integer userId);

}
