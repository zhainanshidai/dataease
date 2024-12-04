package io.dataease.extensions.datasource.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@Data
public class DatasourceRequest implements Serializable {
    private final String REG_WITH_SQL_FRAGMENT = "((?i)WITH[\\s\\S]+(?i)AS?\\s*\\([\\s\\S]+\\))\\s*(?i)SELECT";
    private Pattern WITH_SQL_FRAGMENT = Pattern.compile("((?i)WITH[\\s\\S]+(?i)AS?\\s*\\([\\s\\S]+\\))\\s*(?i)SELECT");
    protected String query;
    protected String table;
    protected DatasourceDTO datasource;
    private Integer dsVersion;
    private Integer pageSize;
    private Integer page;
    private Integer realSize;
    private Integer fetchSize = 10000;
    private boolean pageable = false;
    private boolean previewData = false;
    private boolean totalPageFlag;
    private Map<Long, DatasourceSchemaDTO> dsList;
    private List<TableFieldWithValue> tableFieldWithValues;

    public DatasourceRequest() {
    }

    public String getQuery() {
        return this.query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
