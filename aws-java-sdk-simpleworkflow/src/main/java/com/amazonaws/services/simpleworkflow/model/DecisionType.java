/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simpleworkflow.model;

/**
 * 
 */
public enum DecisionType {

    ScheduleActivityTask("ScheduleActivityTask"),
    RequestCancelActivityTask("RequestCancelActivityTask"),
    CompleteWorkflowExecution("CompleteWorkflowExecution"),
    FailWorkflowExecution("FailWorkflowExecution"),
    CancelWorkflowExecution("CancelWorkflowExecution"),
    ContinueAsNewWorkflowExecution("ContinueAsNewWorkflowExecution"),
    RecordMarker("RecordMarker"),
    StartTimer("StartTimer"),
    CancelTimer("CancelTimer"),
    SignalExternalWorkflowExecution("SignalExternalWorkflowExecution"),
    RequestCancelExternalWorkflowExecution(
            "RequestCancelExternalWorkflowExecution"),
    StartChildWorkflowExecution("StartChildWorkflowExecution"),
    ScheduleLambdaFunction("ScheduleLambdaFunction");

    private String value;

    private DecisionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return DecisionType corresponding to the value
     */
    public static DecisionType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("ScheduleActivityTask".equals(value)) {
            return ScheduleActivityTask;
        } else if ("RequestCancelActivityTask".equals(value)) {
            return RequestCancelActivityTask;
        } else if ("CompleteWorkflowExecution".equals(value)) {
            return CompleteWorkflowExecution;
        } else if ("FailWorkflowExecution".equals(value)) {
            return FailWorkflowExecution;
        } else if ("CancelWorkflowExecution".equals(value)) {
            return CancelWorkflowExecution;
        } else if ("ContinueAsNewWorkflowExecution".equals(value)) {
            return ContinueAsNewWorkflowExecution;
        } else if ("RecordMarker".equals(value)) {
            return RecordMarker;
        } else if ("StartTimer".equals(value)) {
            return StartTimer;
        } else if ("CancelTimer".equals(value)) {
            return CancelTimer;
        } else if ("SignalExternalWorkflowExecution".equals(value)) {
            return SignalExternalWorkflowExecution;
        } else if ("RequestCancelExternalWorkflowExecution".equals(value)) {
            return RequestCancelExternalWorkflowExecution;
        } else if ("StartChildWorkflowExecution".equals(value)) {
            return StartChildWorkflowExecution;
        } else if ("ScheduleLambdaFunction".equals(value)) {
            return ScheduleLambdaFunction;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}