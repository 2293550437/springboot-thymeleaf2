package com.cheng.pay;

public class PayServiceImpl implements PayService {
    @Override
    public void add(double money) {
        System.out.println("支付更新功能");
    }

    @Override
    public void update(double money) {
        System.out.println("支付删除功能");
    }
}
