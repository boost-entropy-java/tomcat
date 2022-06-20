/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$0 {

    static final FunctionDescriptor OPENSSL_sk_num$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle OPENSSL_sk_num$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OPENSSL_sk_num",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$0.OPENSSL_sk_num$FUNC, false
    );
    static final FunctionDescriptor OPENSSL_sk_value$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle OPENSSL_sk_value$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OPENSSL_sk_value",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$0.OPENSSL_sk_value$FUNC, false
    );
    static final FunctionDescriptor OpenSSL_version_num$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle OpenSSL_version_num$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OpenSSL_version_num",
        "()J",
        constants$0.OpenSSL_version_num$FUNC, false
    );
    static final FunctionDescriptor OpenSSL_version$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle OpenSSL_version$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OpenSSL_version",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$0.OpenSSL_version$FUNC, false
    );
    static final FunctionDescriptor CRYPTO_free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle CRYPTO_free$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "CRYPTO_free",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$0.CRYPTO_free$FUNC, false
    );
    static final FunctionDescriptor BIO_ctrl_pending$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle BIO_ctrl_pending$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "BIO_ctrl_pending",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$0.BIO_ctrl_pending$FUNC, false
    );
}


