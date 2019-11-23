package org.apache.hadoop.hive.metastore.model;

import java.util.List;

public class MColumnTypes {
  private List<String> chunks;

  public MColumnTypes() {}

  public MColumnTypes(List<String> chunks) {
    this.chunks = chunks;
  }

  public List<String> getChunks() {
    return chunks;
  }

  public void setChunks(List<String> chunks) {
    this.chunks = chunks;
  }
}
