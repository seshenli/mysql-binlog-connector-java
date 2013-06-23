/*
 * Copyright 2013 Stanley Shyiko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.shyiko.mysql.binlog.network.protocol.command;

/**
 * @author <a href="mailto:stanley.shyiko@gmail.com">Stanley Shyiko</a>
 */
public enum CommandType {

    SLEEP,
    QUIT,
    INIT_DB,
    QUERY,
    FIELD_LIST,
    CREATE_DB,
    DROP_DB,
    REFRESH,
    SHUTDOWN,
    STATISTICS,
    PROCESS_INFO,
    CONNECT,
    PROCESS_KILL,
    DEBUG,
    PING,
    TIME,
    DELAYED_INSERT,
    CHANGE_USER,
    BINLOG_DUMP,
    TABLE_DUMP,
    CONNECT_OUT,
    REGISTER_SLAVE,
    STMT_PREPARE,
    STMT_EXECUTE,
    STMT_SEND_LONG_DATA,
    STMT_CLOSE,
    STMT_RESET,
    SET_OPTION,
    STMT_FETCH,
    DAEMON

}
