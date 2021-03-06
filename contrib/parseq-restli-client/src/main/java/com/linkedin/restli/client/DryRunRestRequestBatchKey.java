/*
 * Copyright 2016 LinkedIn, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.linkedin.restli.client;

import com.linkedin.parseq.promise.Promise;
import com.linkedin.r2.message.RequestContext;
import com.linkedin.restli.client.config.BatchingConfig;


class DryRunRestRequestBatchKey<T> extends RestRequestBatchKey {

  private final Promise<Response<T>> _promise;

  public DryRunRestRequestBatchKey(Request<Object> request, RequestContext requestContext,
      BatchingConfig bathcingConfig, Promise<Response<T>> promise) {
    super(request, requestContext, bathcingConfig);
    _promise = promise;
  }

  public Promise<Response<T>> getPromise() {
    return _promise;
  }

}
