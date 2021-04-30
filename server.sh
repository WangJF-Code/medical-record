#!/bin/bash

ARG0=$0
DIRNAME="`dirname $ARG0`"
export APP_HOME=${DIRNAME}

#这里可替换为你自己的执行程序，其他代码无需更改
APP_NAME=com.nickel.medicalrecord.MedicalRecordApplication

#使用说明，用来提示输入参数
usage() {
    echo "Usage: imp.sh [start|stop|restart|status]"
    exit 1
}

#检查程序是否在运行
is_exist(){
  pid=`ps -ef|grep $APP_NAME|grep -v grep|awk '{print $2}' `
  #如果不存在返回1，存在返回0
  if [ -z "${pid}" ]; then
   return 1
  else
    return 0
  fi
}

#启动方法
start(){
  is_exist
  if [ $? -eq "0" ]; then
    echo "${APP_NAME} is already running. pid=${pid} ."
  else
    JAVA_OPTS="-Xmx1024m -Duser.timezone=Asia/Shanghai -XX:+HeapDumpOnOutOfMemoryError"

    for i in $APP_HOME/lib/*.jar; do
            CLASSPATH="${CLASSPATH}:${i}"
    done

    "${JAVA_HOME:-/usr}/bin/java" -cp ${CLASSPATH} -server -Dname=${APP_NAME} ${JAVA_OPTS} -DAPP_HOME=${APP_HOME} ${APP_NAME} $1 2>&1 &
  fi
}

#停止方法
stop(){
  is_exist
  if [ $? -eq "0" ]; then
    kill -9 $pid
  else
    echo "${APP_NAME} is not running"
  fi
}

#输出运行状态
status(){
  is_exist
  if [ $? -eq "0" ]; then
    echo "${APP_NAME} is running. Pid is ${pid}"
  else
    echo "${APP_NAME} is NOT running."
  fi
}

#重启
restart(){
  stop
  start
}

#根据输入参数，选择执行对应方法，不输入则执行使用说明
case "$1" in
  "start")
    start
    ;;
  "stop")
    stop
    ;;
  "status")
    status
    ;;
  "restart")
    restart
    ;;
  *)
    usage
    ;;
esac
