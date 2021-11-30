package com.biykcode.demo4.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("source=" + demoEvent.getSource() + ", timestamp=" + demoEvent.getTimestamp());
        String msg = demoEvent.getMsg();
        System.out.println("listener 接收到了 publisher 的消息：" + msg);
    }
}
