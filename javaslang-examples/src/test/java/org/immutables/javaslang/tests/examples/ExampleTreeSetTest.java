/*
 * Copyright 2013-2016 Immutables Authors and Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.immutables.javaslang.tests.examples;

import javaslang.collection.TreeSet;
import org.immutables.javaslang.examples.ImmutableExampleTreeSetType;
import org.junit.Assert;
import org.junit.Test;

public final class ExampleTreeSetTest
{
  @Test
  public void testAdd()
  {
    final ImmutableExampleTreeSetType.Builder b =
      ImmutableExampleTreeSetType.builder();

    b.addIntegers(Integer.valueOf(0));
    b.addIntegers(Integer.valueOf(1));
    b.addIntegers(Integer.valueOf(2));

    final ImmutableExampleTreeSetType a0 = b.build();
    Assert.assertEquals(3L, (long) a0.integers().size());
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(0)));
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(1)));
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(2)));
  }

  @Test
  public void testSet()
  {
    final ImmutableExampleTreeSetType.Builder b =
      ImmutableExampleTreeSetType.builder();

    b.integers(TreeSet.of(
      Integer.valueOf(0),
      Integer.valueOf(1),
      Integer.valueOf(2)));

    final ImmutableExampleTreeSetType a0 = b.build();
    Assert.assertEquals(3L, (long) a0.integers().size());
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(0)));
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(1)));
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(2)));
  }

  @Test
  public void testSetIterable()
  {
    final ImmutableExampleTreeSetType.Builder b =
      ImmutableExampleTreeSetType.builder();

    b.setIterableIntegers(TreeSet.of(
      Integer.valueOf(0),
      Integer.valueOf(1),
      Integer.valueOf(2)));

    final ImmutableExampleTreeSetType a0 = b.build();
    Assert.assertEquals(3L, (long) a0.integers().size());
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(0)));
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(1)));
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(2)));
  }

  @Test
  public void testAddAll()
  {
    final ImmutableExampleTreeSetType.Builder b =
      ImmutableExampleTreeSetType.builder();

    final TreeSet<Integer> s0 = TreeSet.of(
      Integer.valueOf(0),
      Integer.valueOf(1),
      Integer.valueOf(2));

    final TreeSet<Integer> s1 = TreeSet.of(
      Integer.valueOf(10),
      Integer.valueOf(11),
      Integer.valueOf(12));

    b.addAllIntegers(s0);
    b.addAllIntegers(s1);

    final ImmutableExampleTreeSetType a0 = b.build();
    Assert.assertEquals(6L, (long) a0.integers().size());
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(0)));
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(1)));
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(2)));
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(10)));
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(11)));
    Assert.assertTrue(a0.integers().contains(Integer.valueOf(12)));
  }
}
