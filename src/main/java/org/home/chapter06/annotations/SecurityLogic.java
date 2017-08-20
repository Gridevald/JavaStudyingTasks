package org.home.chapter06.annotations;

import java.lang.reflect.Method;

public class SecurityLogic {
    
    public void onInvoke(SecurityLevelEnum level, Method method, Object[] args) {
        StringBuilder argsString = new StringBuilder();
        for (Object arg : args) {
            argsString.append(arg.toString() + " :");
        }
        argsString.setLength(argsString.length() - 1);
        System.out.println(String.format("Methods %S was invoked with parameters :%s",
                method.getName(), argsString.toString()));
        switch (level) {
            case LOW:
                System.out.println("Low security level: " + level);
                break;
            case NORMAL:
                System.out.println("Normal security level: " + level);
                break;
            case HIGH:
                System.out.println("High security level: " + level);
                break;
        }
    }
}
