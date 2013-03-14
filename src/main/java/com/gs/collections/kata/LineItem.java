/*
 * Copyright 2011 Goldman Sachs.
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

package com.gs.collections.kata;

import com.gs.collections.api.block.function.Function;
import com.gs.collections.api.block.function.primitive.DoubleFunction;

/**
 * An Item has a name and a value.
 */
public class LineItem
{
    public static final Function<LineItem, String> TO_NAME = new Function<LineItem, String>()
    {
        @Override
        public String valueOf(LineItem lineItem)
        {
            return lineItem.name;
        }
    };
    public static final DoubleFunction<LineItem> TO_VALUE = new DoubleFunction<LineItem>()
    {
        public double doubleValueOf(LineItem lineItem)
        {
            return lineItem.value;
        }
    };

    private String name;
    private final double value;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getValue()
    {
        return this.value;
    }

    public LineItem(String name, double value)
    {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return this.name + " $ " + this.value;
    }
}
