package org.apache.hadoop.hive.metastore.model;

import java.util.List;

public class MSerdeParam {

  private List<String> chunks;

  public MSerdeParam() {
  }

  public MSerdeParam(List<String> chunks) {
    this.chunks = chunks;
  }

  public List<String> getChunks() {
    return chunks;
  }

  public void setChunks(List<String> chunks) {
    this.chunks = chunks;
  }
}
