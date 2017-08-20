package org.home.chapter06.annotations;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityFactory {
    
    public static AccountOperationManager createSecurityObject(AccountOperationManager targetObject) {
        return (AccountOperationManager) Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                new SecurityInvokationHandler(targetObject));
    }
    private static class SecurityInvokationHandler implements InvocationHandler {
        
        private Object targetObject = null;
        
        public SecurityInvokationHandler(Object targetObject) {
            this.targetObject = targetObject;
        }
        
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
            SecurityLogic logic = new SecurityLogic();
            Method realMethod = targetObject.getClass().getMethod(
                    method.getName(),
                    (Class[]) method.getGenericParameterTypes());
            BankingAnnotation annotation = realMethod.getAnnotation(BankingAnnotation.class);
            if (annotation != null) {
                logic.onInvoke(annotation.securityLevel(), realMethod, args);
                try {
                    return method.invoke(targetObject, args);
                } catch (InvocationTargetException e) {
                    System.out.println(annotation.securityLevel());
                    throw e.getCause();
                }
            } else {
                //throw new InvocationTargetException(null, "method " + realMethod + " should be annotated ");
                return null;
            }
        }
    }
}
