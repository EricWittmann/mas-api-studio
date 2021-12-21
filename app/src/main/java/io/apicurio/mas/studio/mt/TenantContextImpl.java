/*
 * Copyright 2021 Red Hat
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apicurio.mas.studio.mt;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author eric.wittmann@gmail.com
 */
@ApplicationScoped
public class TenantContextImpl implements TenantContext {

    /**
     * @see io.apicurio.mas.studio.mt.TenantContext#tenantId()
     */
    @Override
    public String tenantId() {
        return TenantContext.DEFAULT_TENANT_ID;
    }

    /**
     * @see io.apicurio.mas.studio.mt.TenantContext#tenantOwner()
     */
    @Override
    public String tenantOwner() {
        return null;
    }

    /**
     * @see io.apicurio.mas.studio.mt.TenantContext#isLoaded()
     */
    @Override
    public boolean isLoaded() {
        return false;
    }
}
