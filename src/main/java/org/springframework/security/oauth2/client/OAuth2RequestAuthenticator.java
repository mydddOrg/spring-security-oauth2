/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.springframework.security.oauth2.client;

import org.springframework.http.client.ClientHttpRequest;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

/**
 * <p>
 * @author Dave Syer
 *
 */
public interface OAuth2RequestAuthenticator {

	void authenticate(OAuth2ProtectedResourceDetails resource, OAuth2ClientContext clientContext, ClientHttpRequest request);

}
