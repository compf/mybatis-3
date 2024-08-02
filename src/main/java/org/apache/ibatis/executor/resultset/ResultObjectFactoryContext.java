/*
 *    Copyright 2009-2024 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.executor.resultset;

public class ResultObjectFactoryContext {

  private org.apache.ibatis.executor.resultset.ResultSetWrapper rsw;

  private org.apache.ibatis.mapping.ResultMap resultMap;

  private java.lang.String columnPrefix;

  private java.util.List<java.lang.Class<?>> constructorArgTypes;

  private java.util.List<java.lang.Object> constructorArgs;

  private java.lang.reflect.Constructor<?> constructor;

  public org.apache.ibatis.executor.resultset.ResultSetWrapper getRsw() {
    return rsw;
  }

  public org.apache.ibatis.mapping.ResultMap getResultMap() {
    return resultMap;
  }

  public java.lang.String getColumnPrefix() {
    return columnPrefix;
  }

  public java.util.List getConstructorArgTypes() {
    return constructorArgTypes;
  }

  public java.util.List getConstructorArgs() {
    return constructorArgs;
  }

  public java.lang.reflect.Constructor getConstructor() {
    return constructor;
  }

  public void setRsw(org.apache.ibatis.executor.resultset.ResultSetWrapper rsw) {
    this.rsw = rsw;
  }

  public void setResultMap(org.apache.ibatis.mapping.ResultMap resultMap) {
    this.resultMap = resultMap;
  }

  public void setColumnPrefix(java.lang.String columnPrefix) {
    this.columnPrefix = columnPrefix;
  }

  public void setConstructorArgTypes(java.util.List constructorArgTypes) {
    this.constructorArgTypes = constructorArgTypes;
  }

  public void setConstructorArgs(java.util.List constructorArgs) {
    this.constructorArgs = constructorArgs;
  }

  public void setConstructor(java.lang.reflect.Constructor constructor) {
    this.constructor = constructor;
  }

  public ResultObjectFactoryContext(org.apache.ibatis.executor.resultset.ResultSetWrapper rsw,
      org.apache.ibatis.mapping.ResultMap resultMap, java.lang.String columnPrefix, java.util.List constructorArgTypes,
      java.util.List constructorArgs, java.lang.reflect.Constructor constructor) {
    this.rsw = rsw;
    this.resultMap = resultMap;
    this.columnPrefix = columnPrefix;
    this.constructorArgTypes = constructorArgTypes;
    this.constructorArgs = constructorArgs;
    this.constructor = constructor;
  }
}
