package com.archelix.rql.querydsl;

import com.archelix.rql.filter.FilterBuilder;
import com.mysema.query.types.Predicate;
import cz.jirutka.rsql.parser.ast.Node;

/**
 * @author vrustia on 9/26/2015.
 */
public class QuerydslFilterBuilder implements FilterBuilder<Predicate, QuerydslFilterParam> {
    @Override
    public Predicate visit(Node node, QuerydslFilterParam querydslFilterParam) {
        return node.accept(QuerydslRsqlVisitor.getInstance(), querydslFilterParam);
    }
}
