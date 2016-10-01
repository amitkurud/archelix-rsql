/*
* MIT License
* 
* Copyright (c) 2016 John Michael Vincent S. Rustia
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
* 
*/
package com.github.vineey.rql.querydsl;

import com.github.vineey.rql.querydsl.jpa.select.JpaQuerydslSelectContext;
import com.github.vineey.rql.querydsl.test.jpa.QEmployee;
import com.github.vineey.rql.select.parser.DefaultSelectParser;
import com.google.common.collect.ImmutableMap;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.Projections;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by vine on 9/18/16.
 */
@RunWith(JUnit4.class)
public class JpaQuerydslSelectContextTest {

    @Test
    public void singleSelect() {
        String rqlSelectExpression = "select(employee.number)";
        DefaultSelectParser selectParser = new DefaultSelectParser();
        Map<String, Path> mappings = ImmutableMap.<String, Path>builder()
                .put("employee.number", QEmployee.employee.employeeNumber)
                .build();

        Expression selectExpression = selectParser.parse(rqlSelectExpression, JpaQuerydslSelectContext.withMappingAndJoinAndBuilder(QEmployee.employee, mappings, null));
        assertNotNull(selectExpression);
        assertEquals(Projections.bean(QEmployee.employee, QEmployee.employee.employeeNumber), selectExpression);
    }
}