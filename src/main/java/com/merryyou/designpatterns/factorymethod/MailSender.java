package com.merryyou.designpatterns.factorymethod;

/**
 * Created on 2016/5/31 0031.
 *
 * @author zlf
 * @since 1.0
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mail sender!");
    }
}
