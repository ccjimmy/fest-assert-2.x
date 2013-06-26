/*
 * Created on Oct 22, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010-2013 the original author or authors.
 */
package org.fest.assertions.api;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Tests for {@link BooleanAssert#isFalse()}.
 *
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class BooleanAssert_isFalse_Test {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  private Boolean actual = new Boolean(false);
  private BooleanAssert assertions;

  @Before
  public void setUp() {
    assertions = new BooleanAssert(actual);
  }

  @Test
  public void should_pass_that_actual_is_false() {
    assertions.isFalse();
  }

  @Test
  public void should_return_this() {
    BooleanAssert returned = assertions.isFalse();
    assertSame(assertions, returned);
  }

  @Test
  public void should_fail_if_actual_is_not_false() {
    thrown.expect(AssertionError.class);
    actual = new Boolean(true);
    assertions = new BooleanAssert(actual);
    assertions.isFalse();
  }
}