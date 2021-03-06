/*
 * Copyright 2017 The Mifos Initiative.
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
package io.mifos.portfolio.service.internal.command;

import io.mifos.portfolio.api.v1.domain.ChargeDefinition;

/**
 * @author Myrle Krantz
 */
public class ChangeChargeDefinitionCommand {
  private final String productIdentifier;
  private final ChargeDefinition instance;

  public ChangeChargeDefinitionCommand(final String productIdentifier, final ChargeDefinition instance) {
    this.productIdentifier = productIdentifier;
    this.instance = instance;
  }

  public String getProductIdentifier() {
    return productIdentifier;
  }

  public ChargeDefinition getInstance() {
    return instance;
  }
}
