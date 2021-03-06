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
package com.github.vineey.rql;

/**
 * @author vrustia - 4/24/16.
 */
public class RqlInput {
    private String select;
    private String sort;
    private String limit;
    private String filter;

    public String getSelect() {
        return select;
    }

    public RqlInput setSelect(String select) {
        this.select = select;
        return this;
    }

    public String getFilter() {
        return filter;
    }

    public RqlInput setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    public String getLimit() {
        return limit;
    }

    public RqlInput setLimit(String limit) {
        this.limit = limit;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public RqlInput setSort(String sort) {
        this.sort = sort;
        return this;
    }
}
