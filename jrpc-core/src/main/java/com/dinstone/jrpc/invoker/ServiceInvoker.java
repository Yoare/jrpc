
package com.dinstone.jrpc.invoker;

import java.lang.reflect.Method;

public interface ServiceInvoker {

    <T> Object invoke(ReferenceBinding referenceBinding, Class<T> serviceInterface,
            String group, int timeout, Method method, Object[] args) throws Exception;

    void destroy();
}