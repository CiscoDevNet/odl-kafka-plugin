/************************************************************************************************************
* Copyright (c) 2016 Cisco and/or its affiliates.
* This software is licensed to you under the terms of the Apache License, Version 2.0 (the "License").
* You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
* The code, technical concepts, and all information contained herein, are the property of Cisco Technology, Inc.
* and/or its affiliated entities, under various laws including copyright, international treaties, patent,
* and/or contract. Any use of the material herein must be in accordance with the terms of the License.
* All rights not expressly granted by the License are reserved.
* Unless required by applicable law or agreed to separately in writing, software distributed under the
* License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
* either express or implied.
* 

* Name:       NoopBindingConsumer.java
* Purpose:    Binding-aware consumer class
*************************************************************************************************************/

package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.kafka.agent.impl.rev150922;

import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ConsumerContext;
import org.opendaylight.controller.sal.binding.api.BindingAwareConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoopBindingConsumer implements BindingAwareConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(NoopBindingConsumer.class);

    @Override
    public void onSessionInitialized(ConsumerContext session) {
        LOG.info("NoopBindingConsumer initialized");
    }

}
