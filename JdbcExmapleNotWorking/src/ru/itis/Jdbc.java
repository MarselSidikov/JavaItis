package ru.itis;

public class Jdbc {
    private static final String SQL_GET_POSTPONED_DOCUMENTS_BY_IDS =
            "SELECT * FROM documents d, tasks t, postponed_documents pd WHERE (pd.worker_id = :workerId AND d.id = "
            + "pd.document_id AND t.id = :taskId)";

    private final RowMapper<Document> DOCUMENT_ROW_MAPPER =
            new RowMapper<Document>() {
        @Override
        public Document mapRow(ResultSet resultSet, int i)throws SQLException {
            try {
                return new Document(resultSet.getInt("id"),resultSet.getInt("task_id"),resultSet.getString("file_name"),
                        resultSet.getString("type"), resultSet.getString("folder_name"),
                        resultSet.getInt("size"),
                        new URL(resultSet.getString("url")));
            } catch (MalformedURLException e) {
                throw new IllegalArgumentException(e);
            }
        }
    };

    @Override
    public List<Document> getDocuments(int taskId) {
        verifier.verifyTask(taskId);
        Map<String, Object> paramMap = paramsMapper.asMap(asList("taskId"),
                asList(taskId));
        return sqlQueryExecutor.queryForObjects(SQL_GET_DOCUMENTS_OF_TASK,
                paramMap, DOCUMENT_ROW_MAPPER);
    }

}
