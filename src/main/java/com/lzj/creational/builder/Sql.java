package com.lzj.creational.builder;

import java.util.List;

/**
 * @Author Sakura
 * @Date 2020/3/11 18:00
 */
public class Sql {
    private String select;
    private String colums;
    private String from;
    private String where;

    public Sql(SqlBuilder sqlBuilder) {
        this.select = sqlBuilder.select;
        this.colums = sqlBuilder.colums;
        this.from = sqlBuilder.from;
        this.where = sqlBuilder.where;
    }

    public static class SqlBuilder {
        private String select;
        private String colums;
        private String from;
        private String where;

        public SqlBuilder select() {
            this.select = "select ";
            return this;
        }

        public SqlBuilder buildColums(String[] columns) {
            StringBuilder selectBuilder = new StringBuilder();
            for (int i = 0; i < columns.length; i++) {
                if (columns.length == (i + 1)) {
                    selectBuilder.append(columns[i]).append(" ");
                } else {
                    selectBuilder.append(columns[i]).append(", ");
                }
            }
            colums = selectBuilder.toString();
            return this;
        }

        public SqlBuilder buildFrom(String table) {
            this.from = "from " + table;
            return this;
        }

        public SqlBuilder buildWhere(List<String> colums, List<String> operations) {
            StringBuilder whereBuilder = new StringBuilder(" where 1=1 ");
            for (int i = 0; i < colums.size(); i++) {
                String operation = operations.get(i);
                String colum = colums.get(i);
                if ("between".equals(operation)) {
                    whereBuilder.append("and ").append(colum).append(" ").append(operation)
                            .append(" ? and ").append("? ");
                } else {
                    whereBuilder.append("and ").append(colum).append(" ").append(operation)
                            .append(" ? ");
                }
            }

            this.where = whereBuilder.toString();
            return this;
        }

        public Sql build() {
            return new Sql(this);
        }
    }

    @Override
    public String toString() {
        return
                select + colums +
                        from + where;
    }
}
