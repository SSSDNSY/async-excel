package com.asyncexcel.core;

/**
 * @Description TODO
 * @Author 姚仲杰#80998699
 * @Date 2022/8/25 14:40
 */
public interface Handler {
    /**整个生命周期中只会执行一次该方法，可以用于初始化处理类的一些全局属性
     * @param ctx
     */
    default void init(ExcelContext ctx){
        //do some init operation
    }
}
