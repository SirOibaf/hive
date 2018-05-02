/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class TableValidWriteIds implements org.apache.thrift.TBase<TableValidWriteIds, TableValidWriteIds._Fields>, java.io.Serializable, Cloneable, Comparable<TableValidWriteIds> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TableValidWriteIds");

  private static final org.apache.thrift.protocol.TField FULL_TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("fullTableName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField WRITE_ID_HIGH_WATER_MARK_FIELD_DESC = new org.apache.thrift.protocol.TField("writeIdHighWaterMark", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField INVALID_WRITE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("invalidWriteIds", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField MIN_OPEN_WRITE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("minOpenWriteId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField ABORTED_BITS_FIELD_DESC = new org.apache.thrift.protocol.TField("abortedBits", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableValidWriteIdsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableValidWriteIdsTupleSchemeFactory());
  }

  private String fullTableName; // required
  private long writeIdHighWaterMark; // required
  private List<Long> invalidWriteIds; // required
  private long minOpenWriteId; // optional
  private ByteBuffer abortedBits; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FULL_TABLE_NAME((short)1, "fullTableName"),
    WRITE_ID_HIGH_WATER_MARK((short)2, "writeIdHighWaterMark"),
    INVALID_WRITE_IDS((short)3, "invalidWriteIds"),
    MIN_OPEN_WRITE_ID((short)4, "minOpenWriteId"),
    ABORTED_BITS((short)5, "abortedBits");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FULL_TABLE_NAME
          return FULL_TABLE_NAME;
        case 2: // WRITE_ID_HIGH_WATER_MARK
          return WRITE_ID_HIGH_WATER_MARK;
        case 3: // INVALID_WRITE_IDS
          return INVALID_WRITE_IDS;
        case 4: // MIN_OPEN_WRITE_ID
          return MIN_OPEN_WRITE_ID;
        case 5: // ABORTED_BITS
          return ABORTED_BITS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __WRITEIDHIGHWATERMARK_ISSET_ID = 0;
  private static final int __MINOPENWRITEID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MIN_OPEN_WRITE_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FULL_TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("fullTableName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WRITE_ID_HIGH_WATER_MARK, new org.apache.thrift.meta_data.FieldMetaData("writeIdHighWaterMark", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.INVALID_WRITE_IDS, new org.apache.thrift.meta_data.FieldMetaData("invalidWriteIds", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.MIN_OPEN_WRITE_ID, new org.apache.thrift.meta_data.FieldMetaData("minOpenWriteId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ABORTED_BITS, new org.apache.thrift.meta_data.FieldMetaData("abortedBits", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TableValidWriteIds.class, metaDataMap);
  }

  public TableValidWriteIds() {
  }

  public TableValidWriteIds(
    String fullTableName,
    long writeIdHighWaterMark,
    List<Long> invalidWriteIds,
    ByteBuffer abortedBits)
  {
    this();
    this.fullTableName = fullTableName;
    this.writeIdHighWaterMark = writeIdHighWaterMark;
    setWriteIdHighWaterMarkIsSet(true);
    this.invalidWriteIds = invalidWriteIds;
    this.abortedBits = org.apache.thrift.TBaseHelper.copyBinary(abortedBits);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableValidWriteIds(TableValidWriteIds other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFullTableName()) {
      this.fullTableName = other.fullTableName;
    }
    this.writeIdHighWaterMark = other.writeIdHighWaterMark;
    if (other.isSetInvalidWriteIds()) {
      List<Long> __this__invalidWriteIds = new ArrayList<Long>(other.invalidWriteIds);
      this.invalidWriteIds = __this__invalidWriteIds;
    }
    this.minOpenWriteId = other.minOpenWriteId;
    if (other.isSetAbortedBits()) {
      this.abortedBits = org.apache.thrift.TBaseHelper.copyBinary(other.abortedBits);
    }
  }

  public TableValidWriteIds deepCopy() {
    return new TableValidWriteIds(this);
  }

  @Override
  public void clear() {
    this.fullTableName = null;
    setWriteIdHighWaterMarkIsSet(false);
    this.writeIdHighWaterMark = 0;
    this.invalidWriteIds = null;
    setMinOpenWriteIdIsSet(false);
    this.minOpenWriteId = 0;
    this.abortedBits = null;
  }

  public String getFullTableName() {
    return this.fullTableName;
  }

  public void setFullTableName(String fullTableName) {
    this.fullTableName = fullTableName;
  }

  public void unsetFullTableName() {
    this.fullTableName = null;
  }

  /** Returns true if field fullTableName is set (has been assigned a value) and false otherwise */
  public boolean isSetFullTableName() {
    return this.fullTableName != null;
  }

  public void setFullTableNameIsSet(boolean value) {
    if (!value) {
      this.fullTableName = null;
    }
  }

  public long getWriteIdHighWaterMark() {
    return this.writeIdHighWaterMark;
  }

  public void setWriteIdHighWaterMark(long writeIdHighWaterMark) {
    this.writeIdHighWaterMark = writeIdHighWaterMark;
    setWriteIdHighWaterMarkIsSet(true);
  }

  public void unsetWriteIdHighWaterMark() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WRITEIDHIGHWATERMARK_ISSET_ID);
  }

  /** Returns true if field writeIdHighWaterMark is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteIdHighWaterMark() {
    return EncodingUtils.testBit(__isset_bitfield, __WRITEIDHIGHWATERMARK_ISSET_ID);
  }

  public void setWriteIdHighWaterMarkIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WRITEIDHIGHWATERMARK_ISSET_ID, value);
  }

  public int getInvalidWriteIdsSize() {
    return (this.invalidWriteIds == null) ? 0 : this.invalidWriteIds.size();
  }

  public java.util.Iterator<Long> getInvalidWriteIdsIterator() {
    return (this.invalidWriteIds == null) ? null : this.invalidWriteIds.iterator();
  }

  public void addToInvalidWriteIds(long elem) {
    if (this.invalidWriteIds == null) {
      this.invalidWriteIds = new ArrayList<Long>();
    }
    this.invalidWriteIds.add(elem);
  }

  public List<Long> getInvalidWriteIds() {
    return this.invalidWriteIds;
  }

  public void setInvalidWriteIds(List<Long> invalidWriteIds) {
    this.invalidWriteIds = invalidWriteIds;
  }

  public void unsetInvalidWriteIds() {
    this.invalidWriteIds = null;
  }

  /** Returns true if field invalidWriteIds is set (has been assigned a value) and false otherwise */
  public boolean isSetInvalidWriteIds() {
    return this.invalidWriteIds != null;
  }

  public void setInvalidWriteIdsIsSet(boolean value) {
    if (!value) {
      this.invalidWriteIds = null;
    }
  }

  public long getMinOpenWriteId() {
    return this.minOpenWriteId;
  }

  public void setMinOpenWriteId(long minOpenWriteId) {
    this.minOpenWriteId = minOpenWriteId;
    setMinOpenWriteIdIsSet(true);
  }

  public void unsetMinOpenWriteId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MINOPENWRITEID_ISSET_ID);
  }

  /** Returns true if field minOpenWriteId is set (has been assigned a value) and false otherwise */
  public boolean isSetMinOpenWriteId() {
    return EncodingUtils.testBit(__isset_bitfield, __MINOPENWRITEID_ISSET_ID);
  }

  public void setMinOpenWriteIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MINOPENWRITEID_ISSET_ID, value);
  }

  public byte[] getAbortedBits() {
    setAbortedBits(org.apache.thrift.TBaseHelper.rightSize(abortedBits));
    return abortedBits == null ? null : abortedBits.array();
  }

  public ByteBuffer bufferForAbortedBits() {
    return org.apache.thrift.TBaseHelper.copyBinary(abortedBits);
  }

  public void setAbortedBits(byte[] abortedBits) {
    this.abortedBits = abortedBits == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(abortedBits, abortedBits.length));
  }

  public void setAbortedBits(ByteBuffer abortedBits) {
    this.abortedBits = org.apache.thrift.TBaseHelper.copyBinary(abortedBits);
  }

  public void unsetAbortedBits() {
    this.abortedBits = null;
  }

  /** Returns true if field abortedBits is set (has been assigned a value) and false otherwise */
  public boolean isSetAbortedBits() {
    return this.abortedBits != null;
  }

  public void setAbortedBitsIsSet(boolean value) {
    if (!value) {
      this.abortedBits = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FULL_TABLE_NAME:
      if (value == null) {
        unsetFullTableName();
      } else {
        setFullTableName((String)value);
      }
      break;

    case WRITE_ID_HIGH_WATER_MARK:
      if (value == null) {
        unsetWriteIdHighWaterMark();
      } else {
        setWriteIdHighWaterMark((Long)value);
      }
      break;

    case INVALID_WRITE_IDS:
      if (value == null) {
        unsetInvalidWriteIds();
      } else {
        setInvalidWriteIds((List<Long>)value);
      }
      break;

    case MIN_OPEN_WRITE_ID:
      if (value == null) {
        unsetMinOpenWriteId();
      } else {
        setMinOpenWriteId((Long)value);
      }
      break;

    case ABORTED_BITS:
      if (value == null) {
        unsetAbortedBits();
      } else {
        setAbortedBits((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FULL_TABLE_NAME:
      return getFullTableName();

    case WRITE_ID_HIGH_WATER_MARK:
      return getWriteIdHighWaterMark();

    case INVALID_WRITE_IDS:
      return getInvalidWriteIds();

    case MIN_OPEN_WRITE_ID:
      return getMinOpenWriteId();

    case ABORTED_BITS:
      return getAbortedBits();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FULL_TABLE_NAME:
      return isSetFullTableName();
    case WRITE_ID_HIGH_WATER_MARK:
      return isSetWriteIdHighWaterMark();
    case INVALID_WRITE_IDS:
      return isSetInvalidWriteIds();
    case MIN_OPEN_WRITE_ID:
      return isSetMinOpenWriteId();
    case ABORTED_BITS:
      return isSetAbortedBits();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableValidWriteIds)
      return this.equals((TableValidWriteIds)that);
    return false;
  }

  public boolean equals(TableValidWriteIds that) {
    if (that == null)
      return false;

    boolean this_present_fullTableName = true && this.isSetFullTableName();
    boolean that_present_fullTableName = true && that.isSetFullTableName();
    if (this_present_fullTableName || that_present_fullTableName) {
      if (!(this_present_fullTableName && that_present_fullTableName))
        return false;
      if (!this.fullTableName.equals(that.fullTableName))
        return false;
    }

    boolean this_present_writeIdHighWaterMark = true;
    boolean that_present_writeIdHighWaterMark = true;
    if (this_present_writeIdHighWaterMark || that_present_writeIdHighWaterMark) {
      if (!(this_present_writeIdHighWaterMark && that_present_writeIdHighWaterMark))
        return false;
      if (this.writeIdHighWaterMark != that.writeIdHighWaterMark)
        return false;
    }

    boolean this_present_invalidWriteIds = true && this.isSetInvalidWriteIds();
    boolean that_present_invalidWriteIds = true && that.isSetInvalidWriteIds();
    if (this_present_invalidWriteIds || that_present_invalidWriteIds) {
      if (!(this_present_invalidWriteIds && that_present_invalidWriteIds))
        return false;
      if (!this.invalidWriteIds.equals(that.invalidWriteIds))
        return false;
    }

    boolean this_present_minOpenWriteId = true && this.isSetMinOpenWriteId();
    boolean that_present_minOpenWriteId = true && that.isSetMinOpenWriteId();
    if (this_present_minOpenWriteId || that_present_minOpenWriteId) {
      if (!(this_present_minOpenWriteId && that_present_minOpenWriteId))
        return false;
      if (this.minOpenWriteId != that.minOpenWriteId)
        return false;
    }

    boolean this_present_abortedBits = true && this.isSetAbortedBits();
    boolean that_present_abortedBits = true && that.isSetAbortedBits();
    if (this_present_abortedBits || that_present_abortedBits) {
      if (!(this_present_abortedBits && that_present_abortedBits))
        return false;
      if (!this.abortedBits.equals(that.abortedBits))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fullTableName = true && (isSetFullTableName());
    list.add(present_fullTableName);
    if (present_fullTableName)
      list.add(fullTableName);

    boolean present_writeIdHighWaterMark = true;
    list.add(present_writeIdHighWaterMark);
    if (present_writeIdHighWaterMark)
      list.add(writeIdHighWaterMark);

    boolean present_invalidWriteIds = true && (isSetInvalidWriteIds());
    list.add(present_invalidWriteIds);
    if (present_invalidWriteIds)
      list.add(invalidWriteIds);

    boolean present_minOpenWriteId = true && (isSetMinOpenWriteId());
    list.add(present_minOpenWriteId);
    if (present_minOpenWriteId)
      list.add(minOpenWriteId);

    boolean present_abortedBits = true && (isSetAbortedBits());
    list.add(present_abortedBits);
    if (present_abortedBits)
      list.add(abortedBits);

    return list.hashCode();
  }

  @Override
  public int compareTo(TableValidWriteIds other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFullTableName()).compareTo(other.isSetFullTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFullTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fullTableName, other.fullTableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteIdHighWaterMark()).compareTo(other.isSetWriteIdHighWaterMark());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteIdHighWaterMark()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeIdHighWaterMark, other.writeIdHighWaterMark);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInvalidWriteIds()).compareTo(other.isSetInvalidWriteIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvalidWriteIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.invalidWriteIds, other.invalidWriteIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMinOpenWriteId()).compareTo(other.isSetMinOpenWriteId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinOpenWriteId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minOpenWriteId, other.minOpenWriteId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAbortedBits()).compareTo(other.isSetAbortedBits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAbortedBits()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.abortedBits, other.abortedBits);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TableValidWriteIds(");
    boolean first = true;

    sb.append("fullTableName:");
    if (this.fullTableName == null) {
      sb.append("null");
    } else {
      sb.append(this.fullTableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("writeIdHighWaterMark:");
    sb.append(this.writeIdHighWaterMark);
    first = false;
    if (!first) sb.append(", ");
    sb.append("invalidWriteIds:");
    if (this.invalidWriteIds == null) {
      sb.append("null");
    } else {
      sb.append(this.invalidWriteIds);
    }
    first = false;
    if (isSetMinOpenWriteId()) {
      if (!first) sb.append(", ");
      sb.append("minOpenWriteId:");
      sb.append(this.minOpenWriteId);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("abortedBits:");
    if (this.abortedBits == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.abortedBits, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetFullTableName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fullTableName' is unset! Struct:" + toString());
    }

    if (!isSetWriteIdHighWaterMark()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'writeIdHighWaterMark' is unset! Struct:" + toString());
    }

    if (!isSetInvalidWriteIds()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'invalidWriteIds' is unset! Struct:" + toString());
    }

    if (!isSetAbortedBits()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'abortedBits' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TableValidWriteIdsStandardSchemeFactory implements SchemeFactory {
    public TableValidWriteIdsStandardScheme getScheme() {
      return new TableValidWriteIdsStandardScheme();
    }
  }

  private static class TableValidWriteIdsStandardScheme extends StandardScheme<TableValidWriteIds> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TableValidWriteIds struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FULL_TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fullTableName = iprot.readString();
              struct.setFullTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WRITE_ID_HIGH_WATER_MARK
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.writeIdHighWaterMark = iprot.readI64();
              struct.setWriteIdHighWaterMarkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INVALID_WRITE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list610 = iprot.readListBegin();
                struct.invalidWriteIds = new ArrayList<Long>(_list610.size);
                long _elem611;
                for (int _i612 = 0; _i612 < _list610.size; ++_i612)
                {
                  _elem611 = iprot.readI64();
                  struct.invalidWriteIds.add(_elem611);
                }
                iprot.readListEnd();
              }
              struct.setInvalidWriteIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MIN_OPEN_WRITE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.minOpenWriteId = iprot.readI64();
              struct.setMinOpenWriteIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ABORTED_BITS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.abortedBits = iprot.readBinary();
              struct.setAbortedBitsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TableValidWriteIds struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fullTableName != null) {
        oprot.writeFieldBegin(FULL_TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.fullTableName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WRITE_ID_HIGH_WATER_MARK_FIELD_DESC);
      oprot.writeI64(struct.writeIdHighWaterMark);
      oprot.writeFieldEnd();
      if (struct.invalidWriteIds != null) {
        oprot.writeFieldBegin(INVALID_WRITE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.invalidWriteIds.size()));
          for (long _iter613 : struct.invalidWriteIds)
          {
            oprot.writeI64(_iter613);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetMinOpenWriteId()) {
        oprot.writeFieldBegin(MIN_OPEN_WRITE_ID_FIELD_DESC);
        oprot.writeI64(struct.minOpenWriteId);
        oprot.writeFieldEnd();
      }
      if (struct.abortedBits != null) {
        oprot.writeFieldBegin(ABORTED_BITS_FIELD_DESC);
        oprot.writeBinary(struct.abortedBits);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableValidWriteIdsTupleSchemeFactory implements SchemeFactory {
    public TableValidWriteIdsTupleScheme getScheme() {
      return new TableValidWriteIdsTupleScheme();
    }
  }

  private static class TableValidWriteIdsTupleScheme extends TupleScheme<TableValidWriteIds> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TableValidWriteIds struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.fullTableName);
      oprot.writeI64(struct.writeIdHighWaterMark);
      {
        oprot.writeI32(struct.invalidWriteIds.size());
        for (long _iter614 : struct.invalidWriteIds)
        {
          oprot.writeI64(_iter614);
        }
      }
      oprot.writeBinary(struct.abortedBits);
      BitSet optionals = new BitSet();
      if (struct.isSetMinOpenWriteId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMinOpenWriteId()) {
        oprot.writeI64(struct.minOpenWriteId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TableValidWriteIds struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.fullTableName = iprot.readString();
      struct.setFullTableNameIsSet(true);
      struct.writeIdHighWaterMark = iprot.readI64();
      struct.setWriteIdHighWaterMarkIsSet(true);
      {
        org.apache.thrift.protocol.TList _list615 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.invalidWriteIds = new ArrayList<Long>(_list615.size);
        long _elem616;
        for (int _i617 = 0; _i617 < _list615.size; ++_i617)
        {
          _elem616 = iprot.readI64();
          struct.invalidWriteIds.add(_elem616);
        }
      }
      struct.setInvalidWriteIdsIsSet(true);
      struct.abortedBits = iprot.readBinary();
      struct.setAbortedBitsIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.minOpenWriteId = iprot.readI64();
        struct.setMinOpenWriteIdIsSet(true);
      }
    }
  }

}

