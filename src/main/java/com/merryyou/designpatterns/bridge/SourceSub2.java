package com.merryyou.designpatterns.bridge;

/**
 * Created on 2016/5/31 0031.
 *
 * @author zlf
 * @since 1.0
 */
public class SourceSub2 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}
