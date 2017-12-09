/*
 * Copyright (c) 2017 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.saliman.spring.request.correlation.support;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
/**
 * The request correlation properties.
 *
 * @author Jakub Narloch
 */
@ConfigurationProperties(prefix = "request.correlation")
public class RequestCorrelationProperties {

    /**
     * Header name.
     */
    private String sessionHeaderName = RequestCorrelationConsts.SESSION_HEADER_NAME;
    /**
     * Header name.
     */
    private String requestHeaderName = RequestCorrelationConsts.REQUEST_HEADER_NAME;

    /**
     * Creates new instance of {@link RequestCorrelationProperties} class.
     */
    public RequestCorrelationProperties() {
    }

    /**
     * Retrieves the header names.
     *
     * @return the header names
     */
    public String getSessionHeaderName() {
        return sessionHeaderName;
    }

    /**
     * Sets the header names.
     *
     * @param headerName the header names
     */
    public void setSessionHeaderName(String headerName) {
        this.sessionHeaderName = headerName;
    }

    /**
     * Retrieves the header names.
     *
     * @return the header names
     */
    public String getRequestHeaderName() {
        return requestHeaderName;
    }

    /**
     * Sets the header names.
     *
     * @param headerName the header names
     */
    public void setRequestHeaderName(String headerName) {
        this.requestHeaderName = headerName;
    }
}
