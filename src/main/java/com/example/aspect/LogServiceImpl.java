package com.example.aspect;

import com.example.model.LogInfo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.sql.SQLOutput;

@Aspect
public class LogServiceImpl {

    @AfterReturning(pointcut = "@annotation(com.example.aspect.LogService) && execution(* *(..))", returning = "logInfo")
    public void logWSCallSent(JoinPoint joinPoint, LogInfo logInfo) {
        System.out.println("execution of logWSCallSent() started");
        System.out.println(" joinPoint.getSignature().getDeclaringTypeName(): " +  joinPoint.getSignature().getDeclaringTypeName());
        System.out.println(" joinPoint.getSignature().getName(): " +  joinPoint.getSignature().getName());
        if (logInfo == null) {
            return;
        }
        System.out.println("Bu Name" + logInfo.getBuName());
        System.out.println("contentName" + logInfo.getContentName());
        System.out.println("execution of logWSCallSent() ending");

    }
}
