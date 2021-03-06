/*
 * Created on Apr 24, 2013
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
 * Copyright @2013 the original author or authors.
 */
package org.fest.assertions.internal;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * All tests for {@link BooleanArrays}.
 *
 * @author Yvonne Wang
 */
@RunWith(Suite.class)
@SuiteClasses({
  BooleanArrays_assertEmpty_Test.class,
  BooleanArrays_assertNotEmpty_Test.class,
  BooleanArrays_assertNullOrEmpty_Test.class,
  BooleanArrays_assertNotEmpty_Test.class,
  BooleanArrays_assertContains_Test.class,
  BooleanArrays_assertContains_at_Index_Test.class,
  BooleanArrays_assertContainsOnly_Test.class,
  BooleanArrays_assertContainsSequence_Test.class,
  BooleanArrays_assertDoesNotContain_at_Index_Test.class,
  BooleanArrays_assertDoesNotContain_Test.class,
  BooleanArrays_assertDoesNotHaveDuplicates_Test.class,
  BooleanArrays_assertEmpty_Test.class,
  BooleanArrays_assertHasSize_Test.class,
  BooleanArrays_assertStartsWith_Test.class
})
public class BooleanArrays_TestSuite {

}
