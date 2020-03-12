package com.lzj.creational.builder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.LinkedList;

public class CourseTest {
    private String jsonStr3 = "[\n" +
            "    {\n" +
            "        \"fieldName\": \"age\",\n" +
            "        \"operation\": \">\",\n" +
            "        \"type\": \"INT\",\n" +
            "        \"value\": \"11\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"fieldName\": \"name\",\n" +
            "        \"operation\": \"<\",\n" +
            "        \"type\": \"VARCHAR\",\n" +
            "        \"value\": \"lzj\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"fieldName\": \"subject\",\n" +
            "        \"operation\": \"between\",\n" +
            "        \"type\": \"VARCHAR\",\n" +
            "        \"value\": \"1~2\"\n" +
            "    }\n" +
            "]";

    private String jsonStr2 = "[\n" +
            "    {\n" +
            "        \"fieldName\": \"age\",\n" +
            "        \"operation\": \">\",\n" +
            "        \"type\": \"INT\",\n" +
            "        \"value\": \"11\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"fieldName\": \"name\",\n" +
            "        \"operation\": \"<\",\n" +
            "        \"type\": \"VARCHAR\",\n" +
            "        \"value\": \"lzj\"\n" +
            "    }\n" +
            "]";

    @Test
    public void getCourse() {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Java设计模式精讲")
                .buildCourseVide("Java视频")
                .build();
        System.out.println(course);
    }

    @Test
    public void sqlBuilderTest() {
        Sql sql = new Sql.SqlBuilder()
                .select()
                .buildColums(new String[]{"aa", "bb"})
                .buildFrom("table")
                .build();
        System.out.println(sql.toString());
    }

    @Test
    public void fastJsonTest() {
        // 拼sql是有用
        LinkedList<String> columns = new LinkedList<>();
        LinkedList<String> operations = new LinkedList<>();
        // 占位符实际值类型转化是有用。
        LinkedList<String> types = new LinkedList<>();
        LinkedList<String> values = new LinkedList<>();

        JSONArray jsonArray = JSON.parseArray(jsonStr3);
        int size = jsonArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            if (jsonObject.containsKey("fieldName")) {
                columns.add(jsonObject.getString("fieldName"));
            }
            if (jsonObject.containsKey("operation")) {
                String op = jsonObject.getString("operation");
                if ("between".equals(op)) {
                    String bnVal = jsonObject.getString("value");
                    String[] splits = bnVal.split("~");
                    values.add(splits[0]);
                    values.add(splits[1]);
                    types.add(jsonObject.getString("type"));
                    types.add(jsonObject.getString("type"));
                } else {
                    values.add(jsonObject.getString("value"));
                    types.add(jsonObject.getString("type"));
                }
                operations.add(op);
            }
        }

        Sql sql = new Sql.SqlBuilder()
                .select()
                .buildColums(new String[]{"aa", "bb"})
                .buildFrom("table")
                .buildWhere(columns, operations)
                .build();
        System.out.println(sql.toString());
    }
}