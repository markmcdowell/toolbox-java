// automatically generated by the FlatBuffers compiler, do not modify

package com.reactivemarkets.encoding.fbs;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Asset extends Table {
    public static Asset getRootAsAsset(ByteBuffer _bb) {
        return getRootAsAsset(_bb, new Asset());
    }

    public static Asset getRootAsAsset(ByteBuffer _bb, Asset obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createAsset(FlatBufferBuilder builder,
                                  short id,
                                  int symbolOffset,
                                  int displayOffset,
                                  short asset_type) {
        builder.startObject(4);
        Asset.addDisplay(builder, displayOffset);
        Asset.addSymbol(builder, symbolOffset);
        Asset.addAssetType(builder, asset_type);
        Asset.addId(builder, id);
        return Asset.endAsset(builder);
    }

    public static void startAsset(FlatBufferBuilder builder) {
        builder.startObject(4);
    }

    public static void addId(FlatBufferBuilder builder, short id) {
        builder.addShort(0, id, 0);
    }

    public static void addSymbol(FlatBufferBuilder builder, int symbolOffset) {
        builder.addOffset(1, symbolOffset, 0);
    }

    public static void addDisplay(FlatBufferBuilder builder, int displayOffset) {
        builder.addOffset(2, displayOffset, 0);
    }

    public static void addAssetType(FlatBufferBuilder builder, short assetType) {
        builder.addShort(3, assetType, 0);
    }

    public static int endAsset(FlatBufferBuilder builder) {
        int o = builder.endObject();
        builder.required(o, 6);  // symbol
        builder.required(o, 8);  // display
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
        vtable_start = bb_pos - bb.getInt(bb_pos);
        vtable_size = bb.getShort(vtable_start);
    }

    public Asset __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public short id() {
        int o = __offset(4);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }

    public String symbol() {
        int o = __offset(6);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer symbolAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer symbolInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 6, 1);
    }

    public String display() {
        int o = __offset(8);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer displayAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer displayInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 8, 1);
    }

    public short assetType() {
        int o = __offset(10);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }
}
