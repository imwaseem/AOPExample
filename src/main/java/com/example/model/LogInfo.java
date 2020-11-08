/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import org.springframework.stereotype.Component;

/**
 * @author waseem.nasir
 */
@Component
public class LogInfo {

    private String buName;
    private String integrationName;
    private String serviceName;
    private String source;
    private String sourceInterface;
    private String target;
    private String targetInterface;
    private String logTime;
    private String request;
    private String response;
    private String internalMessage;
    private String message;
    private String uId;
    private String contentId;
    private String contentName;

    public String getBuName() {
        return buName;
    }

    public void setBuName(String buName) {
        this.buName = buName;
    }

    public String getInternalMessage() {
        return internalMessage;
    }

    public void setInternalMessage(String internalMessage) {
        this.internalMessage = internalMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public void setIntegrationName(String integrationName) {
        this.integrationName = integrationName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setSourceInterface(String sourceInterface) {
        this.sourceInterface = sourceInterface;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setTargetInterface(String targetInterface) {
        this.targetInterface = targetInterface;
    }

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getIntegrationName() {
        return integrationName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getSource() {
        return source;
    }

    public String getSourceInterface() {
        return sourceInterface;
    }

    public String getTarget() {
        return target;
    }

    public String getTargetInterface() {
        return targetInterface;
    }

}
