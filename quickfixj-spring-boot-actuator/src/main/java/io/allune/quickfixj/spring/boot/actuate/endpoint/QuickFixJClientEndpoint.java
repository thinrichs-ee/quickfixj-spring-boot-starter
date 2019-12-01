/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.allune.quickfixj.spring.boot.actuate.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;

import quickfix.Initiator;
import quickfix.SessionSettings;

/**
 * {@link Endpoint} to expose QuickFixJ client info.
 *
 * @author Eduardo Sanchez-Ros
 */
@Endpoint(id = "quickfixjclient")
public class QuickFixJClientEndpoint extends AbstractQuickFixJEndpoint {

	public QuickFixJClientEndpoint(Initiator clientInitiator, SessionSettings clientSessionSettings) {
		super(clientInitiator, clientSessionSettings);
	}
}
