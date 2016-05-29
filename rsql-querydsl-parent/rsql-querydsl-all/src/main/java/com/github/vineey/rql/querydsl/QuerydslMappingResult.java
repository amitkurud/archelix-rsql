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

import com.github.vineey.rql.querydsl.join.JoinEntrySet;
import com.querydsl.core.QueryModifiers;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.Predicate;

import java.util.List;
import java.util.Set;

/**
 * @author vrustia - 4/24/16.
 */
public class QuerydslMappingResult {
    private Expression projection;
    private Predicate predicate;
    private List<OrderSpecifier> orderSpecifiers;
    private QueryModifiers page;
    private JoinEntrySet joinListNode;
    private Set<Path> selectPaths;
    private Set<Path> filterPaths;
    private Set<Path> sortPaths;

    public Expression getProjection() {
        return projection;
    }

    public QuerydslMappingResult setProjection(Expression projection) {
        this.projection = projection;
        return this;
    }

    public List<OrderSpecifier> getOrderSpecifiers() {
        return orderSpecifiers;
    }

    public QuerydslMappingResult setOrderSpecifiers(List<OrderSpecifier> orderSpecifiers) {
        this.orderSpecifiers = orderSpecifiers;
        return this;
    }

    public Set<Path> getFilterPaths() {
        return filterPaths;
    }

    public QuerydslMappingResult setFilterPaths(Set<Path> filterPaths) {
        this.filterPaths = filterPaths;
        return this;
    }

    public Set<Path> getSelectPaths() {
        return selectPaths;
    }

    public QuerydslMappingResult setSelectPaths(Set<Path> selectPaths) {
        this.selectPaths = selectPaths;
        return this;
    }

    public Set<Path> getSortPaths() {
        return sortPaths;
    }

    public QuerydslMappingResult setSortPaths(Set<Path> sortPaths) {
        this.sortPaths = sortPaths;
        return this;
    }

    public QueryModifiers getPage() {
        return page;
    }

    public QuerydslMappingResult setPage(QueryModifiers page) {
        this.page = page;
        return this;
    }

    public Predicate getPredicate() {
        return predicate;
    }

    public QuerydslMappingResult setPredicate(Predicate predicate) {
        this.predicate = predicate;
        return this;
    }


    public JoinEntrySet getJoinListNode() {
        return joinListNode;
    }

    public QuerydslMappingResult setJoinListNode(JoinEntrySet joinListNode) {
        this.joinListNode = joinListNode;
        return this;
    }
}
